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
public abstract class rn0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.d2 H;
    public float E;
    public float F;
    public ValueAnimator G;
    public final int f26697a;
    public final org.telegram.ui.ActionBar.p2 f26698b;
    public final org.telegram.ui.ActionBar.f6 f26699c;
    public final bi.y1 d;
    public final fg.n0 e;
    public LinearLayout f26700f;
    public long h;
    public final ArrayList f26701n;
    public final ArrayList f26702r;
    public boolean f26703s;
    public zg.a v;
    public ch.e f26704w;
    public final Paint f26705x;
    public final long f26706y;

    public rn0(int i10, long j3, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26701n = new ArrayList();
        this.f26702r = new ArrayList();
        this.f26705x = new Paint(1);
        this.f26697a = i10;
        this.f26698b = p2Var;
        this.f26699c = f6Var;
        this.f26706y = j3;
        yg.q0.o(f6Var);
        bi.y1 y1Var = new bi.y1(this, context, f6Var, 19);
        this.d = y1Var;
        y1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        y1Var.setClipToPadding(false);
        s4.c0 c0Var = new s4.c0();
        c0Var.j1(0);
        y1Var.setLayoutManager(c0Var);
        fg.n0 n0Var = new fg.n0(this, 2);
        this.e = n0Var;
        y1Var.setAdapter(n0Var);
        y1Var.setOverScrollMode(2);
        addView(y1Var, w7.a6.c(-1.0f, -1));
        y1Var.setOnItemClickListener(new jn0(this, i10, p2Var, 0));
        y1Var.setOnItemLongClickListener(new org.telegram.ui.ea(this, i10, p2Var, f6Var, 3));
        s4.j jVar = new s4.j();
        jVar.o(wr.h);
        jVar.n(320L);
        y1Var.setItemAnimator(jVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.f6 f6Var) {
        View view;
        boolean z10;
        AlertDialog$Builder alertDialog$Builder;
        CharSequence charSequence;
        int i11;
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        if (R != null && (R.getFragmentView() instanceof aw0) && ((aw0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        if (z10) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        yg.p0 d = yg.p0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f47101f)) {
            charSequence = Emoji.replaceEmoji(d.f47101f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new y5(d.f47102g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f17528a;
        d2Var.R = append2;
        final ln0 ln0Var = new ln0(context, f6Var);
        ln0Var.setOnEditorActionListener(new mn0(ln0Var, i10, reaction, d2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        ln0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        ln0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.j6.f18034j5;
        ln0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        ln0Var.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        ln0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        ln0Var.setSingleLine(true);
        ln0Var.setFocusable(true);
        ln0Var.setInputType(16384);
        ln0Var.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18055k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18073l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f18144p7, f6Var));
        ln0Var.setImeOptions(6);
        ln0Var.setBackgroundDrawable(null);
        ln0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f7 = org.telegram.messenger.em.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.messenger.em.n(i12, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f7.addView(textView, w7.a6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f7.addView(ln0Var, w7.a6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f7);
        d2Var.f17609a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new fg.e2(ln0Var, i10, reaction, 8));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new q2(28));
        if (z10) {
            H = d2Var;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new d1(view, 7));
            H.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ln0 ln0Var2 = ln0Var;
                            ln0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(ln0Var2);
                            return;
                        default:
                            ln0 ln0Var3 = ln0Var;
                            ln0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(ln0Var3);
                            return;
                    }
                }
            });
            H.q(250L);
        } else {
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new d1(ln0Var, 8));
            d2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            ln0 ln0Var2 = ln0Var;
                            ln0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(ln0Var2);
                            return;
                        default:
                            ln0 ln0Var3 = ln0Var;
                            ln0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(ln0Var3);
                            return;
                    }
                }
            });
            d2VarArr[0].show();
        }
        d2VarArr[0].f17622h0 = false;
        ln0Var.setSelection(ln0Var.getText().length());
    }

    public final boolean a() {
        if (this.f26702r.isEmpty() && !this.f26703s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z10);

    public final void d(zg.a aVar, ch.e eVar) {
        this.v = aVar;
        this.f26704w = eVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f26705x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f26700f;
        if (view != null) {
            bh.d c10 = aVar.c(view, null, false);
            c10.n(dh.c.o(this.f26699c));
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
            if (longValue == 0 || longValue == this.f26706y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (e2.h) new gg.g0(2));
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
        if (view == this.d && (linearLayout = this.f26700f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f26700f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j3);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j3);
    }

    public final void e(yg.p0 p0Var, boolean z10) {
        fg.n0 n0Var = this.e;
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
            ArrayList arrayList = this.f26702r;
            if (i10 < arrayList.size()) {
                long j3 = p0Var.h;
                yg.p0 p0Var2 = ((on0) arrayList.get(i10)).f25845a;
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

    public abstract boolean f(yg.p0 p0Var);

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
        ofFloat.addUpdateListener(new q70(this, 15));
        this.G.setInterpolator(wr.h);
        this.G.setDuration(320L);
        this.G.addListener(new yo(14, this, z10));
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
        ArrayList arrayList = this.f26701n;
        arrayList.clear();
        ArrayList arrayList2 = this.f26702r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f26697a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j3 = this.f26706y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j3);
        if (savedReactionTags != null) {
            int i12 = 0;
            z11 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                yg.p0 d = yg.p0.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j3 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f25845a = d;
                    obj.f25846b = i14;
                    obj.f25847c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f25845a.h == this.h) {
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
        fg.n0 n0Var = this.e;
        if (z10) {
            s4.o.c(new nn0(this), true).b(n0Var);
        } else {
            n0Var.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f26703s = !isPremium;
        if (!isPremium) {
            if (this.f26700f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f26700f = linearLayout;
                linearLayout.setOnClickListener(new g80(this, 13));
                this.f26700f.setOrientation(0);
                w7.c6.b(this.f26700f, 0.03f, 1.25f);
                org.telegram.ui.s9 s9Var = new org.telegram.ui.s9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.j6.f18126o6;
                org.telegram.ui.ActionBar.f6 f6Var = this.f26699c;
                s9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
                s9Var.setTextSize(1, 12.0f);
                s9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.j6.gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                uq uqVar = new uq(0, mutate);
                uqVar.setTranslateY(0.0f);
                uqVar.setTranslateX(0.0f);
                uqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(uqVar, 0, spannableString.length(), 17);
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
                uq uqVar2 = new uq(0, mutate2);
                uqVar2.setScale(0.76f, 0.76f);
                uqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                uqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(uqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f26700f.addView(s9Var, w7.a6.q(-2, -2, 16));
                this.f26700f.addView(textView, w7.a6.q(-2, -2, 16));
                this.f26700f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f26700f.setClipToPadding(false);
                addView(this.f26700f, w7.a6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z10) {
                this.f26700f.setVisibility(0);
                this.f26700f.setAlpha(0.0f);
                this.f26700f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f26700f;
        if (linearLayout2 != null) {
            if (z10) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new kc0(this, 22)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f26700f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f26697a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f26697a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f7) {
        this.E = f7;
        bi.y1 y1Var = this.d;
        y1Var.setPivotX(y1Var.getWidth() / 2.0f);
        y1Var.setPivotY(0.0f);
        y1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        y1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f7));
        setAlpha(f7);
        invalidate();
    }
}
