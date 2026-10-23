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
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.LaunchActivity;
public abstract class jo0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f27722a;
    public final org.telegram.ui.ActionBar.o2 f27723b;
    public final org.telegram.ui.ActionBar.g6 f27724c;
    public final ai.u1 d;
    public final ai.m5 e;
    public LinearLayout f27725f;
    public long h;
    public final ArrayList f27726n;
    public final ArrayList f27727r;
    public boolean f27728s;
    public bh.b v;
    public eh.e f27729w;
    public final Paint f27730x;
    public final long f27731y;

    public jo0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f27726n = new ArrayList();
        this.f27727r = new ArrayList();
        this.f27730x = new Paint(1);
        this.f27722a = i10;
        this.f27723b = o2Var;
        this.f27724c = g6Var;
        this.f27731y = j10;
        ah.j1.o(g6Var);
        ai.u1 u1Var = new ai.u1(this, context, g6Var, 21);
        this.d = u1Var;
        u1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        u1Var.setClipToPadding(false);
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        u1Var.setLayoutManager(b0Var);
        ai.m5 m5Var = new ai.m5(this, 3);
        this.e = m5Var;
        u1Var.setAdapter(m5Var);
        u1Var.setOverScrollMode(2);
        addView(u1Var, w7.z5.c(-1.0f, -1));
        u1Var.setOnItemClickListener(new bo0(this, i10, o2Var, 0));
        u1Var.setOnItemLongClickListener(new org.telegram.ui.fa(this, i10, o2Var, g6Var, 3));
        s4.k kVar = new s4.k();
        kVar.o(bs.h);
        kVar.n(320L);
        u1Var.setItemAnimator(kVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.g6 g6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i11;
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof ow0) && ((ow0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        ah.i1 d = ah.i1.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f784f)) {
            charSequence = Emoji.replaceEmoji(d.f784f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new a6(d.f785g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f20678a;
        c2Var.R = append2;
        final do0 do0Var = new do0(context, g6Var);
        do0Var.setOnEditorActionListener(new eo0(do0Var, i10, reaction, c2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        do0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        do0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.W(do0Var, i12, g6Var);
        org.telegram.ui.ActionBar.r6.m(do0Var, 34, org.telegram.ui.ActionBar.k6.Xh, g6Var);
        do0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        do0Var.setSingleLine(true);
        do0Var.setFocusable(true);
        do0Var.setInputType(16384);
        org.telegram.ui.ActionBar.r6.H(do0Var, org.telegram.ui.ActionBar.k6.f21310k6, org.telegram.ui.ActionBar.k6.f21327l6, org.telegram.ui.ActionBar.k6.f21404p7, g6Var);
        do0Var.setImeOptions(6);
        do0Var.setBackgroundDrawable(null);
        do0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout e = org.telegram.messenger.sl.e(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView, i12, g6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        e.addView(textView, w7.z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(do0Var, w7.z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(e);
        c2Var.f20742a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new hg.b2(do0Var, i10, reaction, 9));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new ud0(9));
        if (z10) {
            H = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new a1(view, 8));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            do0 do0Var2 = do0Var;
                            do0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(do0Var2);
                            return;
                        default:
                            do0 do0Var3 = do0Var;
                            do0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(do0Var3);
                            return;
                    }
                }
            });
            H.r(250L);
        } else {
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new a1(do0Var, 9));
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            do0 do0Var2 = do0Var;
                            do0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(do0Var2);
                            return;
                        default:
                            do0 do0Var3 = do0Var;
                            do0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(do0Var3);
                            return;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[0].f20764j0 = false;
        do0Var.setSelection(do0Var.getText().length());
    }

    public final boolean a() {
        if (this.f27727r.isEmpty() && !this.f27728s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(bh.b bVar, eh.e eVar) {
        this.v = bVar;
        this.f27729w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f27730x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f27725f;
        if (view != null) {
            dh.d c10 = bVar.c(view, null, false);
            c10.o(fh.c.o(this.f27724c));
            c10.r(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.u(AndroidUtilities.dp(5.0f));
            c10.p(AndroidUtilities.dp(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.f27731y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new ci.e(5));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.E < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f27725f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f27725f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ah.i1 i1Var, boolean z10) {
        ai.m5 m5Var = this.e;
        if (i1Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            m5Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f27727r;
            if (i10 < arrayList.size()) {
                long j10 = i1Var.h;
                ah.i1 i1Var2 = ((go0) arrayList.get(i10)).f26687a;
                long j11 = i1Var2.h;
                if (j10 == j11) {
                    this.h = j11;
                    if (z10) {
                        f(i1Var2);
                    }
                    m5Var.l();
                    this.d.u0(i10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(ah.i1 i1Var);

    public final void g(boolean z10) {
        float f7;
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            this.G = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f10 = this.F;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
        this.G = ofFloat;
        ofFloat.addUpdateListener(new d80(this, 16));
        this.G.setInterpolator(bs.h);
        this.G.setDuration(320L);
        this.G.addListener(new org.telegram.ui.ho(19, this, z10));
        this.G.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.E);
    }

    public void h(boolean z10) {
        boolean z11;
        int i10;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f27726n;
        arrayList.clear();
        ArrayList arrayList2 = this.f27727r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f27722a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f27731y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                ah.i1 d = ah.i1.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f26687a = d;
                    obj.f26688b = i14;
                    obj.f26689c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f26687a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                }
                i12 = i13 + 1;
            }
        } else {
            z11 = false;
        }
        if (!z11 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        ai.m5 m5Var = this.e;
        if (z10) {
            s4.o.c(new fo0(this), true).c(m5Var);
        } else {
            m5Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f27728s = !isPremium;
        if (!isPremium) {
            if (this.f27725f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f27725f = linearLayout;
                linearLayout.setOnClickListener(new v80(this, 12));
                this.f27725f.setOrientation(0);
                w7.b6.b(this.f27725f, 0.03f, 1.25f);
                org.telegram.ui.u9 u9Var = new org.telegram.ui.u9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.k6.f21386o6;
                org.telegram.ui.ActionBar.g6 g6Var = this.f27724c;
                org.telegram.ui.ActionBar.r6.W(u9Var, i15, g6Var);
                u9Var.setTextSize(1, 12.0f);
                u9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.k6.f21242gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                xq xqVar = new xq(0, mutate);
                xqVar.setTranslateY(0.0f);
                xqVar.setTranslateX(0.0f);
                xqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(xqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                u9Var.setText(spannableStringBuilder);
                u9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                org.telegram.ui.ActionBar.r6.W(textView, i15, g6Var);
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                xq xqVar2 = new xq(0, mutate2);
                xqVar2.setScale(0.76f, 0.76f);
                xqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                xqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(xqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f27725f.addView(u9Var, w7.z5.q(-2, -2, 16));
                this.f27725f.addView(textView, w7.z5.q(-2, -2, 16));
                this.f27725f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f27725f.setClipToPadding(false);
                addView(this.f27725f, w7.z5.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f27725f.setVisibility(0);
                this.f27725f.setAlpha(0.0f);
                this.f27725f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f27725f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new yb0(this, 23)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f27725f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f27722a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f27722a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f7) {
        this.E = f7;
        ai.u1 u1Var = this.d;
        u1Var.setPivotX(u1Var.getWidth() / 2.0f);
        u1Var.setPivotY(0.0f);
        u1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        u1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
