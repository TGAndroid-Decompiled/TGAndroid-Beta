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
public abstract class in0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f25004a;
    public final org.telegram.ui.ActionBar.n2 f25005b;
    public final org.telegram.ui.ActionBar.d6 f25006c;
    public final ai.w0 d;
    public final gg.n0 e;
    public LinearLayout f25007f;
    public long h;
    public final ArrayList f25008n;
    public final ArrayList f25009r;
    public boolean f25010s;
    public ah.c v;
    public dh.e f25011w;
    public final Paint f25012x;
    public final long f25013y;

    public in0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f25008n = new ArrayList();
        this.f25009r = new ArrayList();
        this.f25012x = new Paint(1);
        this.f25004a = i10;
        this.f25005b = n2Var;
        this.f25006c = d6Var;
        this.f25013y = j3;
        zg.q0.o(d6Var);
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 20);
        this.d = w0Var;
        w0Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        w0Var.setClipToPadding(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        w0Var.setLayoutManager(c0Var);
        gg.n0 n0Var = new gg.n0(this, 2);
        this.e = n0Var;
        w0Var.setAdapter(n0Var);
        w0Var.setOverScrollMode(2);
        addView(w0Var, w7.x5.c(-1.0f, -1));
        w0Var.setOnItemClickListener(new an0(this, i10, n2Var, 0));
        w0Var.setOnItemLongClickListener(new org.telegram.ui.da(this, i10, n2Var, d6Var, 3));
        s4.j jVar = new s4.j();
        jVar.o(rr.h);
        jVar.n(320L);
        w0Var.setItemAnimator(jVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.d6 d6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i11;
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, d6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        zg.p0 d = zg.p0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f49071f)) {
            charSequence = Emoji.replaceEmoji(d.f49071f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new z5(d.f49072g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f18409a;
        b2Var.R = append2;
        final cn0 cn0Var = new cn0(context, d6Var);
        cn0Var.setOnEditorActionListener(new dn0(cn0Var, i10, reaction, b2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        cn0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        cn0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.h6.f18895j5;
        cn0Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i12, d6Var));
        cn0Var.setHintColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Xh, d6Var));
        cn0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        cn0Var.setSingleLine(true);
        cn0Var.setFocusable(true);
        cn0Var.setInputType(16384);
        cn0Var.setLineColors(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18916k6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f18934l6, d6Var), org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19008p7, d6Var));
        cn0Var.setImeOptions(6);
        cn0Var.setBackgroundDrawable(null);
        cn0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.ul.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.ul.o(i12, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f7.addView(textView, w7.x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(cn0Var, w7.x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f7);
        b2Var.f18447a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new gg.d2(cn0Var, i10, reaction, 9));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new xc0(13));
        if (z10) {
            H = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new b1(view, 7));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            cn0 cn0Var2 = cn0Var;
                            cn0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(cn0Var2);
                            return;
                        default:
                            cn0 cn0Var3 = cn0Var;
                            cn0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(cn0Var3);
                            return;
                    }
                }
            });
            H.q(250L);
        } else {
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new b1(cn0Var, 8));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            cn0 cn0Var2 = cn0Var;
                            cn0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(cn0Var2);
                            return;
                        default:
                            cn0 cn0Var3 = cn0Var;
                            cn0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(cn0Var3);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[0].f18460h0 = false;
        cn0Var.setSelection(cn0Var.getText().length());
    }

    public final boolean a() {
        if (this.f25009r.isEmpty() && !this.f25010s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(ah.c cVar, dh.e eVar) {
        this.v = cVar;
        this.f25011w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f25012x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f25007f;
        if (view != null) {
            ch.d c10 = cVar.c(view, null, false);
            c10.o(eh.b.o(this.f25006c));
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
            if (longValue == 0 || longValue == this.f25013y) {
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
        if (view == this.d && (linearLayout = this.f25007f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f25007f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(zg.p0 p0Var, boolean z10) {
        gg.n0 n0Var = this.e;
        if (p0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            n0Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f25009r;
            if (i10 < arrayList.size()) {
                long j3 = p0Var.h;
                zg.p0 p0Var2 = ((fn0) arrayList.get(i10)).f24013a;
                long j10 = p0Var2.h;
                if (j3 == j10) {
                    this.h = j10;
                    if (z10) {
                        f(p0Var2);
                    }
                    n0Var.l();
                    this.d.u0(i10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(zg.p0 p0Var);

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
        ofFloat.addUpdateListener(new i70(this, 15));
        this.G.setInterpolator(rr.h);
        this.G.setDuration(320L);
        this.G.addListener(new ca(18, this, z10));
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
        ArrayList arrayList = this.f25008n;
        arrayList.clear();
        ArrayList arrayList2 = this.f25009r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f25004a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f25013y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j3);
        if (savedReactionTags != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                zg.p0 d = zg.p0.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j3 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f24013a = d;
                    obj.f24014b = i14;
                    obj.f24015c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f24013a.h == this.h) {
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
        gg.n0 n0Var = this.e;
        if (z10) {
            s4.o.c(new en0(this), true).b(n0Var);
        } else {
            n0Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f25010s = !isPremium;
        if (!isPremium) {
            if (this.f25007f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f25007f = linearLayout;
                linearLayout.setOnClickListener(new y70(this, 13));
                this.f25007f.setOrientation(0);
                w7.z5.b(this.f25007f, 0.03f, 1.25f);
                org.telegram.ui.s9 s9Var = new org.telegram.ui.s9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.h6.f18990o6;
                org.telegram.ui.ActionBar.d6 d6Var = this.f25006c;
                s9Var.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, d6Var));
                s9Var.setTextSize(1, 12.0f);
                s9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.h6.gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                pq pqVar = new pq(0, mutate);
                pqVar.setTranslateY(0.0f);
                pqVar.setTranslateX(0.0f);
                pqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(pqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                s9Var.setText(spannableStringBuilder);
                s9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, d6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                pq pqVar2 = new pq(0, mutate2);
                pqVar2.setScale(0.76f, 0.76f);
                pqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                pqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(pqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f25007f.addView(s9Var, w7.x5.q(-2, -2, 16));
                this.f25007f.addView(textView, w7.x5.q(-2, -2, 16));
                this.f25007f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f25007f.setClipToPadding(false);
                addView(this.f25007f, w7.x5.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f25007f.setVisibility(0);
                this.f25007f.setAlpha(0.0f);
                this.f25007f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f25007f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new ac0(this, 22)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f25007f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f25004a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f25004a;
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
