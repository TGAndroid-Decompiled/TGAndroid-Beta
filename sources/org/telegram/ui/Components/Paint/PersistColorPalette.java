package org.telegram.ui.Components.Paint;

import android.content.SharedPreferences;
import androidx.recyclerview.widget.DiffUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;

public final class PersistColorPalette {
    public static final int COLORS_COUNT;
    public static final List DEFAULT_MODIFIABLE_COLORS;
    public static final int MODIFIABLE_COLORS_COUNT;
    public static final List PRESET_COLORS;
    public static final int PRESET_COLORS_COUNT;
    public static final PersistColorPalette[] instances;
    public final HashMap brushColor;
    public final ArrayList colors;
    public int currentAlignment;
    public int currentBrush;
    public int currentTextType;
    public String currentTypeface;
    public float currentWeight;
    public boolean fillShapes;
    public boolean inTextMode;
    public final SharedPreferences mConfig;
    public boolean needSaveBrushColor;
    public List pendingChange;

    static {
        List listAsList = Arrays.asList(-2645892, -8409090, -5926949, -2386514, -4531041);
        DEFAULT_MODIFIABLE_COLORS = listAsList;
        List listAsList2 = Arrays.asList(-47814, -30208, -10742, -13318311, -10230046, -16087809, -4236558, -16777216, -1);
        PRESET_COLORS = listAsList2;
        int size = listAsList.size();
        MODIFIABLE_COLORS_COUNT = size;
        int size2 = listAsList2.size();
        PRESET_COLORS_COUNT = size2;
        COLORS_COUNT = size + size2;
        instances = new PersistColorPalette[4];
    }

    public PersistColorPalette(int i) {
        int i2 = COLORS_COUNT;
        this.colors = new ArrayList(i2);
        this.brushColor = new HashMap(Brush.BRUSHES_LIST.size());
        this.pendingChange = new ArrayList(i2);
        int i3 = 0;
        SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("photo_color_palette_" + i, 0);
        this.mConfig = sharedPreferences;
        this.currentBrush = sharedPreferences.getInt("brush", 0);
        this.currentWeight = sharedPreferences.getFloat("weight", 0.5f);
        this.currentTypeface = sharedPreferences.getString("typeface", "roboto");
        this.currentAlignment = sharedPreferences.getInt("text_alignment", 0);
        this.currentTextType = sharedPreferences.getInt("text_type", 0);
        this.fillShapes = sharedPreferences.getBoolean("fill_shapes", false);
        int iM = 0;
        while (iM < MODIFIABLE_COLORS_COUNT) {
            iM = LocationController$$ExternalSyntheticOutline0.m((int) this.mConfig.getLong(DiffUtil.m(iM, "color_"), ((Integer) DEFAULT_MODIFIABLE_COLORS.get(iM)).intValue()), iM, 1, this.colors);
        }
        while (true) {
            List list = Brush.BRUSHES_LIST;
            if (i3 >= list.size()) {
                this.brushColor.put(-1, Integer.valueOf((int) this.mConfig.getLong("brush_color_-1", -1L)));
                return;
            } else {
                this.brushColor.put(Integer.valueOf(i3), Integer.valueOf((int) this.mConfig.getLong(DiffUtil.m(i3, "brush_color_"), ((Brush) list.get(i3)).getDefaultColor())));
                i3++;
            }
        }
    }

    public static PersistColorPalette getInstance(int i) {
        PersistColorPalette[] persistColorPaletteArr = instances;
        if (persistColorPaletteArr[i] == null) {
            persistColorPaletteArr[i] = new PersistColorPalette(i);
        }
        return persistColorPaletteArr[i];
    }

    public final void cleanup() {
        this.pendingChange.clear();
        this.pendingChange.addAll(DEFAULT_MODIFIABLE_COLORS);
        SharedPreferences.Editor editorEdit = this.mConfig.edit();
        for (int i = 0; i < Brush.BRUSHES_LIST.size(); i++) {
            editorEdit.remove("brush_color_" + i);
        }
        editorEdit.remove("brush_color_-1");
        this.brushColor.clear();
        editorEdit.apply();
        saveColors();
    }

