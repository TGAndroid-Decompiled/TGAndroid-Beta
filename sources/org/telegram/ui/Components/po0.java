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
public abstract class po0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.e2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f31683a;
    public final org.telegram.ui.ActionBar.r2 f31684b;
    public final org.telegram.ui.ActionBar.u6 f31685c;
    public final bi.r1 d;
    public final bi.h5 e;
    public LinearLayout f31686f;
    public long h;
    public final ArrayList f31687n;
    public final ArrayList f31688r;
    public boolean f31689s;
    public ch.b v;
    public fh.e f31690w;
    public final Paint f31691x;
    public final long f31692y;

    public po0(int i10, long j10, Context context, org.telegram.ui.ActionBar.r2 r2Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context);
        this.f31687n = new ArrayList();
        this.f31688r = new ArrayList();
        this.f31691x = new Paint(1);
        this.f31683a = i10;
        this.f31684b = r2Var;
        this.f31685c = u6Var;
        this.f31692y = j10;
        bh.y0.o(u6Var);
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 21);
        this.d = r1Var;
        r1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        r1Var.setClipToPadding(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.k1(0);
        r1Var.setLayoutManager(c0Var);
        bi.h5 h5Var = new bi.h5(this, 3);
        this.e = h5Var;
        r1Var.setAdapter(h5Var);
        r1Var.setOverScrollMode(2);
        addView(r1Var, kb1.g(-1.0f, -1));
        r1Var.setOnItemClickListener(new ho0(this, i10, r2Var, 0));
        r1Var.setOnItemLongClickListener(new ag.k0(this, i10, r2Var, u6Var, 4));
        s4.l lVar = new s4.l();
        lVar.o(ds.h);
        lVar.n(320L);
        r1Var.setItemAnimator(lVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.u6 u6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i11;
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof ww0) && ((ww0) R.getFragmentView()).Q() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.e2[] e2VarArr = new org.telegram.ui.ActionBar.e2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, u6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        bh.x0 d = bh.x0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f4208f)) {
            charSequence = Emoji.replaceEmoji(d.f4208f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new c6(d.f4209g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder2.f22369a;
        e2Var.R = append2;
        final jo0 jo0Var = new jo0(context, u6Var);
        jo0Var.setOnEditorActionListener(new ko0(jo0Var, i10, reaction, e2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        jo0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        jo0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(jo0Var, i12, u6Var);
        org.telegram.ui.ActionBar.f7.m(jo0Var, 34, org.telegram.ui.ActionBar.y6.Xh, u6Var);
        jo0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        jo0Var.setSingleLine(true);
        jo0Var.setFocusable(true);
        jo0Var.setInputType(16384);
        org.telegram.ui.ActionBar.f7.G(jo0Var, org.telegram.ui.ActionBar.y6.f23485k6, org.telegram.ui.ActionBar.y6.f23503l6, org.telegram.ui.ActionBar.y6.f23582p7, u6Var);
        jo0Var.setImeOptions(6);
        jo0Var.setBackgroundDrawable(null);
        jo0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout d10 = org.telegram.messenger.wh.d(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView, i12, u6Var);
        textView.setTextSize(1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        d10.addView(textView, kb1.o(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        d10.addView(jo0Var, kb1.o(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.o(d10);
        e2Var.f22556a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new i2.z(jo0Var, i10, reaction, 9));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new rd0(12));
        if (z10) {
            H = e2Var;
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new z0(view, 8));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            jo0 jo0Var2 = jo0Var;
                            jo0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(jo0Var2);
                            return;
                        default:
                            jo0 jo0Var3 = jo0Var;
                            jo0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(jo0Var3);
                            return;
                    }
                }
            });
            H.r(250L);
        } else {
            e2VarArr[0] = e2Var;
            e2Var.setOnDismissListener(new z0(jo0Var, 9));
            e2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            jo0 jo0Var2 = jo0Var;
                            jo0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(jo0Var2);
                            return;
                        default:
                            jo0 jo0Var3 = jo0Var;
                            jo0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(jo0Var3);
                            return;
                    }
                }
            });
            e2VarArr[0].show();
        }
        e2VarArr[0].f22578j0 = false;
        jo0Var.setSelection(jo0Var.getText().length());
    }

    public final boolean a() {
        if (this.f31688r.isEmpty() && !this.f31689s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(ch.b bVar, fh.e eVar) {
        this.v = bVar;
        this.f31690w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f31691x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f31686f;
        if (view != null) {
            eh.d c10 = bVar.c(view, null, false);
            c10.v(gh.c.p(this.f31685c));
            c10.y(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.A(AndroidUtilities.dp(5.0f));
            c10.w(AndroidUtilities.dp(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.f31692y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (Utilities.Callback<View>) new di.e(5));
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
        if (view == this.d && (linearLayout = this.f31686f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f31686f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(bh.x0 x0Var, boolean z10) {
        bi.h5 h5Var = this.e;
        if (x0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            h5Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f31688r;
            if (i10 < arrayList.size()) {
                long j10 = x0Var.h;
                bh.x0 x0Var2 = ((mo0) arrayList.get(i10)).f30567a;
                long j11 = x0Var2.h;
                if (j10 == j11) {
                    this.h = j11;
                    if (z10) {
                        f(x0Var2);
                    }
                    h5Var.l();
                    this.d.v0(i10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(bh.x0 x0Var);

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
        ofFloat.addUpdateListener(new f80(this, 16));
        this.G.setInterpolator(ds.h);
        this.G.setDuration(320L);
        this.G.addListener(new org.telegram.ui.lo(19, this, z10));
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
        ArrayList arrayList = this.f31687n;
        arrayList.clear();
        ArrayList arrayList2 = this.f31688r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f31683a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f31692y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                bh.x0 d = bh.x0.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f30567a = d;
                    obj.f30568b = i14;
                    obj.f30569c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f30567a.h == this.h) {
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
        bi.h5 h5Var = this.e;
        if (z10) {
            s4.p.c(new lo0(this), true).c(h5Var);
        } else {
            h5Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f31689s = !isPremium;
        if (!isPremium) {
            if (this.f31686f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f31686f = linearLayout;
                linearLayout.setOnClickListener(new x80(this, 11));
                this.f31686f.setOrientation(0);
                kb1.c(this.f31686f, 0.03f, 1.25f);
                org.telegram.ui.w9 w9Var = new org.telegram.ui.w9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.y6.f23561o6;
                org.telegram.ui.ActionBar.u6 u6Var = this.f31685c;
                org.telegram.ui.ActionBar.f7.V(w9Var, i15, u6Var);
                w9Var.setTextSize(1, 12.0f);
                w9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.y6.gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                zq zqVar = new zq(0, mutate);
                zqVar.setTranslateY(0.0f);
                zqVar.setTranslateX(0.0f);
                zqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(zqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                w9Var.setText(spannableStringBuilder);
                w9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                org.telegram.ui.ActionBar.f7.V(textView, i15, u6Var);
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                zq zqVar2 = new zq(0, mutate2);
                zqVar2.setScale(0.76f, 0.76f);
                zqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                zqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(zqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f31686f.addView(w9Var, kb1.u(-2, -2, 16));
                this.f31686f.addView(textView, kb1.u(-2, -2, 16));
                this.f31686f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f31686f.setClipToPadding(false);
                addView(this.f31686f, kb1.h(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f31686f.setVisibility(0);
                this.f31686f.setAlpha(0.0f);
                this.f31686f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f31686f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new xa0(this, 25)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f31686f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f31683a;
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f31683a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f7) {
        this.E = f7;
        bi.r1 r1Var = this.d;
        r1Var.setPivotX(r1Var.getWidth() / 2.0f);
        r1Var.setPivotY(0.0f);
        r1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        r1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
