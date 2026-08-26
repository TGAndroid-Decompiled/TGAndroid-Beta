package org.telegram.ui.Components;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.TypedValue;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda174;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda89;

public abstract class AnimatedPhoneNumberEditText extends HintEditText {
    public ObjectAnimator animator;
    public PhotoViewer$$ExternalSyntheticLambda89 hintAnimationCallback;
    public final ArrayList hintAnimationValues;
    public final ArrayList hintAnimations;
    public final DynamicAnimation.AnonymousClass15 hintFadeProperty;
    public final ArrayList letters;
    public final ArrayList oldLetters;
    public String oldText;
    public float progress;
    public final TextPaint textPaint;
    public String wasHint;
    public Boolean wasHintVisible;

    public AnimatedPhoneNumberEditText(Context context) {
        super(context);
        this.letters = new ArrayList();
        this.oldLetters = new ArrayList();
        this.textPaint = new TextPaint(1);
        this.oldText = "";
        this.hintFadeProperty = new DynamicAnimation.AnonymousClass15(this, 1);
        this.hintAnimationValues = new ArrayList();
        this.hintAnimations = new ArrayList();
    }

    @Override
    public String getHintText() {
        return this.wasHint;
    }

    public float getProgress() {
        return this.progress;
    }

    public final void lambda$setHintText$0(String str, boolean z) {
        this.hintAnimationValues.clear();
        ArrayList arrayList = this.hintAnimations;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((SpringAnimation) obj).cancel();
        }
        if (z) {
            return;
        }
        super.setHintText(str);
    }

    @Override
    public final void onPreDrawHintCharacter(int i) {
        ArrayList arrayList = this.hintAnimationValues;
        if (i < arrayList.size()) {
            this.hintPaint.setAlpha((int) (((Float) arrayList.get(i)).floatValue() * 255.0f));
        }
    }

    @Override
    public void setHintText(String str) {
        boolean zIsEmpty;
        boolean zIsEmpty2 = TextUtils.isEmpty(str);
        boolean z = !zIsEmpty2;
        Boolean bool = this.wasHintVisible;
        ArrayList arrayList = this.hintAnimationValues;
        ArrayList arrayList2 = this.hintAnimations;
        if (bool == null || bool.booleanValue() != z) {
            arrayList.clear();
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                ((SpringAnimation) obj).cancel();
            }
            arrayList2.clear();
            this.wasHintVisible = Boolean.valueOf(z);
            zIsEmpty = TextUtils.isEmpty(getText());
        } else {
            zIsEmpty = false;
        }
        String str2 = !zIsEmpty2 ? str : this.wasHint;
        if (str2 == null) {
            str2 = "";
        }
        this.wasHint = str;
        if (!zIsEmpty2 || !zIsEmpty) {
            super.setHintText(str);
        }
        if (zIsEmpty) {
            int length = str2.length();
            PhotoViewer$$ExternalSyntheticLambda89 photoViewer$$ExternalSyntheticLambda89 = new PhotoViewer$$ExternalSyntheticLambda89(this, z, str, 12);
            Runnable runnable = this.hintAnimationCallback;
            if (runnable != null) {
                removeCallbacks(runnable);
            }
            for (int i2 = 0; i2 < length; i2++) {
                float f = 0.0f;
                float f2 = !zIsEmpty2 ? 0.0f : 1.0f;
                if (!zIsEmpty2) {
                    f = 1.0f;
                }
                SpringAnimation springAnimation = new SpringAnimation(Integer.valueOf(i2), this.hintFadeProperty);
                float f3 = f * 100.0f;
                SpringForce springForce = new SpringForce(f3);
                springForce.setStiffness(500.0f);
                springForce.setDampingRatio(1.0f);
                springForce.mFinalPosition = f3;
                springAnimation.mSpring = springForce;
                springAnimation.mValue = 100.0f * f2;
                springAnimation.mStartValueIsSet = true;
                arrayList2.add(springAnimation);
                arrayList.add(Float.valueOf(f2));
                postDelayed(new ChatActivity$$ExternalSyntheticLambda174(springAnimation, 29), ((long) i2) * 5);
            }
            this.hintAnimationCallback = photoViewer$$ExternalSyntheticLambda89;
            postDelayed(photoViewer$$ExternalSyntheticLambda89, (((long) length) * 5) + 150);
        }
    }

    public void setNewText(String str) {
        ArrayList arrayList;
        TextPaint textPaint;
        ArrayList arrayList2 = this.oldLetters;
        if (arrayList2 == null || (arrayList = this.letters) == null || Objects.equals(this.oldText, str)) {
            return;
        }
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
            this.animator = null;
        }
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        arrayList.clear();
        int i = 0;
        boolean z = TextUtils.isEmpty(this.oldText) && !TextUtils.isEmpty(str);
        this.progress = 0.0f;
        while (i < str.length()) {
            int i2 = i + 1;
            String strSubstring = str.substring(i, i2);
            String strSubstring2 = (arrayList2.isEmpty() || i >= this.oldText.length()) ? null : this.oldText.substring(i, i2);
            if (z || strSubstring2 == null || !strSubstring2.equals(strSubstring)) {
                TextPaint textPaint2 = this.textPaint;
                if (z && strSubstring2 == null) {
                    textPaint = textPaint2;
                    arrayList2.add(new StaticLayout("", textPaint, 0, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
                } else {
                    textPaint = textPaint2;
                }
                arrayList.add(new StaticLayout(strSubstring, textPaint, (int) Math.ceil(textPaint.measureText(strSubstring)), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false));
            } else {
                arrayList.add((StaticLayout) arrayList2.get(i));
                arrayList2.set(i, null);
            }
            i = i2;
        }
        if (!arrayList2.isEmpty()) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "progress", -1.0f, 0.0f);
            this.animator = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(150L);
            this.animator.addListener(new CheckBox.AnonymousClass1(this, 6));
            this.animator.start();
        }
        this.oldText = str;
        invalidate();
    }

    public void setProgress(float f) {
        if (this.progress == f) {
            return;
        }
        this.progress = f;
        invalidate();
    }

    @Override
    public void setTextColor(int i) {
        super.setTextColor(i);
        this.textPaint.setColor(i);
    }

    @Override
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        this.textPaint.setTextSize(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics()));
    }
}
