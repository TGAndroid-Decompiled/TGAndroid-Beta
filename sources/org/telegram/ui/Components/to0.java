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
public abstract class to0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.a2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f30907a;
    public final org.telegram.ui.ActionBar.m2 f30908b;
    public final org.telegram.ui.ActionBar.c6 f30909c;
    public final ai.w0 d;
    public final gg.m0 f30910e;
    public LinearLayout f30911f;
    public long h;
    public final ArrayList f30912n;
    public final ArrayList f30913r;
    public boolean f30914s;
    public ah.c v;
    public dh.e f30915w;
    public final Paint f30916x;
    public final long f30917y;

    public to0(int i10, long j3, Context context, org.telegram.ui.ActionBar.m2 m2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f30912n = new ArrayList();
        this.f30913r = new ArrayList();
        this.f30916x = new Paint(1);
        this.f30907a = i10;
        this.f30908b = m2Var;
        this.f30909c = c6Var;
        this.f30917y = j3;
        zg.o0.o(c6Var);
        ai.w0 w0Var = new ai.w0(this, context, c6Var, 20);
        this.d = w0Var;
        w0Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        w0Var.setClipToPadding(false);
        s4.d0 d0Var = new s4.d0();
        d0Var.j1(0);
        w0Var.setLayoutManager(d0Var);
        gg.m0 m0Var = new gg.m0(this, 2);
        this.f30910e = m0Var;
        w0Var.setAdapter(m0Var);
        w0Var.setOverScrollMode(2);
        addView(w0Var, w7.w5.d(-1.0f, -1));
        w0Var.setOnItemClickListener(new lo0(this, i10, m2Var, 0));
        w0Var.setOnItemLongClickListener(new org.telegram.ui.ha(this, i10, m2Var, c6Var, 3));
        s4.j jVar = new s4.j();
        jVar.o(js.h);
        jVar.n(320L);
        w0Var.setItemAnimator(jVar);
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
        if (R != null && (R.getFragmentView() instanceof yw0) && ((yw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
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
        zg.n0 d = zg.n0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f54849f)) {
            charSequence = Emoji.replaceEmoji(d.f54849f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new b6(d.f54850g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder2.f20142a;
        a2Var.R = append2;
        final no0 no0Var = new no0(context, c6Var);
        no0Var.setOnEditorActionListener(new oo0(no0Var, i10, reaction, a2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        no0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        no0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.h6.f20668j5;
        no0Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, c6Var));
        no0Var.setHintColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Xh, c6Var));
        no0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        no0Var.setSingleLine(true);
        no0Var.setFocusable(true);
        no0Var.setInputType(16384);
        no0Var.setLineColors(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20688k6, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20706l6, c6Var), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20781p7, c6Var));
        no0Var.setImeOptions(6);
        no0Var.setBackgroundDrawable(null);
        no0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout e7 = org.telegram.messenger.am.e(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.am.o(i12, c6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        e7.addView(textView, w7.w5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        e7.addView(no0Var, w7.w5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(e7);
        a2Var.f20151a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new gg.c2(no0Var, i10, reaction, 9));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new je0(7));
        if (z10) {
            H = a2Var;
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new b1(view, 8));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            no0 no0Var2 = no0Var;
                            no0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(no0Var2);
                            return;
                        default:
                            no0 no0Var3 = no0Var;
                            no0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(no0Var3);
                            return;
                    }
                }
            });
            H.q(250L);
        } else {
            a2VarArr[0] = a2Var;
            a2Var.setOnDismissListener(new b1(no0Var, 9));
            a2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            no0 no0Var2 = no0Var;
                            no0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(no0Var2);
                            return;
                        default:
                            no0 no0Var3 = no0Var;
                            no0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(no0Var3);
                            return;
                    }
                }
            });
            a2VarArr[0].show();
        }
        a2VarArr[0].f20165h0 = false;
        no0Var.setSelection(no0Var.getText().length());
    }

    public final boolean a() {
        if (this.f30913r.isEmpty() && !this.f30914s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(ah.c cVar, dh.e eVar) {
        this.v = cVar;
        this.f30915w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f30916x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f30911f;
        if (view != null) {
            ch.d c10 = cVar.c(view, null, false);
            c10.o(eh.b.o(this.f30909c));
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
            if (longValue == 0 || longValue == this.f30917y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new ai.i(5));
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
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f30911f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f30911f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(zg.n0 n0Var, boolean z10) {
        gg.m0 m0Var = this.f30910e;
        if (n0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            m0Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f30913r;
            if (i10 < arrayList.size()) {
                long j3 = n0Var.h;
                zg.n0 n0Var2 = ((qo0) arrayList.get(i10)).f29875a;
                long j10 = n0Var2.h;
                if (j3 == j10) {
                    this.h = j10;
                    if (z10) {
                        f(n0Var2);
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

    public abstract boolean f(zg.n0 n0Var);

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
        ofFloat.addUpdateListener(new m80(this, 16));
        this.G.setInterpolator(js.h);
        this.G.setDuration(320L);
        this.G.addListener(new ea(18, this, z10));
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
        ArrayList arrayList = this.f30912n;
        arrayList.clear();
        ArrayList arrayList2 = this.f30913r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f30907a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f30917y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j3);
        if (savedReactionTags != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                zg.n0 d = zg.n0.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j3 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f29875a = d;
                    obj.f29876b = i14;
                    obj.f29877c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f29875a.h == this.h) {
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
        gg.m0 m0Var = this.f30910e;
        if (z10) {
            s4.o.c(new po0(this), true).b(m0Var);
        } else {
            m0Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f30914s = !isPremium;
        if (!isPremium) {
            if (this.f30911f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f30911f = linearLayout;
                linearLayout.setOnClickListener(new f90(this, 13));
                this.f30911f.setOrientation(0);
                w7.y5.b(this.f30911f, 0.03f, 1.25f);
                org.telegram.ui.v9 v9Var = new org.telegram.ui.v9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.h6.f20763o6;
                org.telegram.ui.ActionBar.c6 c6Var = this.f30909c;
                v9Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, c6Var));
                v9Var.setTextSize(1, 12.0f);
                v9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.h6.gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                gr grVar = new gr(0, mutate);
                grVar.setTranslateY(0.0f);
                grVar.setTranslateX(0.0f);
                grVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(grVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                v9Var.setText(spannableStringBuilder);
                v9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, c6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                gr grVar2 = new gr(0, mutate2);
                grVar2.setScale(0.76f, 0.76f);
                grVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                grVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(grVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f30911f.addView(v9Var, w7.w5.q(-2, -2, 16));
                this.f30911f.addView(textView, w7.w5.q(-2, -2, 16));
                this.f30911f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f30911f.setClipToPadding(false);
                addView(this.f30911f, w7.w5.a(-1.0f, 5.0f, 0.0f, 5.0f, 0.0f, -2, 19));
            }
            if (!z10) {
                this.f30911f.setVisibility(0);
                this.f30911f.setAlpha(0.0f);
                this.f30911f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f30911f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new cd0(this, 23)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f30911f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f30907a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f30907a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f7) {
        this.E = f7;
        ai.w0 w0Var = this.d;
        w0Var.setPivotX(w0Var.getWidth() / 2.0f);
        w0Var.setPivotY(0.0f);
        w0Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        w0Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
