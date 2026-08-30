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
    public final int f27600a;
    public final org.telegram.ui.ActionBar.p2 f27601b;
    public final org.telegram.ui.ActionBar.f6 f27602c;
    public final lh.e1 d;
    public final eg.g e;
    public LinearLayout f27603f;
    public long h;
    public final ArrayList f27604n;
    public final ArrayList f27605r;
    public boolean f27606s;
    public ng.a v;
    public qg.d f27607w;
    public final Paint f27608x;
    public final long f27609y;

    public on0(int i10, long j10, Context context, org.telegram.ui.ActionBar.p2 p2Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f27604n = new ArrayList();
        this.f27605r = new ArrayList();
        this.f27608x = new Paint(1);
        this.f27600a = i10;
        this.f27601b = p2Var;
        this.f27602c = f6Var;
        this.f27609y = j10;
        mg.r0.o(f6Var);
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 18);
        this.d = e1Var;
        e1Var.setPadding(AndroidUtilities.dp(5.66f), 0, AndroidUtilities.dp(5.66f), 0);
        e1Var.setClipToPadding(false);
        f2.i0 i0Var = new f2.i0();
        i0Var.j1(0);
        e1Var.setLayoutManager(i0Var);
        eg.g gVar = new eg.g(this, 3);
        this.e = gVar;
        e1Var.setAdapter(gVar);
        e1Var.setOverScrollMode(2);
        addView(e1Var, k7.b6.c(-1.0f, -1));
        e1Var.setOnItemClickListener(new eg.w1(this, i10, p2Var, 1));
        e1Var.setOnItemLongClickListener(new gg.a0(this, i10, p2Var, f6Var, 5));
        f2.l lVar = new f2.l();
        lVar.o(nr.h);
        lVar.n(320L);
        e1Var.setItemAnimator(lVar);
        MediaDataController.getInstance(i10).loadSavedReactions(false);
        h(false);
    }

    public static void c(Context context, int i10, TLRPC.Reaction reaction, org.telegram.ui.ActionBar.f6 f6Var) {
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
        if (R != null && (R.getFragmentView() instanceof qv0) && ((qv0) R.getFragmentView()).R() > AndroidUtilities.dp(20.0f)) {
            z4 = true;
        } else {
            z4 = false;
        }
        org.telegram.ui.ActionBar.d2[] d2VarArr = new org.telegram.ui.ActionBar.d2[1];
        if (z4) {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        } else {
            alertDialog$Builder = new AlertDialog$Builder(context, 0, f6Var);
        }
        AlertDialog$Builder alertDialog$Builder2 = alertDialog$Builder;
        String savedTagName = MessagesController.getInstance(i10).getSavedTagName(reaction);
        mg.q0 d = mg.q0.d(reaction);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(AndroidUtilities.dp(20));
        if (!TextUtils.isEmpty(d.f14107f)) {
            charSequence = Emoji.replaceEmoji(d.f14107f, textPaint.getFontMetricsInt(), false);
        } else {
            SpannableString spannableString = new SpannableString("😀");
            spannableString.setSpan(new u5(d.f14108g, textPaint.getFontMetricsInt()), 0, spannableString.length(), 17);
            charSequence = spannableString;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) "  ");
        if (TextUtils.isEmpty(savedTagName)) {
            i11 = R.string.SavedTagLabelTag;
        } else {
            i11 = R.string.SavedTagRenameTag;
        }
        SpannableStringBuilder append2 = append.append((CharSequence) LocaleController.getString(i11));
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder2.f19503a;
        d2Var.O = append2;
        final in0 in0Var = new in0(context, f6Var);
        in0Var.setOnEditorActionListener(new jn0(in0Var, i10, reaction, d2VarArr, view));
        MediaDataController.getInstance(i10).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        in0Var.setTextSize(1, 18.0f);
        if (savedTagName == null) {
            savedTagName = "";
        }
        in0Var.setText(savedTagName);
        int i12 = org.telegram.ui.ActionBar.j6.f20012j5;
        in0Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i12, f6Var));
        in0Var.setHintColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Xh, f6Var));
        in0Var.setHintText(LocaleController.getString(R.string.SavedTagLabelPlaceholder));
        in0Var.setSingleLine(true);
        in0Var.setFocusable(true);
        in0Var.setInputType(16384);
        in0Var.setLineColors(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20031k6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20049l6, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20122p7, f6Var));
        in0Var.setImeOptions(6);
        in0Var.setBackgroundDrawable(null);
        in0Var.setPadding(0, 0, AndroidUtilities.dp(42.0f), 0);
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        TextView textView = new TextView(context);
        org.telegram.ui.b.l(i12, f6Var, textView, 1, 16.0f);
        textView.setText(LocaleController.getString(R.string.SavedTagLabelTagText));
        f10.addView(textView, k7.b6.k(24.0f, 5.0f, 24.0f, 12.0f, -1, -2));
        f10.addView(in0Var, k7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder2.n(f10);
        d2Var.f19584a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder2.k(LocaleController.getString(R.string.Save), new e3.d(in0Var, i10, reaction, 6));
        alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), new kh0(1));
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
        d2VarArr[0].f19591e0 = false;
        in0Var.setSelection(in0Var.getText().length());
    }

    public final boolean a() {
        if (this.f27605r.isEmpty() && !this.f27606s) {
            return false;
        }
        return true;
    }

    public abstract void b(boolean z4);

    public final void d(ng.a aVar, qg.d dVar) {
        this.v = aVar;
        this.f27607w = dVar;
        float dpf2 = AndroidUtilities.dpf2(1.0f);
        Paint paint = this.f27608x;
        paint.setStrokeWidth(dpf2);
        paint.setStyle(Paint.Style.STROKE);
        View view = this.f27603f;
        if (view != null) {
            pg.b c3 = aVar.c(view, null, false);
            c3.n(rg.b.n(this.f27602c));
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
            if (longValue == 0 || longValue == this.f27609y) {
                h(true);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            invalidate();
            AndroidUtilities.forEachViews((RecyclerView) this.d, (h5.d) new nh.e(19));
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
        if (view == this.d && (linearLayout = this.f27603f) != null) {
            if (linearLayout.getAlpha() >= 1.0f) {
                return false;
            }
            canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) ((1.0f - this.f27603f.getAlpha()) * 255.0f), 31);
            boolean drawChild = super.drawChild(canvas, view, j10);
            canvas.restore();
            return drawChild;
        }
        return super.drawChild(canvas, view, j10);
    }

    public final void e(mg.q0 q0Var, boolean z4) {
        eg.g gVar = this.e;
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
            ArrayList arrayList = this.f27605r;
            if (i10 < arrayList.size()) {
                long j10 = q0Var.h;
                mg.q0 q0Var2 = ((ln0) arrayList.get(i10)).f26817a;
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

    public abstract boolean f(mg.q0 q0Var);

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
        ofFloat.addUpdateListener(new i70(this, 15));
        this.D.setInterpolator(nr.h);
        this.D.setDuration(320L);
        this.D.addListener(new l00(10, this, z4));
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
        ArrayList arrayList = this.f27604n;
        arrayList.clear();
        ArrayList arrayList2 = this.f27605r;
        arrayList.addAll(arrayList2);
        arrayList2.clear();
        int i11 = this.f27600a;
        MessagesController messagesController = MessagesController.getInstance(i11);
        long j10 = this.f27609y;
        TLRPC.TL_messages_savedReactionsTags savedReactionTags = messagesController.getSavedReactionTags(j10);
        if (savedReactionTags != null) {
            int i12 = 0;
            z10 = false;
            while (i12 < savedReactionTags.tags.size()) {
                TLRPC.TL_savedReactionTag tL_savedReactionTag = savedReactionTags.tags.get(i12);
                mg.q0 d = mg.q0.d(tL_savedReactionTag.reaction);
                int i13 = i12;
                if (!hashSet.contains(Long.valueOf(d.h)) && (j10 == 0 || tL_savedReactionTag.count > 0)) {
                    int i14 = tL_savedReactionTag.count;
                    if (i10 != 0) {
                        str = messagesController.getSavedTagName(tL_savedReactionTag.reaction);
                    } else {
                        str = tL_savedReactionTag.title;
                    }
                    ?? obj = new Object();
                    obj.f26817a = d;
                    obj.f26818b = i14;
                    obj.f26819c = str;
                    if (str == null) {
                        hashCode = -233;
                    } else {
                        hashCode = str.hashCode();
                    }
                    obj.d = hashCode;
                    if (obj.f26817a.h == this.h) {
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
        eg.g gVar = this.e;
        if (z4) {
            f2.q.c(new kn0(this), true).b(gVar);
        } else {
            gVar.l();
        }
        boolean isPremium = UserConfig.getInstance(i11).isPremium();
        this.f27606s = !isPremium;
        if (!isPremium) {
            if (this.f27603f == null) {
                LinearLayout linearLayout = new LinearLayout(getContext());
                this.f27603f = linearLayout;
                linearLayout.setOnClickListener(new z70(this, 13));
                this.f27603f.setOrientation(0);
                k7.d6.b(this.f27603f, 0.03f, 1.25f);
                org.telegram.ui.t9 t9Var = new org.telegram.ui.t9(this, getContext());
                int i15 = org.telegram.ui.ActionBar.j6.f20103o6;
                org.telegram.ui.ActionBar.f6 f6Var = this.f27602c;
                t9Var.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
                t9Var.setTextSize(1, 12.0f);
                t9Var.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                Drawable mutate = getContext().getResources().getDrawable(R.drawable.msg_mini_lock3).mutate();
                int i16 = org.telegram.ui.ActionBar.j6.f19966gc;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                mutate.setColorFilter(new PorterDuffColorFilter(i16, mode));
                mq mqVar = new mq(0, mutate);
                mqVar.setTranslateY(0.0f);
                mqVar.setTranslateX(0.0f);
                mqVar.setScale(0.94f, 0.94f);
                SpannableString spannableString = new SpannableString("l");
                spannableString.setSpan(mqVar, 0, spannableString.length(), 17);
                spannableStringBuilder.append((CharSequence) spannableString);
                spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.AddTagsToYourSavedMessages1));
                t9Var.setText(spannableStringBuilder);
                t9Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                TextView textView = new TextView(getContext());
                textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, f6Var));
                textView.setTextSize(1, 12.0f);
                textView.setTypeface(AndroidUtilities.bold());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.AddTagsToYourSavedMessages2));
                SpannableString spannableString2 = new SpannableString(">");
                Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.msg_arrowright).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(i16, mode));
                mq mqVar2 = new mq(0, mutate2);
                mqVar2.setScale(0.76f, 0.76f);
                mqVar2.setTranslateX(-AndroidUtilities.dp(1.0f));
                mqVar2.setTranslateY(AndroidUtilities.dp(1.0f));
                spannableString2.setSpan(mqVar2, 0, spannableString2.length(), 17);
                spannableStringBuilder2.append((CharSequence) spannableString2);
                textView.setText(spannableStringBuilder2);
                textView.setPadding(AndroidUtilities.dp(5.66f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(4.0f));
                this.f27603f.addView(t9Var, k7.b6.q(-2, -2, 16));
                this.f27603f.addView(textView, k7.b6.q(-2, -2, 16));
                this.f27603f.setPadding(AndroidUtilities.dp(7.0f), 0, 0, 0);
                this.f27603f.setClipToPadding(false);
                addView(this.f27603f, k7.b6.d(-2, -1.0f, 19, 5.0f, 0.0f, 5.0f, 0.0f));
            }
            if (!z4) {
                this.f27603f.setVisibility(0);
                this.f27603f.setAlpha(0.0f);
                this.f27603f.animate().alpha(1.0f).start();
                return;
            }
            return;
        }
        LinearLayout linearLayout2 = this.f27603f;
        if (linearLayout2 != null) {
            if (z4) {
                linearLayout2.animate().alpha(0.0f).withEndAction(new cc0(this, 22)).start();
                return;
            }
            linearLayout2.setAlpha(1.0f);
            this.f27603f.setVisibility(0);
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f27600a;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.emojiLoaded);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i10 = this.f27600a;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.savedReactionTagsUpdate);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.emojiLoaded);
    }

    public void setShown(float f10) {
        this.B = f10;
        lh.e1 e1Var = this.d;
        e1Var.setPivotX(e1Var.getWidth() / 2.0f);
        e1Var.setPivotY(0.0f);
        e1Var.setScaleX(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        e1Var.setScaleY(AndroidUtilities.lerp(0.8f, 1.0f, f10));
        setAlpha(f10);
        invalidate();
    }
}
