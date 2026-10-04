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
public abstract class ao0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.b2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f24610a;
    public final org.telegram.ui.ActionBar.n2 f24611b;
    public final org.telegram.ui.ActionBar.d6 f24612c;
    public final ai.w0 d;
    public final gg.n0 f24613e;
    public LinearLayout f24614f;
    public long h;
    public final ArrayList f24615n;
    public final ArrayList f24616r;
    public boolean f24617s;
    public ah.c v;
    public dh.e f24618w;
    public final Paint f24619x;
    public final long f24620y;

    public ao0(int i10, long j3, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f24615n = new ArrayList();
        this.f24616r = new ArrayList();
        this.f24619x = new Paint(1);
        this.f24610a = i10;
        this.f24611b = n2Var;
        this.f24612c = d6Var;
        this.f24620y = j3;
        zg.p0.o(d6Var);
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 20);
        this.d = w0Var;
        w0Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        w0Var.setClipToPadding(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        w0Var.setLayoutManager(c0Var);
        gg.n0 n0Var = new gg.n0(this, 2);
        this.f24613e = n0Var;
        w0Var.setAdapter(n0Var);
        w0Var.setOverScrollMode(2);
        addView(w0Var, w7.z5.c(-1.0f, -1));
        w0Var.setOnItemClickListener(new sn0(this, i10, n2Var, 0));
        w0Var.setOnItemLongClickListener(new org.telegram.ui.fa(this, i10, n2Var, d6Var, 3));
        s4.j jVar = new s4.j();
        jVar.o(tr.h);
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
        if (R != null && (R.getFragmentView() instanceof lw0) && ((lw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
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
        zg.o0 d = zg.o0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f53479f)) {
            charSequence = Emoji.replaceEmoji(d.f53479f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new z5(d.f53480g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder2.f20367a;
        b2Var.R = append2;
        final un0 un0Var = new un0(context, d6Var);
        un0Var.setOnEditorActionListener(new vn0(un0Var, i10, reaction, b2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        un0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        un0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.i6.f20925j5;
        un0Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i12, d6Var));
        un0Var.setHintColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Xh, d6Var));
        un0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        un0Var.setSingleLine(true);
        un0Var.setFocusable(true);
        un0Var.setInputType(16384);
        un0Var.setLineColors(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20946k6, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20964l6, d6Var), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f21039p7, d6Var));
        un0Var.setImeOptions(6);
        un0Var.setBackgroundDrawable(null);
        un0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.ok.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.ok.n(i12, d6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f7.addView(textView, w7.z5.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(un0Var, w7.z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f7);
        b2Var.f20409a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new gg.d2(un0Var, i10, reaction, 9));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new ru(17));
        if (z10) {
            H = b2Var;
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new b1(view, 7));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            un0 un0Var2 = un0Var;
                            un0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(un0Var2);
                            return;
                        default:
                            un0 un0Var3 = un0Var;
                            un0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(un0Var3);
                            return;
                    }
                }
            });
            H.q(250L);
        } else {
            b2VarArr[0] = b2Var;
            b2Var.setOnDismissListener(new b1(un0Var, 8));
            b2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            un0 un0Var2 = un0Var;
                            un0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(un0Var2);
                            return;
                        default:
                            un0 un0Var3 = un0Var;
                            un0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(un0Var3);
                            return;
                    }
                }
            });
            b2VarArr[0].show();
        }
        b2VarArr[0].f20423h0 = false;
        un0Var.setSelection(un0Var.getText().length());
    }

    public final boolean a() {
        if (this.f24616r.isEmpty() && !this.f24617s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(ah.c cVar, dh.e eVar) {
        this.v = cVar;
        this.f24618w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f24619x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f24614f;
        if (view != null) {
            ch.d c10 = cVar.c(view, null, false);
            c10.x(eh.b.p(this.f24612c));
            c10.A(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(15.0f), AndroidUtilities.dp(9.0f));
            c10.C(AndroidUtilities.dp(5.0f));
            c10.y(AndroidUtilities.dp(4.0f));
            view.setBackground(c10);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.savedReactionTagsUpdate) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == 0 || longValue == this.f24620y) {
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
        if (view == this.d && (linearLayout = this.f24614f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f24614f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(zg.o0 o0Var, boolean z10) {
        gg.n0 n0Var = this.f24613e;
        if (o0Var == null) {
            this.h = 0L;
            if (z10) {
                f(null);
            }
            n0Var.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f24616r;
            if (i10 < arrayList.size()) {
                long j3 = o0Var.h;
                zg.o0 o0Var2 = ((xn0) arrayList.get(i10)).f32948a;
                long j10 = o0Var2.h;
                if (j3 == j10) {
                    this.h = j10;
                    if (z10) {
                        f(o0Var2);
                    }
                    n0Var.l();
                    this.d.v0(i10);
                    return;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    public abstract boolean f(zg.o0 o0Var);

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
        ofFloat.addUpdateListener(new v70(this, 15));
        this.G.setInterpolator(tr.h);
        this.G.setDuration(320L);
        this.G.addListener(new da(18, this, z10));
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
        ArrayList arrayList = this.f24615n;
        arrayList.clear();
        ArrayList arrayList2 = this.f24616r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f24610a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f24620y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j3);
        if (savedReactionTags != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                zg.o0 d = zg.o0.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j3 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f32948a = d;
                    obj.f32949b = i14;
                    obj.f32950c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f32948a.h == this.h) {
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
        gg.n0 n0Var = this.f24613e;
        if (z10) {
            s4.o.c(new wn0(this), true).b(n0Var);
        } else {
            n0Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f24617s = !isPremium;
        if (!isPremium) {
            if (this.f24614f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f24614f = linearLayout;
                linearLayout.setOnClickListener(new l80(this, 13));
                this.f24614f.setOrientation(0);
                w7.b6.b(this.f24614f, 0.03f, 1.25f);
                org.telegram.ui.u9 u9Var = new org.telegram.ui.u9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.i6.f21020o6;
                org.telegram.ui.ActionBar.d6 d6Var = this.f24612c;
                u9Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, d6Var));
                u9Var.setTextSize(1, 12.0f);
                u9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.i6.gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                rq rqVar = new rq(0, mutate);
                rqVar.setTranslateY(0.0f);
                rqVar.setTranslateX(0.0f);
                rqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(rqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                u9Var.setText(spannableStringBuilder);
                u9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, d6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                rq rqVar2 = new rq(0, mutate2);
                rqVar2.setScale(0.76f, 0.76f);
                rqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                rqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(rqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f24614f.addView(u9Var, w7.z5.q(-2, -2, 16));
                this.f24614f.addView(textView, w7.z5.q(-2, -2, 16));
                this.f24614f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f24614f.setClipToPadding(false);
                addView(this.f24614f, w7.z5.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f24614f.setVisibility(0);
                this.f24614f.setAlpha(0.0f);
                this.f24614f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f24614f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new lc0(this, 23)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f24614f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f24610a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f24610a;
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