    public final int getColor(int i) {
        int i2 = COLORS_COUNT;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException("Color palette index should be in range 0 ... " + i2);
        }
        List list = PRESET_COLORS;
        ArrayList arrayList = new ArrayList(list);
        arrayList.addAll(this.colors);
        if (i < arrayList.size()) {
            return ((Integer) arrayList.get(i)).intValue();
        }
        int i3 = PRESET_COLORS_COUNT;
        return i < i3 ? ((Integer) list.get(i)).intValue() : ((Integer) DEFAULT_MODIFIABLE_COLORS.get(i - i3)).intValue();
    }

    public final int getCurrentColor() {
        HashMap map = this.brushColor;
        Integer numValueOf = (Integer) map.get(Integer.valueOf(this.currentBrush));
        if (numValueOf == null) {
            String str = "brush_color_" + this.currentBrush;
            int i = this.currentBrush;
            numValueOf = Integer.valueOf((int) this.mConfig.getLong(str, i == -1 ? -1L : ((Brush) Brush.BRUSHES_LIST.get(i)).getDefaultColor()));
            map.put(Integer.valueOf(this.currentBrush), numValueOf);
        }
        return numValueOf.intValue();
    }

    public final int getCurrentColorPosition() {
        int currentColor = getCurrentColor();
        ArrayList arrayList = new ArrayList(PRESET_COLORS);
        arrayList.addAll(this.colors);
        for (int i = 0; i < arrayList.size(); i++) {
            if (((Integer) arrayList.get(i)).intValue() == currentColor) {
                return i;
            }
        }
        return 0;
    }

    public final void saveColors() {
        if (!this.pendingChange.isEmpty() || this.needSaveBrushColor) {
            SharedPreferences.Editor editorEdit = this.mConfig.edit();
            if (!this.pendingChange.isEmpty()) {
                int i = 0;
                while (i < MODIFIABLE_COLORS_COUNT) {
                    editorEdit.putLong(DiffUtil.m(i, "color_"), ((Integer) (i < this.pendingChange.size() ? this.pendingChange : DEFAULT_MODIFIABLE_COLORS).get(i)).intValue());
                    i++;
                }
                ArrayList arrayList = this.colors;
                arrayList.clear();
                arrayList.addAll(this.pendingChange);
                this.pendingChange.clear();
            }
            if (this.needSaveBrushColor) {
                Integer num = (Integer) this.brushColor.get(Integer.valueOf(this.currentBrush));
                if (num != null) {
                    editorEdit.putLong("brush_color_" + this.currentBrush, num.intValue());
                }
                this.needSaveBrushColor = false;
            }
            editorEdit.apply();
        }
    }

    public final void selectColor(int i, boolean z) {
        ArrayList arrayList = new ArrayList(PRESET_COLORS);
        Collection collection = this.colors;
        arrayList.addAll(collection);
        int iIndexOf = arrayList.indexOf(Integer.valueOf(i));
        HashMap map = this.brushColor;
        if (iIndexOf != -1) {
            if (z) {
                map.put(Integer.valueOf(this.currentBrush), Integer.valueOf(getColor(iIndexOf)));
                this.needSaveBrushColor = true;
                return;
            }
            return;
        }
        if (!this.pendingChange.isEmpty()) {
            collection = this.pendingChange;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        this.pendingChange.clear();
        this.pendingChange.add(Integer.valueOf(i));
        for (int i2 = 0; i2 < arrayList2.size() - 1; i2++) {
            this.pendingChange.add((Integer) arrayList2.get(i2));
        }
        int size = this.pendingChange.size();
        List list = DEFAULT_MODIFIABLE_COLORS;
        if (size < list.size()) {
            for (int size2 = this.pendingChange.size(); size2 < list.size(); size2++) {
                this.pendingChange.add((Integer) list.get(size2));
            }
        } else if (this.pendingChange.size() > list.size()) {
            this.pendingChange = this.pendingChange.subList(0, list.size());
        }
        if (z) {
            map.put(Integer.valueOf(this.currentBrush), Integer.valueOf(i));
            this.needSaveBrushColor = true;
        }
    }

    public final void setCurrentBrush(int i, boolean z) {
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

    public final void setCurrentWeight(float f) {
        this.currentWeight = f;
        this.mConfig.edit().putFloat("weight", f).apply();
    }

    public final void setWeight(String str, float f) {
        this.mConfig.edit().putFloat("weight_" + str, f).apply();
    }
}
