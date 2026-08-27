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

public abstract class um0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 D;
    public float A;
    public float B;
    public ValueAnimator C;

    public final int f33126a;

    public final org.telegram.ui.ActionBar.n2 f33127b;

    public final org.telegram.ui.ActionBar.c6 f33128c;
    public final hh.f1 d;

    public final ag.i f33129e;

    public LinearLayout f33130f;
    public long h;

    public final ArrayList f33131n;

    public final ArrayList f33132r;

    public boolean f33133s;
    public jg.a v;

    public mg.d f33134w;

    public final Paint f33135x;

    public final long f33136y;

    public um0(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f33131n = new ArrayList();
        this.f33132r = new ArrayList();
        this.f33135x = new Paint(1);
        this.f33126a = i10;
        this.f33127b = n2Var;
        this.f33128c = c6Var;
        this.f33136y = j10;
        ig.r0.o(c6Var);
        hh.f1 f1Var = new hh.f1(this, context, c6Var, 20);
        this.d = f1Var;
        f1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        f1Var.setClipToPadding(false);
        f2.k0 k0Var = new f2.k0();
        k0Var.j1(0);
        f1Var.setLayoutManager(k0Var);
        ag.i iVar = new ag.i(this, 3);
        this.f33129e = iVar;
        f1Var.setAdapter(iVar);
        f1Var.setOverScrollMode(2);
        addView(f1Var, h7.z5.c(-1.0f, -1));
        f1Var.setOnItemClickListener(new ag.p2(this, i10, n2Var, 1));
        f1Var.setOnItemLongClickListener(new cg.a0(this, i10, n2Var, c6Var, 5));
        nm0 nm0Var = new nm0();
        nm0Var.o(er.h);
        nm0Var.n(320L);
        f1Var.setItemAnimator(nm0Var);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c6 c6Var) {
        CharSequence charSequenceReplaceEmoji;
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        boolean z10 = n2VarR != null && (n2VarR.getFragmentView() instanceof zu0) && ((zu0) n2VarR.getFragmentView()).R() > AndroidUtilities.dp(20.0f);
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        ?? e2Var = z10 ? new org.telegram.ui.ActionBar.e2(context, 0, c6Var) : new AlertDialog$Builder(context, 0, c6Var);
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        ig.q0 q0VarD = ig.q0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (TextUtils.isEmpty(q0VarD.f11412f)) {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new t5(q0VarD.f11413g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequenceReplaceEmoji = spannableString;
        } else {
            charSequenceReplaceEmoji = Emoji.replaceEmoji(q0VarD.f11412f, textPaint.getFontMetricsInt(), false);
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequenceReplaceEmoji).append((CharSequence) "  ").append((CharSequence) LocaleController.getString(TextUtils.isEmpty(savedTagName) ? R.string.SavedTagLabelTag : R.string.SavedTagRenameTag));
        org.telegram.ui.ActionBar.b2 b2Var = e2Var.f22702a;
        b2Var.N = spannableStringBuilderAppend;
        final om0 om0Var = new om0(context, c6Var);
        om0Var.setOnEditorActionListener(new pm0(om0Var, i10, reaction, b2VarArr, currentFocus));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        om0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        om0Var.setText(savedTagName);
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        om0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var));
        om0Var.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        om0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        om0Var.setSingleLine(true);
        om0Var.setFocusable(true);
        om0Var.setInputType(16384);
        om0Var.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23181k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23198l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var));
        om0Var.setImeOptions(6);
        om0Var.setBackgroundDrawable(null);
        om0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.rl.l(i11, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        linearLayoutG.addView(textView, h7.z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        linearLayoutG.addView(om0Var, h7.z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        e2Var.n(linearLayoutG);
        b2Var.f22742a = AndroidUtilities.dp(292.0f);
        e2Var.k(LocaleController.getString(R.string.Save), new c3.d(om0Var, i10, reaction, 6));
        e2Var.h(LocaleController.getString(R.string.Cancel), new pc0(7));
        if (z10) {
            D = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new a1(currentFocus, 7));
            final int i12 = 0;
            D.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i12) {
                        case 0:
                            om0 om0Var2 = om0Var;
                            om0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(om0Var2);
                            break;
                        default:
                            om0 om0Var3 = om0Var;
                            om0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(om0Var3);
                            break;
                    }
                }
            });
            D.q(250L);
        } else {
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new a1(om0Var, 8));
            final int i13 = 1;
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (i13) {
                        case 0:
                            om0 om0Var2 = om0Var;
                            om0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(om0Var2);
                            break;
                        default:
                            om0 om0Var3 = om0Var;
                            om0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(om0Var3);
                            break;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[0].f22748d0 = false;
        om0Var.setSelection(om0Var.getText().length());
    }

    public final boolean a() {
        return !this.f33132r.isEmpty() || this.f33133s;
    }

    public abstract void b(boolean z10);

    public final void d(jg.a aVar, mg.d dVar) {
        this.v = aVar;
        this.f33134w = dVar;
        float fDpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f33135x;
        paint.setStrokeWidth(fDpf2);
        paint.setStyle(Paint.Style.STROKE);
        LinearLayout linearLayout = this.f33130f;
        if (linearLayout != null) {
            lg.d dVarC = aVar.c(linearLayout, null, false);
            dVarC.n(ng.c.n(this.f33128c));
            dVarC.q(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            dVarC.t(AndroidUtilities.dp(5.0f));
            dVarC.o(AndroidUtilities.dp(4.0f));
            linearLayout.setBackground(dVarC);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedReactionTagsUpdate) {
            long jLongValue = ((Long) objArr[0]).longValue();
            if (jLongValue == 0 || jLongValue == this.f33136y) {
                h(true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (d5.d) new j4.w0(18));
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
        if (view != this.d || (linearLayout = this.f33130f) == null) {
            return super.drawChild(canvas, view, j10);
        }
        if (linearLayout.getAlpha() >= 1.0f) {
            return false;
        }
        canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f33130f.getAlpha()) * 255.0f), 31);
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restore();
        return zDrawChild;
    }

    public final void e(ig.q0 q0Var, boolean z10) {
        ag.i iVar = this.f33129e;
        if (q0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            iVar.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f33132r;
            if (i10 >= arrayList.size()) {
                return;
            }
            rm0 rm0Var = (rm0) arrayList.get(i10);
            long j10 = q0Var.h;
            ig.q0 q0Var2 = rm0Var.f32207a;
            long j11 = q0Var2.h;
            if (j10 == j11) {
                this.h = j11;
                if (z10) {
                    f(q0Var2);
                }
                iVar.l();
                this.d.u0(i10);
                return;
            }
            i10++;
        }
    }

    public abstract boolean f(ig.q0 q0Var);

    public final void g(boolean z10) {
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            this.C = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.B, z10 ? 1.0f : 0.0f);
        this.C = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new v60(this, 15));
        this.C.setInterpolator(er.h);
        this.C.setDuration(320L);
        this.C.addListener(new org.telegram.ui.go(19, this, z10));
        this.C.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.A);
    }

    public void h(boolean z10) {
        boolean z11;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f33131n;
        arrayList.clear();
        ArrayList arrayList2 = this.f33132r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i10 = this.f33126a;
        MessagesController messagesController = MessagesController.getInstance(i10);
        long j10 = this.f33136y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i11 = 0;
            z11 = false;
            while (i11 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i11);
                ig.q0 q0VarD = ig.q0.d(tL_savedReactionTag.reaction);
                int i12 = i11;
                if (!hashSet.contains(Long.valueOf(q0VarD.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i13 = tL_savedReactionTag.count;
                    String savedTagName = j10 != 0 ? messagesController.getSavedTagName(tL_savedReactionTag.reaction) : tL_savedReactionTag.title;
                    rm0 rm0Var = new rm0();
                    rm0Var.f32207a = q0VarD;
                    rm0Var.f32208b = i13;
                    rm0Var.f32209c = savedTagName;
                    rm0Var.d = savedTagName == null ? -233 : savedTagName.hashCode();
                    if (rm0Var.f32207a.h == this.h) {
                        z11 = true;
                    }
                    arrayList2.add(rm0Var);
                    hashSet.add(Long.valueOf(q0VarD.h));
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
        ag.i iVar = this.f33129e;
        if (z10) {
            f2.q.c(new qm0(this), true).b(iVar);
        } else {
            iVar.l();
        }
        boolean zIsPremium = UserConfig.getInstance(i10).isPremium();
        this.f33133s = !zIsPremium;
        if (zIsPremium) {
            LinearLayout linearLayout = this.f33130f;
            if (linearLayout != null) {
                if (z10) {
                    linearLayout.animate().alpha(0.0f).withEndAction(new mb0(this, 22)).start();
                    return;
                } else {
                    linearLayout.setAlpha(1.0f);
                    this.f33130f.setVisibility(0);
                    return;
                }
            }
            return;
        }
        if (this.f33130f == null) {
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            this.f33130f = linearLayout2;
            linearLayout2.setOnClickListener(new l70(this, 13));
            this.f33130f.setOrientation(0);
            h7.b6.b(this.f33130f, 0.03f, 1.25f);
            org.telegram.ui.r9 r9Var = new org.telegram.ui.r9(this, getContext());
            int i14 = org.telegram.ui.ActionBar.g6.f23251o6;
            org.telegram.ui.ActionBar.c6 c6Var = this.f33128c;
            r9Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
            r9Var.setTextSize(1, 12.0f);
            r9Var.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
            int i15 = org.telegram.ui.ActionBar.g6.gc;
            PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
            drawableMutate.setColorFilter(new PorterDuffColorFilter(i15, mode));
            cq cqVar = new cq(0, drawableMutate);
            cqVar.setTranslateY(0.0f);
            cqVar.setTranslateX(0.0f);
            cqVar.setScale(0.94f, 0.94f);
            SpannableString spannableString = new SpannableString("l");
            spannableString.setSpan(cqVar, 0, spannableString.length(), 17);
            spannableStringBuilder.append((CharSequence) spannableString);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
            r9Var.setText(spannableStringBuilder);
            r9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            TextView textView = new TextView(getContext());
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
            textView.setTextSize(1, 12.0f);
            textView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
            SpannableString spannableString2 = new SpannableString(">");
            Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
            drawableMutate2.setColorFilter(new PorterDuffColorFilter(i15, mode));
            cq cqVar2 = new cq(0, drawableMutate2);
            cqVar2.setScale(0.76f, 0.76f);
            cqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
            cqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
            spannableString2.setSpan(cqVar2, 0, spannableString2.length(), 17);
            spannableStringBuilder2.append((CharSequence) spannableString2);
            textView.setText(spannableStringBuilder2);
            textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
            this.f33130f.addView(r9Var, h7.z5.q(-2, -2, 16));
            this.f33130f.addView(textView, h7.z5.q(-2, -2, 16));
            this.f33130f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
            this.f33130f.setClipToPadding(false);
            addView(this.f33130f, h7.z5.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
        }
        if (z10) {
            return;
        }
        this.f33130f.setVisibility(0);
        this.f33130f.setAlpha(0.0f);
        this.f33130f.animate().alpha(1.0f).start();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f33126a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f33126a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f10) {
        this.A = f10;
        hh.f1 f1Var = this.d;
        f1Var.setPivotX(f1Var.getWidth() / 2.0f);
        f1Var.setPivotY(0.0f);
        f1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        f1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
