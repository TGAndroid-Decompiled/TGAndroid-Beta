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
public abstract class en0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.c2 D;
    public float A;
    public float B;
    public ValueAnimator C;
    public final int f28116a;
    public final org.telegram.ui.ActionBar.o2 f28117b;
    public final org.telegram.ui.ActionBar.c6 f28118c;
    public final jh.e1 d;
    public final cg.g f28119e;
    public LinearLayout f28120f;
    public long h;
    public final ArrayList f28121n;
    public final ArrayList f28122r;
    public boolean f28123s;
    public lg.a v;
    public og.d f28124w;
    public final Paint f28125x;
    public final long f28126y;

    public en0(int i10, long j10, Context context, org.telegram.ui.ActionBar.o2 o2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28121n = new ArrayList();
        this.f28122r = new ArrayList();
        this.f28125x = new Paint(1);
        this.f28116a = i10;
        this.f28117b = o2Var;
        this.f28118c = c6Var;
        this.f28126y = j10;
        kg.r0.o(c6Var);
        jh.e1 e1Var = new jh.e1(this, context, c6Var, 19);
        this.d = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        e1Var.setClipToPadding(false);
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        e1Var.setLayoutManager(j0Var);
        cg.g gVar = new cg.g(this, 3);
        this.f28119e = gVar;
        e1Var.setAdapter(gVar);
        e1Var.setOverScrollMode(2);
        addView(e1Var, i7.f6.c(-1.0f, -1));
        e1Var.setOnItemClickListener(new cg.x1(this, i10, o2Var, 1));
        e1Var.setOnItemLongClickListener(new eg.b0(this, i10, o2Var, c6Var, 5));
        f2.l lVar = new f2.l();
        lVar.o(jr.h);
        lVar.n(320L);
        e1Var.setItemAnimator(lVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.c6 c6Var) {
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
        if (R != null && (R.getFragmentView() instanceof hv0) && ((hv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        kg.q0 d = kg.q0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f13825f)) {
            charSequence = Emoji.replaceEmoji(d.f13825f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new y5(d.f13826g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder2.f22714a;
        c2Var.N = append2;
        final ym0 ym0Var = new ym0(context, c6Var);
        ym0Var.setOnEditorActionListener(new zm0(ym0Var, i10, reaction, c2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        ym0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        ym0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.g6.f23169j5;
        ym0Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        ym0Var.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        ym0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        ym0Var.setSingleLine(true);
        ym0Var.setFocusable(true);
        ym0Var.setInputType(16384);
        ym0Var.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23189k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23206l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23279p7, c6Var));
        ym0Var.setImeOptions(6);
        ym0Var.setBackgroundDrawable(null);
        ym0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.b.m(i12, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        g10.addView(textView, i7.f6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        g10.addView(ym0Var, i7.f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(g10);
        c2Var.f22778a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new e3.d(ym0Var, i10, reaction, 6));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new r2(26));
        if (z10) {
            D = c2Var;
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new d1(view, 7));
            D.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ym0 ym0Var2 = ym0Var;
                            ym0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(ym0Var2);
                            return;
                        default:
                            ym0 ym0Var3 = ym0Var;
                            ym0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(ym0Var3);
                            return;
                    }
                }
            });
            D.q(250L);
        } else {
            c2VarArr[0] = c2Var;
            c2Var.setOnDismissListener(new d1(ym0Var, 8));
            c2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ym0 ym0Var2 = ym0Var;
                            ym0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(ym0Var2);
                            return;
                        default:
                            ym0 ym0Var3 = ym0Var;
                            ym0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(ym0Var3);
                            return;
                    }
                }
            });
            c2VarArr[0].show();
        }
        c2VarArr[0].f22784d0 = false;
        ym0Var.setSelection(ym0Var.getText().length());
    }

    public final boolean a() {
        if (this.f28122r.isEmpty() && !this.f28123s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(lg.a aVar, og.d dVar) {
        this.v = aVar;
        this.f28124w = dVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f28125x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f28120f;
        if (view != null) {
            ng.d c3 = aVar.c(view, null, false);
            c3.n(pg.a.n(this.f28118c));
            c3.q(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c3.t(AndroidUtilities.dp(5.0f));
            c3.o(AndroidUtilities.dp(4.0f));
            view.setBackground(c3);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.f28126y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (f5.d) new l4.x0(18));
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
        if (view == this.d && (linearLayout = this.f28120f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f28120f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(kg.q0 q0Var, boolean z10) {
        cg.g gVar = this.f28119e;
        if (q0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            gVar.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f28122r;
            if (i10 < arrayList.size()) {
                long j10 = q0Var.h;
                kg.q0 q0Var2 = ((bn0) arrayList.get(i10)).f27188a;
                long j11 = q0Var2.h;
                if (j10 == j11) {
                    this.h = j11;
                    if (z10) {
                        f(q0Var2);
                    }
                    gVar.l();
                    this.d.u0(i10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(kg.q0 q0Var);

    public final void g(boolean z10) {
        float f9;
        ValueAnimator valueAnimator = this.C;
        if (valueAnimator != null) {
            this.C = null;
            valueAnimator.cancel();
        }
        if (z10) {
            setVisibility(0);
        }
        float f10 = this.B;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f9);
        this.C = ofFloat;
        ofFloat.addUpdateListener(new d70(this, 15));
        this.C.setInterpolator(jr.h);
        this.C.setDuration(320L);
        this.C.addListener(new z9(18, this, z10));
        this.C.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.A);
    }

    public void h(boolean z10) {
        boolean z11;
        int i10;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f28121n;
        arrayList.clear();
        ArrayList arrayList2 = this.f28122r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f28116a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f28126y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                kg.q0 d = kg.q0.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f27188a = d;
                    obj.f27189b = i14;
                    obj.f27190c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f27188a.h == this.h) {
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
        cg.g gVar = this.f28119e;
        if (z10) {
            f2.q.c(new an0(this), true).b(gVar);
        } else {
            gVar.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f28123s = !isPremium;
        if (!isPremium) {
            if (this.f28120f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f28120f = linearLayout;
                linearLayout.setOnClickListener(new u70(this, 13));
                this.f28120f.setOrientation(0);
                i7.h6.b(this.f28120f, 0.03f, 1.25f);
                org.telegram.ui.p9 p9Var = new org.telegram.ui.p9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.g6.f23260o6;
                org.telegram.ui.ActionBar.c6 c6Var = this.f28118c;
                p9Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
                p9Var.setTextSize(1, 12.0f);
                p9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.g6.gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                iq iqVar = new iq(0, mutate);
                iqVar.setTranslateY(0.0f);
                iqVar.setTranslateX(0.0f);
                iqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(iqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                p9Var.setText(spannableStringBuilder);
                p9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, c6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                iq iqVar2 = new iq(0, mutate2);
                iqVar2.setScale(0.76f, 0.76f);
                iqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                iqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(iqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f28120f.addView(p9Var, i7.f6.q(-2, -2, 16));
                this.f28120f.addView(textView, i7.f6.q(-2, -2, 16));
                this.f28120f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f28120f.setClipToPadding(false);
                addView(this.f28120f, i7.f6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f28120f.setVisibility(0);
                this.f28120f.setAlpha(0.0f);
                this.f28120f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f28120f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new xb0(this, 22)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f28120f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f28116a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f28116a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f9) {
        this.A = f9;
        jh.e1 e1Var = this.d;
        e1Var.setPivotX(e1Var.getWidth() / 2.0f);
        e1Var.setPivotY(0.0f);
        e1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f9));
        e1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f9));
        setAlpha(f9);
        invalidate();
    }
}
