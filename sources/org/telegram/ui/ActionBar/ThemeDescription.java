package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.SpannedString;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ChatBigEmptyView;
import org.telegram.ui.Components.CheckBox;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.ContextProgressView;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextEmoji;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LetterDrawable;
import org.telegram.ui.Components.LineProgressView;
import org.telegram.ui.Components.MessageBackgroundDrawable;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RLottieImageView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.RadioButton;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScamDrawable;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UndoView;

public final class ThemeDescription {
    public final int alphaOverride;
    public final HashMap cachedFields;
    public final int changeFlags;
    public final int currentKey;
    public ThemeDescriptionDelegate delegate;
    public final Drawable[] drawablesToUpdate;
    public final Class[] listClasses;
    public final String[] listClassesFieldName;
    public final String lottieLayerName;
    public final HashMap notFoundCachedFields;
    public final Paint[] paintToUpdate;
    public int previousColor;
    public final boolean[] previousIsDefault;
    public Theme.ResourcesProvider resourcesProvider;
    public final View viewToInvalidate;

    public interface ThemeDescriptionDelegate {
        void didSetColor();

        void onAnimationProgress(float f);
    }

    public ThemeDescription(View view, int i, Class[] clsArr, Paint[] paintArr, int i2) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i2;
        this.paintToUpdate = paintArr;
        this.drawablesToUpdate = null;
        this.viewToInvalidate = view;
        this.changeFlags = i;
        this.listClasses = clsArr;
        this.delegate = null;
        if (view instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view).getEditText();
        }
    }

    public static boolean checkTag(int i, View view) {
        if (i >= 0 && view != null) {
            Object tag = view.getTag();
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return true;
            }
        }
        return false;
    }

    public final int getSetColor() {
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        int i = this.currentKey;
        Integer numValueOf = resourcesProvider != null ? Integer.valueOf(resourcesProvider.getColor(i)) : null;
        return numValueOf != null ? numValueOf.intValue() : Theme.getColor(null, i, false);
    }

    public final void processViewColor(int i, View view) {
        boolean z;
        Field declaredField;
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
                int i3 = this.changeFlags;
                int i4 = i3 & 262144;
                int i5 = this.currentKey;
                String[] strArr = this.listClassesFieldName;
                boolean z2 = true;
                if (i4 == 0 || checkTag(i5, view)) {
                    view.invalidate();
                    if (strArr == null && (i3 & 32) != 0) {
                        Drawable background2 = view.getBackground();
                        if (background2 != null) {
                            if ((i3 & 16) == 0) {
                                if (background2 instanceof CombinedDrawable) {
                                    background2 = ((CombinedDrawable) background2).icon;
                                } else if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                                    Theme.setSelectorDrawableColor(background2, i, (i3 & 65536) != 0);
                                }
                                background2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                            } else if (background2 instanceof CombinedDrawable) {
                                Drawable drawable = ((CombinedDrawable) background2).background;
                                if (drawable instanceof ColorDrawable) {
                                    ((ColorDrawable) drawable).setColor(i);
                                }
                            }
                        }
                    } else if ((i3 & 16) != 0) {
                        view.setBackgroundColor(i);
                    } else if ((i3 & 4) != 0) {
                        if (view instanceof TextView) {
                            ((TextView) view).setTextColor(i);
                        } else if (view instanceof AudioPlayerAlert.ClippingTextViewSwitcher) {
                            int i6 = 0;
                            while (i6 < 2) {
                                TextView textView = i6 == 0 ? ((AudioPlayerAlert.ClippingTextViewSwitcher) view).getTextView() : ((AudioPlayerAlert.ClippingTextViewSwitcher) view).getNextTextView();
                                if (textView != null) {
                                    textView.setTextColor(i);
                                }
                                i6++;
                            }
                        }
                    } else if ((536870912 & i3) == 0) {
                        if ((i3 & 4096) != 0) {
                            view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                        } else if ((268435456 & i3) != 0) {
                            view.setBackgroundDrawable(Theme.getSelectorDrawable(true));
                        }
                    }
                    z = true;
                } else {
                    z = false;
                }
                if (strArr != null) {
                    String str = clsArr[i2] + "_" + strArr[i2];
                    HashMap map = this.notFoundCachedFields;
                    if (map == null || !map.containsKey(str)) {
                        HashMap map2 = this.cachedFields;
                        try {
                            Field field = (Field) map2.get(str);
                            if (field == null) {
                                declaredField = clsArr[i2].getDeclaredField(strArr[i2]);
                                if (declaredField != null) {
                                    declaredField.setAccessible(true);
                                    map2.put(str, declaredField);
                                }
                            } else {
                                declaredField = field;
                            }
                            if (declaredField != null && (background = declaredField.get(view)) != null && (z || !(background instanceof View) || checkTag(i5, (View) background))) {
                                if (background instanceof View) {
                                    ((View) background).invalidate();
                                }
                                String str2 = this.lottieLayerName;
                                if (str2 != null && (background instanceof RLottieImageView)) {
                                    ((RLottieImageView) background).setLayerColor(i, str2);
                                }
                                if ((131072 & i3) != 0 && (background instanceof View)) {
                                    background = ((View) background).getBackground();
                                }
                                if ((i3 & 1) != 0 && (background instanceof View)) {
                                    View view2 = (View) background;
                                    Drawable background3 = view2.getBackground();
                                    if (background3 instanceof MessageBackgroundDrawable) {
                                        ((MessageBackgroundDrawable) background3).paint.setColor(i);
                                        ((MessageBackgroundDrawable) background3).customPaint = null;
                                    } else {
                                        view2.setBackgroundColor(i);
                                    }
                                } else if (background instanceof EditTextCaption) {
                                    if ((8388608 & i3) != 0) {
                                        ((EditTextCaption) background).setHintColor(i);
                                        ((EditTextCaption) background).setHintTextColor(i);
                                    } else if ((16777216 & i3) != 0) {
                                        ((EditTextCaption) background).setCursorColor(i);
                                    } else {
                                        ((EditTextCaption) background).setTextColor(i);
                                    }
                                } else if (background instanceof SimpleTextView) {
                                    if ((i3 & 2) != 0) {
                                        ((SimpleTextView) background).setLinkTextColor(i);
                                    } else {
                                        ((SimpleTextView) background).setTextColor(i);
                                    }
                                } else if (background instanceof TextView) {
                                    TextView textView2 = (TextView) background;
                                    if ((i3 & 8) != 0) {
                                        Drawable[] compoundDrawables = textView2.getCompoundDrawables();
                                        if (compoundDrawables != null) {
                                            for (Drawable drawable2 : compoundDrawables) {
                                                if (drawable2 != null) {
                                                    drawable2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                                }
                                            }
                                        }
                                    } else if ((i3 & 2) != 0) {
                                        textView2.getPaint().linkColor = i;
                                        textView2.invalidate();
                                    } else if ((i3 & 33554432) != 0) {
                                        CharSequence text = textView2.getText();
                                        if ((text instanceof SpannedString) && (typefaceSpanArr3 = (TypefaceSpan[]) ((SpannedString) text).getSpans(0, ((SpannedString) text).length(), TypefaceSpan.class)) != null && typefaceSpanArr3.length > 0) {
                                            for (TypefaceSpan typefaceSpan : typefaceSpanArr3) {
                                                typefaceSpan.color = i;
                                            }
                                        }
                                    } else {
                                        textView2.setTextColor(i);
                                    }
                                } else if (background instanceof ImageView) {
                                    ImageView imageView = (ImageView) background;
                                    Drawable drawable3 = imageView.getDrawable();
                                    if (!(drawable3 instanceof CombinedDrawable)) {
                                        imageView.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    } else if ((i3 & 32) != 0) {
                                        ((CombinedDrawable) drawable3).background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    } else {
                                        ((CombinedDrawable) drawable3).icon.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (background instanceof BackupImageView) {
                                    Drawable staticThumb = ((BackupImageView) background).getImageReceiver().getStaticThumb();
                                    if (staticThumb instanceof CombinedDrawable) {
                                        if ((i3 & 32) != 0) {
                                            ((CombinedDrawable) staticThumb).background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((CombinedDrawable) staticThumb).icon.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if (staticThumb != null) {
                                        staticThumb.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (background instanceof Drawable) {
                                    if (background instanceof LetterDrawable) {
                                        if ((i3 & 32) != 0) {
                                            ((LetterDrawable) background).getClass();
                                            LetterDrawable.paint.setColor(i);
                                        } else {
                                            ((LetterDrawable) background).textPaint.setColor(i);
                                        }
                                    } else if (background instanceof CombinedDrawable) {
                                        if ((i3 & 32) != 0) {
                                            ((CombinedDrawable) background).background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        } else {
                                            ((CombinedDrawable) background).icon.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                        }
                                    } else if ((background instanceof StateListDrawable) || (background instanceof RippleDrawable)) {
                                        Drawable drawable4 = (Drawable) background;
                                        if ((i3 & 65536) == 0) {
                                            z2 = false;
                                        }
                                        Theme.setSelectorDrawableColor(drawable4, i, z2);
                                    } else if (background instanceof GradientDrawable) {
                                        ((GradientDrawable) background).setColor(i);
                                    } else {
                                        ((Drawable) background).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                                    }
                                } else if (background instanceof CheckBox) {
                                    if ((i3 & 8192) != 0) {
                                        ((CheckBox) background).setBackgroundColor(i);
                                    } else if ((i3 & 16384) != 0) {
                                        ((CheckBox) background).setCheckColor(i);
                                    }
                                } else if (background instanceof Integer) {
                                    declaredField.set(view, Integer.valueOf(i));
                                } else if (background instanceof RadioButton) {
                                    if ((i3 & 8192) != 0) {
                                        ((RadioButton) background).setBackgroundColor(i);
                                        ((RadioButton) background).invalidate();
                                    } else if ((i3 & 16384) != 0) {
                                        ((RadioButton) background).setCheckedColor(i);
                                        ((RadioButton) background).invalidate();
                                    }
                                } else if (background instanceof TextPaint) {
                                    if ((i3 & 2) != 0) {
                                        ((TextPaint) background).linkColor = i;
                                    } else {
                                        ((TextPaint) background).setColor(i);
                                    }
                                } else if (background instanceof LineProgressView) {
                                    if ((i3 & 2048) != 0) {
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
                                    if ((i3 & 2048) != 0) {
                                        ((SeekBarView) background).setOuterColor(i);
                                    } else {
                                        ((SeekBarView) background).setInnerColor(i);
                                    }
                                } else if (background instanceof AudioPlayerAlert.ClippingTextViewSwitcher) {
                                    if ((i3 & 33554432) != 0) {
                                        int i7 = 0;
                                        while (i7 < 2) {
                                            TextView textView3 = i7 == 0 ? ((AudioPlayerAlert.ClippingTextViewSwitcher) background).getTextView() : ((AudioPlayerAlert.ClippingTextViewSwitcher) background).getNextTextView();
                                            if (textView3 != null) {
                                                CharSequence text2 = textView3.getText();
                                                if ((text2 instanceof SpannedString) && (typefaceSpanArr2 = (TypefaceSpan[]) ((SpannedString) text2).getSpans(0, ((SpannedString) text2).length(), TypefaceSpan.class)) != null && typefaceSpanArr2.length > 0) {
                                                    for (TypefaceSpan typefaceSpan2 : typefaceSpanArr2) {
                                                        typefaceSpan2.color = i;
                                                    }
                                                }
                                            }
                                            i7++;
                                        }
                                    } else if ((i3 & 4) != 0 && ((i3 & 262144) == 0 || checkTag(i5, (View) background))) {
                                        int i8 = 0;
                                        while (i8 < 2) {
                                            TextView textView4 = i8 == 0 ? ((AudioPlayerAlert.ClippingTextViewSwitcher) background).getTextView() : ((AudioPlayerAlert.ClippingTextViewSwitcher) background).getNextTextView();
                                            if (textView4 != null) {
                                                textView4.setTextColor(i);
                                                CharSequence text3 = textView4.getText();
                                                if ((text3 instanceof SpannedString) && (typefaceSpanArr = (TypefaceSpan[]) ((SpannedString) text3).getSpans(0, ((SpannedString) text3).length(), TypefaceSpan.class)) != null && typefaceSpanArr.length > 0) {
                                                    for (TypefaceSpan typefaceSpan3 : typefaceSpanArr) {
                                                        typefaceSpan3.color = i;
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
                            map.put(str, Boolean.TRUE);
                        }
                    }
                } else if (view instanceof GroupCreateSpan) {
                    ((GroupCreateSpan) view).updateColors();
                }
            }
            i2++;
        }
    }

    public final void setColor(int i, boolean z, boolean z2) {
        RecyclerListView.FastScroll fastScroll;
        Drawable[] compoundDrawables;
        int i2 = this.currentKey;
        if (z2) {
            Theme.setColor(i2, i, z);
        }
        int i3 = this.alphaOverride;
        if (i3 > 0) {
            i = Color.argb(i3, Color.red(i), Color.green(i), Color.blue(i));
        }
        Paint[] paintArr = this.paintToUpdate;
        int i4 = this.changeFlags;
        if (paintArr != null) {
            for (int i5 = 0; i5 < paintArr.length; i5++) {
                if ((i4 & 2) != 0) {
                    Paint paint = paintArr[i5];
                    if (paint instanceof TextPaint) {
                        ((TextPaint) paint).linkColor = i;
                    } else {
                        paintArr[i5].setColor(i);
                    }
                } else {
                    paintArr[i5].setColor(i);
                }
            }
        }
        Drawable[] drawableArr = this.drawablesToUpdate;
        if (drawableArr != null) {
            for (Drawable drawable : drawableArr) {
                if (drawable != null) {
                    if (drawable instanceof BackDrawable) {
                        BackDrawable backDrawable = (BackDrawable) drawable;
                        backDrawable.color = i;
                        backDrawable.invalidateSelf();
                    } else if (drawable instanceof ScamDrawable) {
                        ((ScamDrawable) drawable).setColor(i);
                    } else if (drawable instanceof RLottieDrawable) {
                        String str = this.lottieLayerName;
                        if (str != null) {
                            RLottieDrawable rLottieDrawable = (RLottieDrawable) drawable;
                            OKLCH.m(i, rLottieDrawable.newColorUpdates, str, rLottieDrawable);
                        }
                    } else if (drawable instanceof CombinedDrawable) {
                        if ((i4 & 32) != 0) {
                            ((CombinedDrawable) drawable).background.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        } else {
                            ((CombinedDrawable) drawable).icon.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    } else if (drawable instanceof AvatarDrawable) {
                        AvatarDrawable avatarDrawable = (AvatarDrawable) drawable;
                        avatarDrawable.hasGradient = false;
                        avatarDrawable.hasAdvancedGradient = false;
                        avatarDrawable.color2 = i;
                        avatarDrawable.color = i;
                        avatarDrawable.needApplyColorAccent = false;
                    } else if (drawable instanceof AnimatedArrowDrawable) {
                        AnimatedArrowDrawable animatedArrowDrawable = (AnimatedArrowDrawable) drawable;
                        animatedArrowDrawable.paint.setColor(i);
                        animatedArrowDrawable.invalidateSelf();
                    } else {
                        drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                    }
                }
            }
        }
        Class[] clsArr = this.listClasses;
        View view = this.viewToInvalidate;
        if (view != null && clsArr == null && this.listClassesFieldName == null && ((i4 & 262144) == 0 || checkTag(i2, view))) {
            if ((i4 & 1) != 0) {
                Drawable background = view.getBackground();
                if (background instanceof MessageBackgroundDrawable) {
                    MessageBackgroundDrawable messageBackgroundDrawable = (MessageBackgroundDrawable) background;
                    messageBackgroundDrawable.paint.setColor(i);
                    messageBackgroundDrawable.customPaint = null;
                } else {
                    view.setBackgroundColor(i);
                }
            }
            if ((i4 & 32) != 0) {
                if ((i4 & 2048) == 0) {
                    Drawable background2 = view.getBackground();
                    if (background2 instanceof CombinedDrawable) {
                        background2 = (i4 & 65536) != 0 ? ((CombinedDrawable) background2).background : ((CombinedDrawable) background2).icon;
                    }
                    if (background2 != null) {
                        if ((background2 instanceof StateListDrawable) || (background2 instanceof RippleDrawable)) {
                            Theme.setSelectorDrawableColor(background2, i, (i4 & 65536) != 0);
                        } else if (background2 instanceof ShapeDrawable) {
                            ((ShapeDrawable) background2).getPaint().setColor(i);
                        } else {
                            background2.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                } else if (view instanceof EditTextBoldCursor) {
                    ((EditTextBoldCursor) view).setErrorLineColor(i);
                }
            }
        }
        if (view instanceof ActionBar) {
            if ((i4 & 64) != 0) {
                ((ActionBar) view).setItemsColor(i, false);
            }
            if ((i4 & 128) != 0) {
                ((ActionBar) view).setTitleColor(i);
            }
            if ((i4 & 256) != 0) {
                ((ActionBar) view).setItemsBackgroundColor(i, false);
            }
            if ((4194304 & i4) != 0) {
                ((ActionBar) view).setItemsBackgroundColor(i, true);
            }
            if ((i4 & 512) != 0) {
                ((ActionBar) view).setItemsColor(i, true);
            }
            if ((i4 & 1024) != 0) {
                ((ActionBar) view).setSubtitleColor(i);
            }
            if ((1048576 & i4) != 0) {
                ((ActionBar) view).setActionModeColor(i);
            }
            if ((2097152 & i4) != 0) {
                ((ActionBar) view).setActionModeTopColor(i);
            }
            if ((67108864 & i4) != 0) {
                ((ActionBar) view).setSearchTextColor(i, true);
            }
            if ((134217728 & i4) != 0) {
                ((ActionBar) view).setSearchTextColor(i, false);
            }
            if ((1073741824 & i4) != 0) {
                ((ActionBar) view).setPopupItemsColor(i, (i4 & 8) != 0, false);
            }
            if ((Integer.MIN_VALUE & i4) != 0) {
                ((ActionBar) view).setPopupBackgroundColor(i, false);
            }
        }
        if (view instanceof EmptyTextProgressView) {
            if ((i4 & 4) != 0) {
                ((EmptyTextProgressView) view).setTextColor(i);
            } else if ((i4 & 2048) != 0) {
                ((EmptyTextProgressView) view).setProgressBarColor(i);
            }
        }
        if (view instanceof RadialProgressView) {
            ((RadialProgressView) view).setProgressColor(i);
        } else if (view instanceof LineProgressView) {
            if ((i4 & 2048) != 0) {
                ((LineProgressView) view).setProgressColor(i);
            } else {
                ((LineProgressView) view).setBackColor(i);
            }
        } else if (view instanceof ContextProgressView) {
            ((ContextProgressView) view).updateColors();
        } else if ((view instanceof SeekBarView) && (i4 & 2048) != 0) {
            ((SeekBarView) view).setOuterColor(i);
        }
        if ((i4 & 4) != 0 && ((i4 & 262144) == 0 || checkTag(i2, view))) {
            if (view instanceof TextView) {
                ((TextView) view).setTextColor(i);
            } else if (view instanceof NumberTextView) {
                ((NumberTextView) view).setTextColor(i);
            } else if (view instanceof SimpleTextView) {
                ((SimpleTextView) view).setTextColor(i);
            } else if (view instanceof ChatBigEmptyView) {
                ((ChatBigEmptyView) view).setTextColor(i);
            }
        }
        if ((16777216 & i4) != 0 && (view instanceof EditTextBoldCursor)) {
            ((EditTextBoldCursor) view).setCursorColor(i);
        }
        if ((8388608 & i4) != 0) {
            if (view instanceof EditTextBoldCursor) {
                if ((i4 & 2048) != 0) {
                    ((EditTextBoldCursor) view).setHeaderHintColor(i);
                } else {
                    ((EditTextBoldCursor) view).setHintColor(i);
                }
            } else if (view instanceof EditText) {
                ((EditText) view).setHintTextColor(i);
            }
        }
        if ((i4 & 8) != 0 && ((262144 & i4) == 0 || checkTag(i2, view))) {
            if (view instanceof ImageView) {
                if ((131072 & i4) != 0) {
                    Drawable drawable2 = ((ImageView) view).getDrawable();
                    if ((drawable2 instanceof StateListDrawable) || (drawable2 instanceof RippleDrawable)) {
                        Theme.setSelectorDrawableColor(drawable2, i, (65536 & i4) != 0);
                    }
                } else {
                    ((ImageView) view).setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                }
            } else if (!(view instanceof BackupImageView)) {
                if (view instanceof SimpleTextView) {
                    ((SimpleTextView) view).setSideDrawablesColor(i);
                } else if ((view instanceof TextView) && (compoundDrawables = ((TextView) view).getCompoundDrawables()) != null) {
                    for (Drawable drawable3 : compoundDrawables) {
                        if (drawable3 != null) {
                            drawable3.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.MULTIPLY));
                        }
                    }
                }
            }
        }
        if ((view instanceof ScrollView) && (i4 & 32768) != 0) {
            AndroidUtilities.setScrollViewEdgeEffectColor((ScrollView) view, i);
        }
        if ((view instanceof ViewPager) && (i4 & 32768) != 0) {
            AndroidUtilities.setViewPagerEdgeEffectColor((ViewPager) view, i);
        }
        boolean z3 = view instanceof RecyclerListView;
        if (z3) {
            RecyclerListView recyclerListView = (RecyclerListView) view;
            if ((i4 & 4096) != 0) {
                recyclerListView.setListSelectorColor(Integer.valueOf(i));
            }
            if ((33554432 & i4) != 0 && (fastScroll = recyclerListView.fastScroll) != null) {
                fastScroll.updateColors();
            }
            if ((32768 & i4) != 0) {
                recyclerListView.setGlowColor(i);
            }
            if ((i4 & 524288) != 0) {
                ArrayList<View> headers = recyclerListView.getHeaders();
                if (headers != null) {
                    for (int i6 = 0; i6 < headers.size(); i6++) {
                        processViewColor(i, headers.get(i6));
                    }
                }
                ArrayList<View> headersCache = recyclerListView.getHeadersCache();
                if (headersCache != null) {
                    for (int i7 = 0; i7 < headersCache.size(); i7++) {
                        processViewColor(i, headersCache.get(i7));
                    }
                }
                View pinnedHeader = recyclerListView.getPinnedHeader();
                if (pinnedHeader != null) {
                    processViewColor(i, pinnedHeader);
                }
            }
        } else if (view != null && (clsArr == null || clsArr.length == 0)) {
            if ((i4 & 4096) != 0) {
                view.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            } else if ((i4 & 268435456) != 0) {
                view.setBackgroundDrawable(Theme.getSelectorDrawable(true));
            }
        }
        if (clsArr != null) {
            if (z3) {
                RecyclerListView recyclerListView2 = (RecyclerListView) view;
                recyclerListView2.getRecycledViewPool().clear();
                int hiddenChildCount = recyclerListView2.getHiddenChildCount();
                for (int i8 = 0; i8 < hiddenChildCount; i8++) {
                    processViewColor(i, recyclerListView2.getHiddenChildAt(i8));
                }
                int cachedChildCount = recyclerListView2.getCachedChildCount();
                for (int i9 = 0; i9 < cachedChildCount; i9++) {
                    processViewColor(i, recyclerListView2.getCachedChildAt(i9));
                }
                int attachedScrapChildCount = recyclerListView2.getAttachedScrapChildCount();
                for (int i10 = 0; i10 < attachedScrapChildCount; i10++) {
                    processViewColor(i, recyclerListView2.getAttachedScrapChildAt(i10));
                }
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    processViewColor(i, viewGroup.getChildAt(i11));
                }
            }
            processViewColor(i, view);
        }
        ThemeDescriptionDelegate themeDescriptionDelegate = this.delegate;
        if (themeDescriptionDelegate != null) {
            themeDescriptionDelegate.didSetColor();
        }
        if (view != null) {
            view.invalidate();
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

    public ThemeDescription(View view, Class[] clsArr, RLottieDrawable[] rLottieDrawableArr, String str, int i) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i;
        this.lottieLayerName = str;
        this.drawablesToUpdate = rLottieDrawableArr;
        this.viewToInvalidate = view;
        this.changeFlags = 0;
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
        if (view instanceof EditTextEmoji) {
            this.viewToInvalidate = ((EditTextEmoji) view).getEditText();
        }
    }

    public ThemeDescription(UndoView undoView, Class[] clsArr, String[] strArr, String str, int i) {
        this.alphaOverride = -1;
        this.previousIsDefault = new boolean[1];
        this.currentKey = i;
        this.lottieLayerName = str;
        this.viewToInvalidate = undoView;
        this.changeFlags = 0;
        this.listClasses = clsArr;
        this.listClassesFieldName = strArr;
        this.cachedFields = new HashMap();
        this.notFoundCachedFields = new HashMap();
    }
}
