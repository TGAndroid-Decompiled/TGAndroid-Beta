package org.telegram.ui.ActionBar;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannedString;
import android.text.TextPaint;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.telegram.messenger.FileLog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.TypefaceSpan;

public class ThemeDescription {
    public static int FLAG_AB_AM_BACKGROUND = 1048576;
    public static int FLAG_AB_AM_ITEMSCOLOR = 512;
    public static int FLAG_AB_AM_SELECTORCOLOR = 4194304;
    public static int FLAG_AB_AM_TOPBACKGROUND = 2097152;
    public static int FLAG_AB_ITEMSCOLOR = 64;
    public static int FLAG_AB_SEARCH = 134217728;
    public static int FLAG_AB_SEARCHPLACEHOLDER = 67108864;
    public static int FLAG_AB_SELECTORCOLOR = 256;
    public static int FLAG_AB_SUBMENUBACKGROUND = Integer.MIN_VALUE;
    public static int FLAG_AB_SUBMENUITEM = 1073741824;
    public static int FLAG_AB_SUBTITLECOLOR = 1024;
    public static int FLAG_AB_TITLECOLOR = 128;
    public static int FLAG_BACKGROUND = 1;
    public static int FLAG_BACKGROUNDFILTER = 32;
    public static int FLAG_CELLBACKGROUNDCOLOR = 16;
    public static int FLAG_CHECKBOX = 8192;
    public static int FLAG_CHECKBOXCHECK = 16384;
    public static int FLAG_CHECKTAG = 262144;
    public static int FLAG_CURSORCOLOR = 16777216;
    public static int FLAG_DRAWABLESELECTEDSTATE = 65536;
    public static int FLAG_FASTSCROLL = 33554432;
    public static int FLAG_HINTTEXTCOLOR = 8388608;
    public static int FLAG_IMAGECOLOR = 8;
    public static int FLAG_LINKCOLOR = 2;
    public static int FLAG_LISTGLOWCOLOR = 32768;
    public static int FLAG_PROGRESSBAR = 2048;
    public static int FLAG_SECTIONS = 524288;
    public static int FLAG_SELECTOR = 4096;
    public static int FLAG_SELECTORWHITE = 268435456;
    public static int FLAG_SERVICEBACKGROUND = 536870912;
    public static int FLAG_TEXTCOLOR = 4;
    public static int FLAG_USEBACKGROUNDDRAWABLE = 131072;
    private int alphaOverride;
    private HashMap cachedFields;
    private int changeFlags;
    private int currentColor;
    private int currentKey;
    private ThemeDescriptionDelegate delegate;
    private Drawable[] drawablesToUpdate;
    private Class[] listClasses;
    private String[] listClassesFieldName;
    private String lottieLayerName;
    private HashMap notFoundCachedFields;
    private Paint[] paintToUpdate;
    private int previousColor;
    private boolean[] previousIsDefault;
    public Theme.ResourcesProvider resourcesProvider;
    private View viewToInvalidate;

    public interface ThemeDescriptionDelegate {

        public abstract class CC {
            public static void $default$onAnimationProgress(ThemeDescriptionDelegate themeDescriptionDelegate, float f) {
            }
        }

        void didSetColor();

        void onAnimationProgress(float f);
    }

