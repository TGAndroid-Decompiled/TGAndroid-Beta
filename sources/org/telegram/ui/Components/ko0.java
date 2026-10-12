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
public abstract class ko0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.a2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f26764a;
    public final org.telegram.ui.ActionBar.m2 f26765b;
    public final org.telegram.ui.ActionBar.c6 f26766c;
    public final bi.o0 d;
    public final hg.m0 e;
    public LinearLayout f26767f;
    public long h;
    public final ArrayList f26768n;
    public final ArrayList f26769r;
    public boolean f26770s;
    public bh.b v;
    public eh.e f26771w;
    public final Paint f26772x;
    public final long f26773y;

    public ko0(int i10, long j10, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f26768n = new ArrayList();
        this.f26769r = new ArrayList();
        this.f26772x = new Paint(1);
        this.f26764a = i10;
        this.f26765b = m2Var;
        this.f26766c = c6Var;
        this.f26773y = j10;
        ah.j1.o(c6Var);
        bi.o0 o0Var = new bi.o0(this, context, c6Var, 20);
        this.d = o0Var;
        o0Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        o0Var.setClipToPadding(false);
        s4.b0 b0Var = new s4.b0();
        b0Var.j1(0);
        o0Var.setLayoutManager(b0Var);
        hg.m0 m0Var = new hg.m0(this, 2);
        this.e = m0Var;
        o0Var.setAdapter(m0Var);
        o0Var.setOverScrollMode(2);
        addView(o0Var, w7.a6.d(-1.0f, -1));
        o0Var.setOnItemClickListener(new co0(this, i10, m2Var, 0));
        o0Var.setOnItemLongClickListener(new org.telegram.ui.ia(this, i10, m2Var, c6Var, 3));
        s4.k kVar = new s4.k();
        kVar.o(es.h);
        kVar.n(320L);
        o0Var.setItemAnimator(kVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c6 c6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i11;
        org.telegram.ui.ActionBar.m2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof ow0) && ((ow0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.a2[] a2VarArr = new org.telegram.ui.ActionBar.a2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        ah.i1 d = ah.i1.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f779f)) {
            charSequence = Emoji.replaceEmoji(d.f779f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new b6(d.f780g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f19548a;
        a2Var.R = append2;
        final eo0 eo0Var = new eo0(context, c6Var);
        eo0Var.setOnEditorActionListener(new fo0(eo0Var, i10, reaction, a2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        eo0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        eo0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.g6.f20007j5;
        eo0Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i12, c6Var));
        eo0Var.setHintColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        eo0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        eo0Var.setSingleLine(true);
        eo0Var.setFocusable(true);
        eo0Var.setInputType(16384);
        eo0Var.setLineColors(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20028k6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20045l6, c6Var), org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f20122p7, c6Var));
        eo0Var.setImeOptions(6);
        eo0Var.setBackgroundDrawable(null);
        eo0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout e = org.telegram.messenger.yh.e(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.yh.n(i12, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        e.addView(textView, w7.a6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e.addView(eo0Var, w7.a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e);
        a2Var.f19557a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new hg.b2(eo0Var, i10, reaction, 9));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new zg0(2));
        if (z10) {
            H = a2Var;
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new b1(view, 8));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            eo0 eo0Var2 = eo0Var;
                            eo0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(eo0Var2);
                            return;
                        default:
                            eo0 eo0Var3 = eo0Var;
                            eo0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(eo0Var3);
                            return;
                    }
                }
            });
            H.q(250L);
        } else {
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new b1(eo0Var, 9));
            a2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            eo0 eo0Var2 = eo0Var;
                            eo0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(eo0Var2);
                            return;
                        default:
                            eo0 eo0Var3 = eo0Var;
                            eo0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(eo0Var3);
                            return;
                    }
                }
            });
            a2VarArr[0].show();
        }
        a2VarArr[0].f19570h0 = false;
        eo0Var.setSelection(eo0Var.getText().length());
    }

    public final boolean a() {
        if (this.f26769r.isEmpty() && !this.f26770s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(bh.b bVar, eh.e eVar) {
        this.v = bVar;
        this.f26771w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f26772x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f26767f;
        if (view != null) {
            dh.d c10 = bVar.c(view, null, false);
            c10.o(fh.b.o(this.f26766c));
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
            if (longValue == 0 || longValue == this.f26773y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new bi.f(5));
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
        if (view == this.d && (linearLayout = this.f26767f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f26767f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ah.i1 i1Var, boolean z10) {
        hg.m0 m0Var = this.e;
        if (i1Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            m0Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26769r;
            if (i10 < arrayList.size()) {
                long j10 = i1Var.h;
                ah.i1 i1Var2 = ((ho0) arrayList.get(i10)).f25716a;
                long j11 = i1Var2.h;
                if (j10 == j11) {
                    this.h = j11;
                    if (z10) {
                        f(i1Var2);
                    }
                    m0Var.l();
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
        ofFloat.addUpdateListener(new g80(this, 16));
        this.G.setInterpolator(es.h);
        this.G.setDuration(320L);
        this.G.addListener(new org.telegram.ui.vo(19, this, z10));
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
        ArrayList arrayList = this.f26768n;
        arrayList.clear();
        ArrayList arrayList2 = this.f26769r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f26764a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f26773y;
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
                    obj.f25716a = d;
                    obj.f25717b = i14;
                    obj.f25718c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f25716a.h == this.h) {
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
        hg.m0 m0Var = this.e;
        if (z10) {
            s4.o.c(new go0(this), true).c(m0Var);
        } else {
            m0Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f26770s = !isPremium;
        if (!isPremium) {
            if (this.f26767f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f26767f = linearLayout;
                linearLayout.setOnClickListener(new z80(this, 12));
                this.f26767f.setOrientation(0);
                w7.c6.b(this.f26767f, 0.03f, 1.25f);
                org.telegram.ui.w9 w9Var = new org.telegram.ui.w9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.g6.f20104o6;
                org.telegram.ui.ActionBar.c6 c6Var = this.f26766c;
                w9Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, c6Var));
                w9Var.setTextSize(1, 12.0f);
                w9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.g6.f19960gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                br brVar = new br(0, mutate);
                brVar.setTranslateY(0.0f);
                brVar.setTranslateX(0.0f);
                brVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(brVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                w9Var.setText(spannableStringBuilder);
                w9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, c6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                br brVar2 = new br(0, mutate2);
                brVar2.setScale(0.76f, 0.76f);
                brVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                brVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(brVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f26767f.addView(w9Var, w7.a6.q(-2, -2, 16));
                this.f26767f.addView(textView, w7.a6.q(-2, -2, 16));
                this.f26767f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f26767f.setClipToPadding(false);
                addView(this.f26767f, w7.a6.a(-1.0f, 5.0f, 0.0f, 5.0f, 0.0f, -2, 19));
            }
            if (!z10) {
                this.f26767f.setVisibility(0);
                this.f26767f.setAlpha(0.0f);
                this.f26767f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f26767f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new yc0(this, 23)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f26767f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f26764a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f26764a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f7) {
        this.E = f7;
        bi.o0 o0Var = this.d;
        o0Var.setPivotX(o0Var.getWidth() / 2.0f);
        o0Var.setPivotY(0.0f);
        o0Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        o0Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
