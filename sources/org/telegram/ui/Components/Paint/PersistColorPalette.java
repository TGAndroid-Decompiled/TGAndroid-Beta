package org.telegram.ui.Components.Paint;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.telegram.messenger.ApplicationLoader;
public class PersistColorPalette {
    private static final List<Integer> DEFAULT_COLORS = Arrays.asList(-16777216, -1, -14837249, -16532268, -12994005, -417009, -365034, -1559228, -5091841, -2645892, -5475508, -7319252, -11325921, -8289919);
    private static final Integer DEFAULT_MARKER_COLOR = -16087809;
    private static PersistColorPalette[] instances = new PersistColorPalette[4];
    private int currentAlignment;
    private int currentTextType;
    private String currentTypeface;
    private float currentWeight;
    private boolean fillShapes;
    private SharedPreferences mConfig;
    private List<Integer> colors = new ArrayList(14);
    private List<Integer> pendingChange = new ArrayList(14);

    public PersistColorPalette(int i) {
        Context context = ApplicationLoader.applicationContext;
        SharedPreferences sharedPreferences = context.getSharedPreferences("photo_color_palette_" + i, 0);
        this.mConfig = sharedPreferences;
        sharedPreferences.getInt("brush", 0);
        this.currentWeight = this.mConfig.getFloat("weight", 0.5f);
        this.currentTypeface = this.mConfig.getString("typeface", "roboto");
        this.currentAlignment = this.mConfig.getInt("text_alignment", 0);
        this.currentTextType = this.mConfig.getInt("text_type", 0);
        this.fillShapes = this.mConfig.getBoolean("fill_shapes", false);
        loadColors();
    }

    public static PersistColorPalette getInstance(int i) {
        PersistColorPalette[] persistColorPaletteArr = instances;
        if (persistColorPaletteArr[i] == null) {
            persistColorPaletteArr[i] = new PersistColorPalette(i);
        }
        return instances[i];
    }

    public int getCurrentTextType() {
        return this.currentTextType;
    }

    public void setCurrentTextType(int i) {
        this.currentTextType = i;
        this.mConfig.edit().putInt("text_type", i).apply();
    }

    public int getCurrentAlignment() {
        return this.currentAlignment;
    }

    public void setCurrentAlignment(int i) {
        this.currentAlignment = i;
        this.mConfig.edit().putInt("text_alignment", i).apply();
    }

    public String getCurrentTypeface() {
        return this.currentTypeface;
    }

    public void setCurrentTypeface(String str) {
        this.currentTypeface = str;
        this.mConfig.edit().putString("typeface", str).apply();
    }

    public float getWeight(String str, float f) {
        SharedPreferences sharedPreferences = this.mConfig;
        return sharedPreferences.getFloat("weight_" + str, f);
    }

    public void setWeight(String str, float f) {
        SharedPreferences.Editor edit = this.mConfig.edit();
        edit.putFloat("weight_" + str, f).apply();
    }

    public float getCurrentWeight() {
        return this.currentWeight;
    }

    public void setCurrentWeight(float f) {
        this.currentWeight = f;
        this.mConfig.edit().putFloat("weight", f).apply();
    }

    public void setCurrentBrush(int i) {
        this.mConfig.edit().putInt("brush", i).apply();
    }

    public boolean getFillShapes() {
        return this.fillShapes;
    }

    public void toggleFillShapes() {
        this.fillShapes = !this.fillShapes;
        this.mConfig.edit().putBoolean("fill_shapes", this.fillShapes).apply();
    }

    public void cleanup() {
        this.pendingChange.clear();
        this.pendingChange.addAll(DEFAULT_COLORS);
        saveColors();
    }

    private void checkIndex(int i) {
        if (i < 0 || i >= 14) {
            throw new IndexOutOfBoundsException("Color palette index should be in range 0 ... 14");
        }
    }

    public int getColor(int i) {
        checkIndex(i);
        if (i < 0 || i >= this.colors.size()) {
            if (i >= 0) {
                List<Integer> list = DEFAULT_COLORS;
                if (i < list.size()) {
                    return list.get(i).intValue();
                }
            }
            return DEFAULT_COLORS.get(0).intValue();
        }
        return this.colors.get(i).intValue();
    }

    public void selectColor(int i) {
        int indexOf = this.colors.indexOf(Integer.valueOf(i));
        if (indexOf != -1) {
            selectColorIndex(indexOf);
            return;
        }
        ArrayList arrayList = new ArrayList(this.pendingChange.isEmpty() ? this.colors : this.pendingChange);
        this.pendingChange.clear();
        this.pendingChange.add(Integer.valueOf(i));
        this.pendingChange.addAll(arrayList);
        int size = this.pendingChange.size();
        List<Integer> list = DEFAULT_COLORS;
        if (size < list.size()) {
            int size2 = this.pendingChange.size();
            while (true) {
                List<Integer> list2 = DEFAULT_COLORS;
                if (size2 >= list2.size()) {
                    return;
                }
                this.pendingChange.add(list2.get(size2));
                size2++;
            }
        } else if (this.pendingChange.size() > list.size()) {
            this.pendingChange = this.pendingChange.subList(0, list.size());
        }
    }

    public void selectColorIndex(int i) {
        int intValue = ((i < 0 || i >= this.colors.size()) ? DEFAULT_COLORS : this.colors).get(i).intValue();
        ArrayList arrayList = new ArrayList(this.pendingChange.isEmpty() ? this.colors : this.pendingChange);
        this.pendingChange.clear();
        this.pendingChange.add(Integer.valueOf(intValue));
        for (int i2 = 0; i2 < 14; i2++) {
            if (i2 >= arrayList.size()) {
                this.pendingChange.add(DEFAULT_COLORS.get(i2));
            } else if (((Integer) arrayList.get(i2)).intValue() != intValue) {
                this.pendingChange.add((Integer) arrayList.get(i2));
            }
        }
        int size = this.pendingChange.size();
        List<Integer> list = DEFAULT_COLORS;
        if (size < list.size()) {
            int size2 = this.pendingChange.size();
            while (true) {
                List<Integer> list2 = DEFAULT_COLORS;
                if (size2 >= list2.size()) {
                    return;
                }
                this.pendingChange.add(list2.get(size2));
                size2++;
            }
        } else if (this.pendingChange.size() > list.size()) {
            this.pendingChange = this.pendingChange.subList(0, list.size());
        }
    }

    private void loadColors() {
        for (int i = 0; i < 14; i++) {
            List<Integer> list = this.colors;
            SharedPreferences sharedPreferences = this.mConfig;
            list.add(Integer.valueOf((int) sharedPreferences.getLong("color_" + i, DEFAULT_COLORS.get(i).intValue())));
        }
        this.mConfig.getLong("color_marker", DEFAULT_MARKER_COLOR.intValue());
    }

    public void saveColors() {
        if (this.pendingChange.isEmpty()) {
            return;
        }
        SharedPreferences.Editor edit = this.mConfig.edit();
        int i = 0;
        while (i < 14) {
            edit.putLong("color_" + i, (i < this.pendingChange.size() ? this.pendingChange : DEFAULT_COLORS).get(i).intValue());
            i++;
        }
        edit.apply();
        this.colors.clear();
        this.colors.addAll(this.pendingChange);
        this.pendingChange.clear();
    }
}
