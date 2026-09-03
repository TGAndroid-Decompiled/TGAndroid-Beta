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
public abstract class on0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static org.telegram.ui.ActionBar.d2 E;
    public float B;
    public float C;
    public ValueAnimator D;
    public final int f29824a;
    public final org.telegram.ui.ActionBar.p2 f29825b;
    public final org.telegram.ui.ActionBar.g6 f29826c;
    public final mh.d1 d;
    public final fg.g f29827e;
    public LinearLayout f29828f;
    public long h;
    public final ArrayList f29829n;
    public final ArrayList f29830r;
    public boolean f29831s;
    public og.a v;
    public rg.d f29832w;
    public final Paint f29833x;
    public final long f29834y;

    public on0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29829n = new ArrayList();
        this.f29830r = new ArrayList();
        this.f29833x = new Paint(1);
        this.f29824a = i10;
        this.f29825b = p2Var;
        this.f29826c = g6Var;
        this.f29834y = j10;
        ng.r0.o(g6Var);
        mh.d1 d1Var = new mh.d1(this, context, g6Var, 18);
        this.d = d1Var;
        d1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        d1Var.setClipToPadding(false);
        f2.j0 j0Var = new f2.j0();
        j0Var.j1(0);
        d1Var.setLayoutManager(j0Var);
        fg.g gVar = new fg.g(this, 3);
        this.f29827e = gVar;
        d1Var.setAdapter(gVar);
        d1Var.setOverScrollMode(2);
        addView(d1Var, k7.c6.c(-1.0f, -1));
        d1Var.setOnItemClickListener(new fg.v1(this, i10, p2Var, 1));
        d1Var.setOnItemLongClickListener(new hg.a0(this, i10, p2Var, g6Var, 5));
        f2.l lVar = new f2.l();
        lVar.o(pr.h);
        lVar.n(320L);
        d1Var.setItemAnimator(lVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.g6 g6Var) {
        View view;
        boolean z4;
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
        if (R != null && (R.getFragmentView() instanceof pv0) && ((pv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, g6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        ng.q0 d = ng.q0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f16180f)) {
            charSequence = Emoji.replaceEmoji(d.f16180f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new u5(d.f16181g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f21168a;
        d2Var.O = append2;
        final in0 in0Var = new in0(context, g6Var);
        in0Var.setOnEditorActionListener(new jn0(in0Var, i10, reaction, d2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        in0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        in0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.k6.f21768j5;
        in0Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        in0Var.setHintColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xh, g6Var));
        in0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        in0Var.setSingleLine(true);
        in0Var.setFocusable(true);
        in0Var.setInputType(16384);
        in0Var.setLineColors(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21787k6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21805l6, g6Var), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21878p7, g6Var));
        in0Var.setImeOptions(6);
        in0Var.setBackgroundDrawable(null);
        in0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(i12, g6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f10.addView(textView, k7.c6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(in0Var, k7.c6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f10);
        d2Var.f21237a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new e3.d(in0Var, i10, reaction, 6));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new mh0(1));
        if (z4) {
            E = d2Var;
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new b1(view, 7));
            E.setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            in0 in0Var2 = in0Var;
                            in0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(in0Var2);
                            return;
                        default:
                            in0 in0Var3 = in0Var;
                            in0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(in0Var3);
                            return;
                    }
                }
            });
            E.q(250L);
        } else {
            d2VarArr[0] = d2Var;
            d2Var.setOnDismissListener(new b1(in0Var, 8));
            d2VarArr[0].setOnShowListener(new DialogInterface.OnShowListener() {
                @Override
                public final void onShow(DialogInterface dialogInterface) {
                    switch (r2) {
                        case 0:
                            in0 in0Var2 = in0Var;
                            in0Var2.requestFocus();
                            AndroidUtilities.showKeyboard(in0Var2);
                            return;
                        default:
                            in0 in0Var3 = in0Var;
                            in0Var3.requestFocus();
                            AndroidUtilities.showKeyboard(in0Var3);
                            return;
                    }
                }
            });
            d2VarArr[0].show();
        }
        d2VarArr[0].f21245e0 = false;
        in0Var.setSelection(in0Var.getText().length());
    }

    public final boolean a() {
        if (this.f29830r.isEmpty() && !this.f29831s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z4);

    public final void d(og.a aVar, rg.d dVar) {
        this.v = aVar;
        this.f29832w = dVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f29833x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f29828f;
        if (view != null) {
            qg.b c3 = aVar.c(view, null, false);
            c3.n(sg.b.o(this.f29826c));
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
            if (longValue == 0 || longValue == this.f29834y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (h5.d) new ag.d(0));
        }
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.B < 0.5f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        LinearLayout linearLayout;
        if (view == this.d && (linearLayout = this.f29828f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f29828f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(ng.q0 q0Var, boolean z4) {
        fg.g gVar = this.f29827e;
        if (q0Var == null) {
            this.h = 0L;
            if (z4) {
                f(null);
            }
            gVar.l();
            return;
        }
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f29830r;
            if (i10 < arrayList.size()) {
                long j10 = q0Var.h;
                ng.q0 q0Var2 = ((ln0) arrayList.get(i10)).f28810a;
                long j11 = q0Var2.h;
                if (j10 == j11) {
                    this.h = j11;
                    if (z4) {
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

    public abstract boolean f(ng.q0 q0Var);

    public final void g(boolean z4) {
        float f10;
        ValueAnimator valueAnimator = this.D;
        if (valueAnimator != null) {
            this.D = null;
            valueAnimator.cancel();
        }
        if (z4) {
            setVisibility(0);
        }
        float f11 = this.C;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
        this.D = ofFloat;
        ofFloat.addUpdateListener(new k70(this, 15));
        this.D.setInterpolator(pr.h);
        this.D.setDuration(320L);
        this.D.addListener(new x20(8, this, z4));
        this.D.start();
    }

    public int getCurrentHeight() {
        return (int) (getMeasuredHeight() * this.B);
    }

    public void h(boolean z4) {
        boolean z10;
        int i10;
        String str;
        int hashCode;
        HashSet hashSet = new HashSet();
        ArrayList arrayList = this.f29829n;
        arrayList.clear();
        ArrayList arrayList2 = this.f29830r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f29824a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f29834y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i12 = 0;
            z10 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                ng.q0 d = ng.q0.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f28810a = d;
                    obj.f28811b = i14;
                    obj.f28812c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f28810a.h == this.h) {
                        z10 = true;
                    }
                    arrayList2.add(obj);
                    hashSet.add(Long.valueOf(d.h));
                }
                i12 = i13 + 1;
            }
        } else {
            z10 = false;
        }
        if (!z10 && this.h != 0) {
            this.h = 0L;
            f(null);
        }
        fg.g gVar = this.f29827e;
        if (z4) {
            f2.q.c(new kn0(this), true).b(gVar);
        } else {
            gVar.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f29831s = !isPremium;
        if (!isPremium) {
            if (this.f29828f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f29828f = linearLayout;
                linearLayout.setOnClickListener(new b80(this, 13));
                this.f29828f.setOrientation(0);
                k7.e6.b(this.f29828f, 0.03f, 1.25f);
                org.telegram.ui.t9 t9Var = new org.telegram.ui.t9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.k6.f21859o6;
                org.telegram.ui.ActionBar.g6 g6Var = this.f29826c;
                t9Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, g6Var));
                t9Var.setTextSize(1, 12.0f);
                t9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.k6.f21722gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                oq oqVar = new oq(0, mutate);
                oqVar.setTranslateY(0.0f);
                oqVar.setTranslateX(0.0f);
                oqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(oqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                t9Var.setText(spannableStringBuilder);
                t9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, g6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                oq oqVar2 = new oq(0, mutate2);
                oqVar2.setScale(0.76f, 0.76f);
                oqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                oqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(oqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f29828f.addView(t9Var, k7.c6.q(-2, -2, 16));
                this.f29828f.addView(textView, k7.c6.q(-2, -2, 16));
                this.f29828f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f29828f.setClipToPadding(false);
                addView(this.f29828f, k7.c6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z4) {
                this.f29828f.setVisibility(0);
                this.f29828f.setAlpha(0.0f);
                this.f29828f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f29828f;
        if (linearLayout2 != null) {
            if (z4) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new ec0(this, 22)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f29828f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f29824a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f29824a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f10) {
        this.B = f10;
        mh.d1 d1Var = this.d;
        d1Var.setPivotX(d1Var.getWidth() / 2.0f);
        d1Var.setPivotY(0.0f);
        d1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        d1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
