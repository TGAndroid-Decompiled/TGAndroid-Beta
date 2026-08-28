package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public abstract class sm0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 D;
    public float A;
    public float B;
    public ValueAnimator C;
    public final int f32518a;
    public final org.telegram.ui.ActionBar.o2 f32519b;
    public final org.telegram.ui.ActionBar.b6 f32520c;
    public final gh.f1 d;
    public final gh.t3 f32521e;
    public LinearLayout f32522f;
    public long h;
    public final ArrayList f32523n;
    public final ArrayList f32524r;
    public boolean f32525s;
    public ig.a v;
    public lg.d f32526w;
    public final Paint f32527x;
    public final long f32528y;

    public sm0(int i9, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f32523n = new ArrayList();
        this.f32524r = new ArrayList();
        this.f32527x = new Paint(1);
        this.f32518a = i9;
        this.f32519b = o2Var;
        this.f32520c = b6Var;
        this.f32528y = j10;
        hg.s0.o(b6Var);
        gh.f1 f1Var = new gh.f1(this, context, b6Var, 20);
        this.d = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        f1Var.setClipToPadding(false);
        f2.m0 m0Var = new f2.m0();
        m0Var.j1(0);
        f1Var.setLayoutManager(m0Var);
        gh.t3 t3Var = new gh.t3(this, 3);
        this.f32521e = t3Var;
        f1Var.setAdapter(t3Var);
        f1Var.setOverScrollMode(2);
        addView(f1Var, g7.e6.c(-1.0f, -1));
        f1Var.setOnItemClickListener(new km0(this, i9, o2Var, 0));
        f1Var.setOnItemLongClickListener(new bg.d0(this, i9, o2Var, b6Var, 5));
        f2.n nVar = new f2.n();
        nVar.o(gr.h);
        nVar.n(320L);
        f1Var.setItemAnimator(nVar);
        MediaDataController.getInstance(i9).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i9, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.b6 b6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof xu0) && ((xu0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, b6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i9).getSavedTagName(reaction);
        hg.r0 d = hg.r0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f10717f)) {
            charSequence = Emoji.replaceEmoji(d.f10717f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new t5(d.f10718g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i10 = R.string.SavedTagLabelTag;
        } else {
            i10 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i10));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f22702a;
        c2Var.N = append2;
        final mm0 mm0Var = new mm0(context, b6Var);
        mm0Var.setOnEditorActionListener(new nm0(mm0Var, i9, reaction, c2VarArr, view));
        MediaDataController.getInstance(i9).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        mm0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        mm0Var.setText(savedTagName);
        int i11 = org.telegram.ui.ActionBar.f6.f23108j5;
        mm0Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        mm0Var.setHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xh, b6Var));
        mm0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        mm0Var.setSingleLine(true);
        mm0Var.setFocusable(true);
        mm0Var.setInputType(16384);
        mm0Var.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23127k6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23144l6, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, b6Var));
        mm0Var.setImeOptions(6);
        mm0Var.setBackgroundDrawable(null);
        mm0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.ll.n(i11, b6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f10.addView(textView, g7.e6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(mm0Var, g7.e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f10);
        c2Var.f22761a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new c3.e(mm0Var, i9, reaction, 7));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new if0(2));
        if (z10) {
            D = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new a1(view, 7));
            D.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            mm0 mm0Var2 = mm0Var;
                            mm0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(mm0Var2);
                            return;
                        default:
                            mm0 mm0Var3 = mm0Var;
                            mm0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(mm0Var3);
                            return;
                    }
                }
            });
            D.q(250L);
        } else {
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new a1(mm0Var, 8));
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            mm0 mm0Var2 = mm0Var;
                            mm0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(mm0Var2);
                            return;
                        default:
                            mm0 mm0Var3 = mm0Var;
                            mm0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(mm0Var3);
                            return;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[0].f22767d0 = false;
        mm0Var.setSelection(mm0Var.getText().length());
    }

    public final boolean a() {
        if (this.f32524r.isEmpty() && !this.f32525s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(ig.a aVar, lg.d dVar) {
        this.v = aVar;
        this.f32526w = dVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f32527x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f32522f;
        if (view != null) {
            kg.d c10 = aVar.c(view, null, false);
            c10.n(mg.c.n(this.f32520c));
            c10.q(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.t(AndroidUtilities.dp(5.0f));
            c10.o(AndroidUtilities.dp(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.f32528y) {
                h(true);
            }
        } else if (i9 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (d5.d) new ih.e(18));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.A < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f32522f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f32522f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(hg.r0 r0Var, boolean z10) {
        gh.t3 t3Var = this.f32521e;
        if (r0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            t3Var.l();
            return;
        }
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f32524r;
            if (i9 < arrayList.size()) {
                long j10 = r0Var.h;
                hg.r0 r0Var2 = ((pm0) arrayList.get(i9)).f31693a;
                long j11 = r0Var2.h;
                if (j10 == j11) {
                    this.h = j11;
                    if (z10) {
                        f(r0Var2);
                    }
                    t3Var.l();
                    this.d.u0(i9);
                    return;
                }
                i9++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(hg.r0 r0Var);

    public final void g(boolean z10) {
        float f10;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            this.C = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f11 = this.B;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new q60(this, 15));
        this.C.setInterpolator(gr.h);
        this.C.setDuration(320L);
        this.C.addListener(new u9(18, this, z10));
        this.C.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.A);
    }

    public void h(boolean z10) {
        boolean z11;
        int i9;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f32523n;
        arrayList.clear();
        ArrayList arrayList2 = this.f32524r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = this.f32518a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f32528y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i11 = 0;
            z11 = false;
            while (i11 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i11);
                hg.r0 d = hg.r0.d(tL_savedReactionTag.reaction);
                int i12 = i11;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i13 = tL_savedReactionTag.count;
                    if (i9 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f31693a = d;
                    obj.f31694b = i13;
                    obj.f31695c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f31693a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                }
                i11 = i12 + 1;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        gh.t3 t3Var = this.f32521e;
        if (z10) {
            f2.s.c(new om0(this), true).b(t3Var);
        } else {
            t3Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i10).isPremium();
        this.f32525s = !isPremium;
        if (!isPremium) {
            if (this.f32522f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f32522f = linearLayout;
                linearLayout.setOnClickListener(new h70(this, 13));
                this.f32522f.setOrientation(0);
                g7.g6.b(this.f32522f, 0.03f, 1.25f);
                org.telegram.ui.q9 q9Var = new org.telegram.ui.q9(this, getContext());
                int i14 = org.telegram.ui.ActionBar.f6.o6;
                org.telegram.ui.ActionBar.b6 b6Var = this.f32520c;
                q9Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
                q9Var.setTextSize(1, 12.0f);
                q9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i15 = org.telegram.ui.ActionBar.f6.f23061gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
                eq eqVar = new eq(0, mutate);
                eqVar.setTranslateY(0.0f);
                eqVar.setTranslateX(0.0f);
                eqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(eqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                q9Var.setText(spannableStringBuilder);
                q9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, b6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
                eq eqVar2 = new eq(0, mutate2);
                eqVar2.setScale(0.76f, 0.76f);
                eqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                eqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(eqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f32522f.addView(q9Var, g7.e6.q(-2, -2, 16));
                this.f32522f.addView(textView, g7.e6.q(-2, -2, 16));
                this.f32522f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f32522f.setClipToPadding(false);
                addView(this.f32522f, g7.e6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f32522f.setVisibility(0);
                this.f32522f.setAlpha(0.0f);
                this.f32522f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f32522f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new ib0(this, 22)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f32522f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i9 = this.f32518a;
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i9 = this.f32518a;
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f10) {
        this.A = f10;
        gh.f1 f1Var = this.d;
        f1Var.setPivotX(f1Var.getWidth() / 2.0f);
        f1Var.setPivotY(0.0f);
        f1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        f1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