    public ThemeDescription(View view, int i, Class[] clsArr, Paint[] paintArr, Drawable[] drawableArr, ThemeDescriptionDelegate themeDescriptionDelegate, int i2, Object obj) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        this.paintToUpdate = paintArr;
        this.drawablesToUpdate = drawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.delegate = themeDescriptionDelegate;
        if (view instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view).getEditText();
        }
    }

    public ThemeDescription(View view, int i, Class[] clsArr, Paint paint, Drawable[] drawableArr, ThemeDescriptionDelegate themeDescriptionDelegate, int i2) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        if (paint != null) {
            this.paintToUpdate = new Paint[]{paint};
        }
        this.drawablesToUpdate = drawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.delegate = themeDescriptionDelegate;
        if (view instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view).getEditText();
        }
    }

    public ThemeDescription(View view, int i, Class[] clsArr, RLottieDrawable[] rLottieDrawableArr, String str, int i2) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        this.lottieLayerName = str;
        this.drawablesToUpdate = rLottieDrawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        if (view instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view).getEditText();
        }
    }

    public ThemeDescription(View view, int i, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, ThemeDescriptionDelegate themeDescriptionDelegate, int i2) {
        this(view, i, clsArr, strArr, paintArr, drawableArr, -1, themeDescriptionDelegate, i2);
    }

    public ThemeDescription(View view, int i, Class[] clsArr, String[] strArr, Paint[] paintArr, Drawable[] drawableArr, int i2, ThemeDescriptionDelegate themeDescriptionDelegate, int i3) {
        this.previousIsDefault = new boolean[1];
        this.currentKey = i3;
        this.paintToUpdate = paintArr;
        this.drawablesToUpdate = drawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.listClassesFieldName = strArr;
        this.alphaOverride = i2;
        this.delegate = themeDescriptionDelegate;
        this.cachedFields = new HashMap();
        this.notFoundCachedFields = new HashMap();
        View view2 = this.viewToInvalidate;
        if (view2 instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view2).getEditText();
        }
    }

    public ThemeDescription(View view, int i, Class[] clsArr, String[] strArr, String str, int i2) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        this.lottieLayerName = str;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.listClassesFieldName = strArr;
        this.cachedFields = new HashMap();
        this.notFoundCachedFields = new HashMap();
        View view2 = this.viewToInvalidate;
        if (view2 instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view2).getEditText();
        }
    }

    public ThemeDescriptionDelegate setDelegateDisabled() {
        ThemeDescriptionDelegate themeDescriptionDelegate = this.delegate;
        this.delegate = null;
        return themeDescriptionDelegate;
    }

    public void setColor(int i, boolean z) throws NoSuchFieldException, IOException, SecurityException {
        setColor(i, z, true);
    }

    private boolean checkTag(int i, View view) {
        if (i < 0 || view == null) {
            return false;
        }
        Object tag = view.getTag();
        return (tag instanceof Integer) && ((Integer) tag).intValue() == i;
    }

    public void setColor(int r6, boolean r7, boolean r8) throws java.lang.NoSuchFieldException, java.io.IOException, java.lang.SecurityException {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.ThemeDescription.setColor(int, boolean, boolean):void");
    }

    private void processViewColor(View view, int i) {
        boolean z;
        Object background;
        TypefaceSpan[] typefaceSpanArr;
        TypefaceSpan[] typefaceSpanArr2;
        TypefaceSpan[] typefaceSpanArr3;
        int i2 = 0;
        while (true) {
            Class[] clsArr = this.listClasses;
            if (i2 >= clsArr.length) {
                return;
            }
            if (clsArr[i2].isInstance(view)) {
                view.invalidate();
                boolean z2 = true;
                if ((this.changeFlags & FLAG_CHECKTAG) == 0 || checkTag(this.currentKey, view)) {
                    view.invalidate();
                    if (this.listClassesFieldName == null && (this.changeFlags & FLAG_BACKGROUNDFILTER) != 0) {
                        Drawable background2 = view.getBackground();
                        if (background2 != null) {
                            int i3 = this.changeFlags;
                            if ((FLAG_CELLBACKGROUNDCOLOR & i3) != 0) {
                                if (background2 instanceof CombinedDrawable) {
                                    Drawable background3 = ((CombinedDrawable) background2).getBackground();
                                    if (background3 instanceof ColorDrawable) {
                                        ((ColorDrawable) background3).setColor(i);
                                    }
                                }
                            } else {
                                if (background2 instanceof CombinedDrawable) {
                                    background2 = ((CombinedDrawable) background2).getIcon();
                                } else if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                                    Theme.setSelectorDrawableColor(background2, i, (i3 & FLAG_DRAWABLESELECTEDSTATE) != 0);
                                }
                                background2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                            }
                        }
                    } else {
                        int i4 = this.changeFlags;
                        if ((FLAG_CELLBACKGROUNDCOLOR & i4) != 0) {
                            view.setBackgroundColor(i);
                        } else if ((FLAG_TEXTCOLOR & i4) != 0) {
                            if (view instanceof TextView) {
                                ((TextView) view).setTextColor(i);
                            } else if (view instanceof AudioPlayerAlert.ClippingTextViewSwitcher) {
                                int i5 = 0;
                                while (i5 < 2) {
                                    TextView textView = i5 == 0 ? ((AudioPlayerAlert.ClippingTextViewSwitcher) view).getTextView() : ((AudioPlayerAlert.ClippingTextViewSwitcher) view).getNextTextView();
                                    if (textView != null) {
                                        textView.setTextColor(i);
                                    }
                                    i5++;
                                }
                            }
                        } else if ((FLAG_SERVICEBACKGROUND & i4) == 0) {
                            if ((FLAG_SELECTOR & i4) != 0) {
                                view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                            } else if ((i4 & FLAG_SELECTORWHITE) != 0) {
                                view.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                            }
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (this.listClassesFieldName != null) {
                    String str = this.listClasses[i2] + "_" + this.listClassesFieldName[i2];
                    HashMap map = this.notFoundCachedFields;
                    if (map == null || !map.containsKey(str)) {
                        try {
                            Field declaredField = (Field) this.cachedFields.get(str);
                            if (declaredField == null && (declaredField = this.listClasses[i2].getDeclaredField(this.listClassesFieldName[i2])) != null) {
                                declaredField.setAccessible(true);
                                this.cachedFields.put(str, declaredField);
                            }
                            if (declaredField != null && (background = declaredField.get(view)) != null && (z || !(background instanceof View) || checkTag(this.currentKey, (View) background))) {
                                if (background instanceof View) {
                                    ((View) background).invalidate();
                                }
                                if (this.lottieLayerName != null && (background instanceof RLottieImageView)) {
                                    ((RLottieImageView) background).setLayerColor(this.lottieLayerName + ".**", i);
                                }
                                if ((this.changeFlags & FLAG_USEBACKGROUNDDRAWABLE) != 0 && (background instanceof View)) {
                                    background = ((View) background).getBackground();
                                }
                                int i6 = this.changeFlags;
                                if ((FLAG_BACKGROUND & i6) != 0 && (background instanceof View)) {
                                    View view2 = (View) background;
                                    Drawable background4 = view2.getBackground();
                                    if (background4 instanceof MessageBackgroundDrawable) {
                                        ((MessageBackgroundDrawable) background4).setColor(i);
                                        ((MessageBackgroundDrawable) background4).setCustomPaint(null);
                                    } else {
                                        view2.setBackgroundColor(i);
                                    }
                                } else if (background instanceof EditTextCaption) {
                                    if ((FLAG_HINTTEXTCOLOR & i6) != 0) {
                                        ((EditTextCaption) background).setHintColor(i);
                                        ((EditTextCaption) background).setHintTextColor(i);
                                    } else if ((i6 & FLAG_CURSORCOLOR) != 0) {
                                        ((EditTextCaption) background).setCursorColor(i);
                                    } else {
                                        ((EditTextCaption) background).setTextColor(i);
                                    }
                                } else if (background instanceof SimpleTextView) {
                                    if ((i6 & FLAG_LINKCOLOR) != 0) {
                                        ((SimpleTextView) background).setLinkTextColor(i);
                                    } else {
                                        ((SimpleTextView) background).setTextColor(i);
                                    }
                                } else if (background instanceof TextView) {
                                    TextView textView2 = (TextView) background;
                                    if ((FLAG_IMAGECOLOR & i6) != 0) {
                                        Drawable[] compoundDrawables = textView2.getCompoundDrawables();
                                        if (compoundDrawables != null) {
                                            for (Drawable drawable : compoundDrawables) {
                                                if (drawable != null) {
                                                    drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                                }
                                            }
                                        }
                                    } else if ((FLAG_LINKCOLOR & i6) != 0) {
                                        textView2.getPaint().linkColor = i;
                                        textView2.invalidate();
                                    } else if ((i6 & FLAG_FASTSCROLL) != 0) {
                                        CharSequence text = textView2.getText();
                                        if ((text instanceof SpannedString) && (typefaceSpanArr3 = (TypefaceSpan[]) ((SpannedString) text).getSpans(0, text.length(), TypefaceSpan.class)) != null && typefaceSpanArr3.length > 0) {
                                            for (TypefaceSpan typefaceSpan : typefaceSpanArr3) {
                                                typefaceSpan.setColor(i);
                                            }
                                        }
                                    } else {
                                        textView2.setTextColor(i);
                                    }
                                } else if (background instanceof ImageView) {
                                    ImageView imageView = (ImageView) background;
                                    Drawable drawable2 = imageView.getDrawable();
                                    if (drawable2 instanceof CombinedDrawable) {
                                        if ((this.changeFlags & FLAG_BACKGROUNDFILTER) != 0) {
                                            ((CombinedDrawable) drawable2).getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((CombinedDrawable) drawable2).getIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else {
                                        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (background instanceof BackupImageView) {
                                    Drawable staticThumb = ((BackupImageView) background).getImageReceiver().getStaticThumb();
                                    if (staticThumb instanceof CombinedDrawable) {
                                        if ((this.changeFlags & FLAG_BACKGROUNDFILTER) != 0) {
                                            ((CombinedDrawable) staticThumb).getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((CombinedDrawable) staticThumb).getIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (staticThumb != null) {
                                        staticThumb.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (background instanceof Drawable) {
                                    if (background instanceof LetterDrawable) {
                                        if ((i6 & FLAG_BACKGROUNDFILTER) != 0) {
                                            ((LetterDrawable) background).setBackgroundColor(i);
                                        } else {
                                            ((LetterDrawable) background).setColor(i);
                                        }
                                    } else if (background instanceof CombinedDrawable) {
                                        if ((i6 & FLAG_BACKGROUNDFILTER) != 0) {
                                            ((CombinedDrawable) background).getBackground().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((CombinedDrawable) background).getIcon().setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        Drawable drawable3 = (Drawable) background;
                                        if ((i6 & FLAG_DRAWABLESELECTEDSTATE) == 0) {
                                            z2 = false;
                                        }
                                        Theme.setSelectorDrawableColor(drawable3, i, z2);
                                    } else if (background instanceof GradientDrawable) {
                                        ((GradientDrawable) background).setColor(i);
                                    } else {
                                        ((Drawable) background).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (background instanceof CheckBox) {
                                    if ((FLAG_CHECKBOX & i6) != 0) {
                                        ((CheckBox) background).setBackgroundColor(i);
                                    } else if ((i6 & FLAG_CHECKBOXCHECK) != 0) {
                                        ((CheckBox) background).setCheckColor(i);
                                    }
                                } else if (background instanceof Integer) {
                                    declaredField.set(view, Integer.valueOf(i));
                                } else if (background instanceof RadioButton) {
                                    if ((FLAG_CHECKBOX & i6) != 0) {
                                        ((RadioButton) background).setBackgroundColor(i);
                                        ((RadioButton) background).invalidate();
                                    } else if ((i6 & FLAG_CHECKBOXCHECK) != 0) {
                                        ((RadioButton) background).setCheckedColor(i);
                                        ((RadioButton) background).invalidate();
                                    }
                                } else if (background instanceof TextPaint) {
                                    if ((i6 & FLAG_LINKCOLOR) != 0) {
                                        ((TextPaint) background).linkColor = i;
                                    } else {
                                        ((TextPaint) background).setColor(i);
                                    }
                                } else if (background instanceof LineProgressView) {
                                    if ((i6 & FLAG_PROGRESSBAR) != 0) {
                                        ((LineProgressView) background).setProgressColor(i);
                                    } else {
                                        ((LineProgressView) background).setBackColor(i);
                                    }
                                } else if (background instanceof RadialProgressView) {
                                    ((RadialProgressView) background).setProgressColor(i);
                                } else if (background instanceof Paint) {
                                    ((Paint) background).setColor(i);
                                    view.invalidate();
                                } else if (background instanceof SeekBarView) {
                                    if ((i6 & FLAG_PROGRESSBAR) != 0) {
                                        ((SeekBarView) background).setOuterColor(i);
                                    } else {
                                        ((SeekBarView) background).setInnerColor(i);
                                    }
                                } else if (background instanceof AudioPlayerAlert.ClippingTextViewSwitcher) {
                                    if ((FLAG_FASTSCROLL & i6) != 0) {
                                        int i7 = 0;
                                        while (i7 < 2) {
                                            TextView textView3 = i7 == 0 ? ((AudioPlayerAlert.ClippingTextViewSwitcher) background).getTextView() : ((AudioPlayerAlert.ClippingTextViewSwitcher) background).getNextTextView();
                                            if (textView3 != null) {
                                                CharSequence text2 = textView3.getText();
                                                if ((text2 instanceof SpannedString) && (typefaceSpanArr2 = (TypefaceSpan[]) ((SpannedString) text2).getSpans(0, text2.length(), TypefaceSpan.class)) != null && typefaceSpanArr2.length > 0) {
                                                    for (TypefaceSpan typefaceSpan2 : typefaceSpanArr2) {
                                                        typefaceSpan2.setColor(i);
                                                    }
                                                }
                                            }
                                            i7++;
                                        }
                                    } else if ((FLAG_TEXTCOLOR & i6) != 0 && ((i6 & FLAG_CHECKTAG) == 0 || checkTag(this.currentKey, (View) background))) {
                                        int i8 = 0;
                                        while (i8 < 2) {
                                            TextView textView4 = i8 == 0 ? ((AudioPlayerAlert.ClippingTextViewSwitcher) background).getTextView() : ((AudioPlayerAlert.ClippingTextViewSwitcher) background).getNextTextView();
                                            if (textView4 != null) {
                                                textView4.setTextColor(i);
                                                CharSequence text3 = textView4.getText();
                                                if ((text3 instanceof SpannedString) && (typefaceSpanArr = (TypefaceSpan[]) ((SpannedString) text3).getSpans(0, text3.length(), TypefaceSpan.class)) != null && typefaceSpanArr.length > 0) {
                                                    for (TypefaceSpan typefaceSpan3 : typefaceSpanArr) {
                                                        typefaceSpan3.setColor(i);
                                                    }
                                                }
                                            }
                                            i8++;
                                        }
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                            this.notFoundCachedFields.put(str, Boolean.TRUE);
                        }
                    }
                } else if (view instanceof GroupCreateSpan) {
                    ((GroupCreateSpan) view).updateColors();
                }
            }
            i2++;
        }
    }

    public int getCurrentKey() {
        return this.currentKey;
    }

    public void startEditing() {
        int color = Theme.getColor(this.currentKey, this.previousIsDefault);
        this.previousColor = color;
        this.currentColor = color;
    }

    public int getCurrentColor() {
        return this.currentColor;
    }

    public int getSetColor() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        Integer numValueOf = resourcesProvider != null ? Integer.valueOf(resourcesProvider.getColor(this.currentKey)) : null;
        return numValueOf != null ? numValueOf.intValue() : Theme.getColor(this.currentKey);
    }

    public void setAnimatedColor(int i) {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (resourcesProvider != null) {
            resourcesProvider.setAnimatedColor(getCurrentKey(), i);
        } else {
            Theme.setAnimatedColor(getCurrentKey(), i);
        }
    }

    public void setDefaultColor() throws NoSuchFieldException, IOException, SecurityException {
        setColor(Theme.getDefaultColor(this.currentKey), true);
    }

    public void setPreviousColor() throws NoSuchFieldException, IOException, SecurityException {
        setColor(this.previousColor, this.previousIsDefault[0]);
    }

    public String getTitle() {
        return ThemeColors.getStringName(this.currentKey);
    }
}
