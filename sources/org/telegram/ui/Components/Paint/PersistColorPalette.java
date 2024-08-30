package org.telegram.ui.Components.Paint;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;

public class PersistColorPalette {
    public static final int COLORS_COUNT;
    private static final List DEFAULT_MODIFIABLE_COLORS;
    public static final int MODIFIABLE_COLORS_COUNT;
    private static final List PRESET_COLORS;
    public static final int PRESET_COLORS_COUNT;
    private static PersistColorPalette[] instances;
    private final HashMap brushColor;
    private final List colors;
    private int currentAlignment;
    private int currentBrush;
    private int currentTextType;
    private String currentTypeface;
    private float currentWeight;
    private boolean fillShapes;
    private boolean inTextMode;
    private final SharedPreferences mConfig;
    private boolean needSaveBrushColor;
    private List pendingChange;

    static {
        List asList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        DEFAULT_MODIFIABLE_COLORS = asList;
        List asList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        PRESET_COLORS = asList2;
        int size = asList.size();
        MODIFIABLE_COLORS_COUNT = size;
        int size2 = asList2.size();
        PRESET_COLORS_COUNT = size2;
        COLORS_COUNT = size + size2;
        instances = new PersistColorPalette[4];
    }

    public PersistColorPalette(int i) {
        int i2 = COLORS_COUNT;
        this.colors = new ArrayList(i2);
        this.brushColor = new HashMap(Brush.BRUSHES_LIST.size());
        this.pendingChange = new ArrayList(i2);
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i, 0);
        this.mConfig = sharedPreferences;
        this.currentBrush = sharedPreferences.getInt("brush", 0);
        this.currentWeight = sharedPreferences.getFloat("weight", 0.5f);
        this.currentTypeface = sharedPreferences.getString("typeface", "roboto");
        this.currentAlignment = sharedPreferences.getInt("text_alignment", 0);
        this.currentTextType = sharedPreferences.getInt("text_type", 0);
        this.fillShapes = sharedPreferences.getBoolean("fill_shapes", false);
        loadColors();
    }

    private void checkIndex(int i) {
        if (i < 0 || i >= COLORS_COUNT) {
            throw new IndexOutOfBoundsException("Color palette index should be in range 0 ... " + COLORS_COUNT);
        }
    }

    private List getAllColors() {
        ArrayList arrayList = new ArrayList(PRESET_COLORS);
        arrayList.addAll(this.colors);
        return arrayList;
    }

    public static PersistColorPalette getInstance(int i) {
        PersistColorPalette[] persistColorPaletteArr = instances;
        if (persistColorPaletteArr[i] == null) {
            persistColorPaletteArr[i] = new PersistColorPalette(i);
        }
        return instances[i];
    }

    private void loadColors() {
        for (int i = 0; i < MODIFIABLE_COLORS_COUNT; i++) {
            this.colors.add(Integer.valueOf((int) this.mConfig.getLong("color_" + i, ((Integer) DEFAULT_MODIFIABLE_COLORS.get(i)).intValue())));
        }
        for (int i2 = 0; i2 < Brush.BRUSHES_LIST.size(); i2++) {
            this.brushColor.put(Integer.valueOf(i2), Integer.valueOf((int) this.mConfig.getLong("brush_color_" + i2, ((Brush) Brush.BRUSHES_LIST.get(i2)).getDefaultColor())));
        }
        this.brushColor.put(-1, Integer.valueOf((int) this.mConfig.getLong("brush_color_-1", -1L)));
    }

    public void cleanup() {
        this.pendingChange.clear();
        this.pendingChange.addAll(DEFAULT_MODIFIABLE_COLORS);
        SharedPreferences.Editor edit = this.mConfig.edit();
        for (int i = 0; i < Brush.BRUSHES_LIST.size(); i++) {
            edit.remove("brush_color_" + i);
        }
        edit.remove("brush_color_-1");
        this.brushColor.clear();
        edit.apply();
        saveColors();
    }

    public int getColor(int i) {
        Object obj;
        checkIndex(i);
        List allColors = getAllColors();
        if (i >= allColors.size()) {
            int i2 = PRESET_COLORS_COUNT;
            if (i >= i2) {
                obj = DEFAULT_MODIFIABLE_COLORS.get(i - i2);
                return ((Integer) obj).intValue();
            }
            allColors = PRESET_COLORS;
        }
        obj = allColors.get(i);
        return ((Integer) obj).intValue();
    }

    public int getCurrentAlignment() {
        return this.currentAlignment;
    }

    public int getCurrentColor() {
        Integer num = (Integer) this.brushColor.get(Integer.valueOf(this.currentBrush));
        if (num == null) {
            num = Integer.valueOf((int) this.mConfig.getLong("brush_color_" + this.currentBrush, this.currentBrush == -1 ? -1L : ((Brush) Brush.BRUSHES_LIST.get(r2)).getDefaultColor()));
            this.brushColor.put(Integer.valueOf(this.currentBrush), num);
        }
        return num.intValue();
    }

    public int getCurrentColorPosition() {
        int currentColor = getCurrentColor();
        List allColors = getAllColors();
        for (int i = 0; i < allColors.size(); i++) {
            if (((Integer) allColors.get(i)).intValue() == currentColor) {
                return i;
            }
        }
        return 0;
    }

    public int getCurrentTextType() {
        return this.currentTextType;
    }

    public String getCurrentTypeface() {
        return this.currentTypeface;
    }

    public float getCurrentWeight() {
        return this.currentWeight;
    }

    public boolean getFillShapes() {
        return this.fillShapes;
    }

    public float getWeight(String str, float f) {
        return this.mConfig.getFloat("weight_" + str, f);
    }

    public void resetCurrentColor() {
        setCurrentBrush(0);
    }

    public void saveColors() {
        if (!this.pendingChange.isEmpty() || this.needSaveBrushColor) {
            SharedPreferences.Editor edit = this.mConfig.edit();
            if (!this.pendingChange.isEmpty()) {
                int i = 0;
                while (i < MODIFIABLE_COLORS_COUNT) {
                    edit.putLong("color_" + i, ((Integer) (i < this.pendingChange.size() ? this.pendingChange : DEFAULT_MODIFIABLE_COLORS).get(i)).intValue());
                    i++;
                }
                this.colors.clear();
                this.colors.addAll(this.pendingChange);
                this.pendingChange.clear();
            }
            if (this.needSaveBrushColor) {
                if (((Integer) this.brushColor.get(Integer.valueOf(this.currentBrush))) != null) {
                    edit.putLong("brush_color_" + this.currentBrush, r1.intValue());
                }
                this.needSaveBrushColor = false;
            }
            edit.apply();
        }
    }

    public void selectColor(int i) {
        selectColor(i, true);
    }

    public void selectColor(int i, boolean z) {
        int indexOf = getAllColors().indexOf(Integer.valueOf(i));
        if (indexOf != -1) {
            if (z) {
                setCurrentBrushColorByColorIndex(indexOf);
                return;
            }
            return;
        }
        ArrayList arrayList = new ArrayList(this.pendingChange.isEmpty() ? this.colors : this.pendingChange);
        this.pendingChange.clear();
        this.pendingChange.add(Integer.valueOf(i));
        for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
            this.pendingChange.add((Integer) arrayList.get(i2));
        }
        int size = this.pendingChange.size();
        List list = DEFAULT_MODIFIABLE_COLORS;
        if (size < list.size()) {
            int size2 = this.pendingChange.size();
            while (true) {
                List list2 = DEFAULT_MODIFIABLE_COLORS;
                if (size2 >= list2.size()) {
                    break;
                }
                this.pendingChange.add((Integer) list2.get(size2));
                size2++;
            }
        } else if (this.pendingChange.size() > list.size()) {
            this.pendingChange = this.pendingChange.subList(0, list.size());
        }
        if (z) {
            this.brushColor.put(Integer.valueOf(this.currentBrush), Integer.valueOf(i));
            this.needSaveBrushColor = true;
        }
    }

    public void setCurrentAlignment(int i) {
        this.currentAlignment = i;
        this.mConfig.edit().putInt("text_alignment", i).apply();
    }

    public void setCurrentBrush(int i) {
        setCurrentBrush(i, true);
    }

    public void setCurrentBrush(int i, boolean z) {
        this.currentBrush = i;
        if (z) {
            this.mConfig.edit().putInt("brush", i).apply();
        }
        Integer num = (Integer) this.brushColor.get(Integer.valueOf(i));
        if (num != null) {
            selectColor(num.intValue(), false);
            saveColors();
        }
    }

    public void setCurrentBrushColorByColorIndex(int i) {
        this.brushColor.put(Integer.valueOf(this.currentBrush), Integer.valueOf(getColor(i)));
        this.needSaveBrushColor = true;
    }

    public void setCurrentTextType(int i) {
        this.currentTextType = i;
        this.mConfig.edit().putInt("text_type", i).apply();
    }

    public void setCurrentTypeface(String str) {
        this.currentTypeface = str;
        this.mConfig.edit().putString("typeface", str).apply();
    }

    public void setCurrentWeight(float f) {
        this.currentWeight = f;
        this.mConfig.edit().putFloat("weight", f).apply();
    }

    public void setInTextMode(boolean z) {
        if (this.inTextMode != z) {
            this.inTextMode = z;
            setCurrentBrush(z ? -1 : this.mConfig.getInt("brush", 0), false);
        }
    }

    public void setWeight(String str, float f) {
        this.mConfig.edit().putFloat("weight_" + str, f).apply();
    }

    public void toggleFillShapes() {
        this.fillShapes = !this.fillShapes;
        this.mConfig.edit().putBoolean("fill_shapes", this.fillShapes).apply();
    }
}
