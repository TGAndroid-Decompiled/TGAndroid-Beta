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
public abstract class hn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f26762a;
    public final org.telegram.ui.ActionBar.n2 f26763b;
    public final org.telegram.ui.ActionBar.f6 f26764c;
    public final bi.o0 d;
    public final hg.n0 f26765e;
    public LinearLayout f26766f;
    public long h;
    public final ArrayList f26767n;
    public final ArrayList f26768r;
    public boolean f26769s;
    public bh.b v;
    public eh.e f26770w;
    public final Paint f26771x;
    public final long f26772y;

    public hn0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26767n = new ArrayList();
        this.f26768r = new ArrayList();
        this.f26771x = new Paint(1);
        this.f26762a = i10;
        this.f26763b = n2Var;
        this.f26764c = f6Var;
        this.f26772y = j3;
        ah.k1.o(f6Var);
        bi.o0 o0Var = new bi.o0(this, context, f6Var, 20);
        this.d = o0Var;
        o0Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        o0Var.setClipToPadding(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        o0Var.setLayoutManager(c0Var);
        hg.n0 n0Var = new hg.n0(this, 2);
        this.f26765e = n0Var;
        o0Var.setAdapter(n0Var);
        o0Var.setOverScrollMode(2);
        addView(o0Var, w7.x5.c(-1.0f, -1));
        o0Var.setOnItemClickListener(new zm0(this, i10, n2Var, 0));
        o0Var.setOnItemLongClickListener(new org.telegram.ui.da(this, i10, n2Var, f6Var, 3));
        s4.j jVar = new s4.j();
        jVar.o(pr.h);
        jVar.n(320L);
        o0Var.setItemAnimator(jVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.f6 f6Var) {
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
        if (R != null && (R.getFragmentView() instanceof ov0) && ((ov0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        ah.j1 d = ah.j1.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f597f)) {
            charSequence = Emoji.replaceEmoji(d.f597f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new z5(d.f598g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20198a;
        b2Var.R = append2;
        final bn0 bn0Var = new bn0(context, f6Var);
        bn0Var.setOnEditorActionListener(new cn0(bn0Var, i10, reaction, b2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        bn0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        bn0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.j6.f20770j5;
        bn0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        bn0Var.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        bn0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        bn0Var.setSingleLine(true);
        bn0Var.setFocusable(true);
        bn0Var.setInputType(16384);
        bn0Var.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20791k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20809l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20880p7, f6Var));
        bn0Var.setImeOptions(6);
        bn0Var.setBackgroundDrawable(null);
        bn0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.vl.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.vl.n(i12, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f7.addView(textView, w7.x5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(bn0Var, w7.x5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f7);
        b2Var.f20224a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new hg.c2(bn0Var, i10, reaction, 8));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new p2(27));
        if (z10) {
            H = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new c1(view, 7));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            bn0 bn0Var2 = bn0Var;
                            bn0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(bn0Var2);
                            return;
                        default:
                            bn0 bn0Var3 = bn0Var;
                            bn0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(bn0Var3);
                            return;
                    }
                }
            });
            H.q(250L);
        } else {
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new c1(bn0Var, 8));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            bn0 bn0Var2 = bn0Var;
                            bn0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(bn0Var2);
                            return;
                        default:
                            bn0 bn0Var3 = bn0Var;
                            bn0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(bn0Var3);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[0].f20238h0 = false;
        bn0Var.setSelection(bn0Var.getText().length());
    }

    public final boolean a() {
        if (this.f26768r.isEmpty() && !this.f26769s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(bh.b bVar, eh.e eVar) {
        this.v = bVar;
        this.f26770w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f26771x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f26766f;
        if (view != null) {
            dh.d c10 = bVar.c(view, null, false);
            c10.n(fh.b.o(this.f26764c));
            c10.q(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.t(AndroidUtilities.dp(5.0f));
            c10.o(AndroidUtilities.dp(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.f26772y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (e2.h) new bi.f(19));
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
        if (view == this.d && (linearLayout = this.f26766f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f26766f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(ah.j1 j1Var, boolean z10) {
        hg.n0 n0Var = this.f26765e;
        if (j1Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            n0Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f26768r;
            if (i10 < arrayList.size()) {
                long j3 = j1Var.h;
                ah.j1 j1Var2 = ((en0) arrayList.get(i10)).f25737a;
                long j10 = j1Var2.h;
                if (j3 == j10) {
                    this.h = j10;
                    if (z10) {
                        f(j1Var2);
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

    public abstract boolean f(ah.j1 j1Var);

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
        ofFloat.addUpdateListener(new h70(this, 15));
        this.G.setInterpolator(pr.h);
        this.G.setDuration(320L);
        this.G.addListener(new org.telegram.ui.to(19, this, z10));
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
        ArrayList arrayList = this.f26767n;
        arrayList.clear();
        ArrayList arrayList2 = this.f26768r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f26762a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f26772y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j3);
        if (savedReactionTags != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                ah.j1 d = ah.j1.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j3 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f25737a = d;
                    obj.f25738b = i14;
                    obj.f25739c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f25737a.h == this.h) {
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
        hg.n0 n0Var = this.f26765e;
        if (z10) {
            s4.o.c(new dn0(this), true).b(n0Var);
        } else {
            n0Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f26769s = !isPremium;
        if (!isPremium) {
            if (this.f26766f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f26766f = linearLayout;
                linearLayout.setOnClickListener(new x70(this, 13));
                this.f26766f.setOrientation(0);
                w7.z5.b(this.f26766f, 0.03f, 1.25f);
                org.telegram.ui.s9 s9Var = new org.telegram.ui.s9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.j6.f20862o6;
                org.telegram.ui.ActionBar.f6 f6Var = this.f26764c;
                s9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
                s9Var.setTextSize(1, 12.0f);
                s9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.j6.gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                nq nqVar = new nq(0, mutate);
                nqVar.setTranslateY(0.0f);
                nqVar.setTranslateX(0.0f);
                nqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(nqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                s9Var.setText(spannableStringBuilder);
                s9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                nq nqVar2 = new nq(0, mutate2);
                nqVar2.setScale(0.76f, 0.76f);
                nqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                nqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(nqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f26766f.addView(s9Var, w7.x5.q(-2, -2, 16));
                this.f26766f.addView(textView, w7.x5.q(-2, -2, 16));
                this.f26766f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f26766f.setClipToPadding(false);
                addView(this.f26766f, w7.x5.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f26766f.setVisibility(0);
                this.f26766f.setAlpha(0.0f);
                this.f26766f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f26766f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new cc0(this, 22)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f26766f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f26762a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f26762a;
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
