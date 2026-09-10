package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ef1 extends org.telegram.ui.ActionBar.p2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f32176a;
    public long f32177b;
    public long f32178c;
    public org.telegram.ui.Cells.w8 d;
    public EditTextBoldCursor e;
    public df1 f32179f;
    public org.telegram.ui.Components.w9[] h;
    public String f32180n;
    public boolean f32181r;
    public org.telegram.ui.Components.vq f32182s;
    public org.telegram.ui.Components.am0 v;
    public TLRPC.TL_forumTopic f32183w;
    public mg.a f32184x;
    public eo f32185y;

    public static ef1 a0(long j3, long j10) {
        Bundle e = w.f.e(j3, "chat_id");
        e.putLong("topic_id", j10);
        ?? p2Var = new org.telegram.ui.ActionBar.p2(e);
        p2Var.h = new org.telegram.ui.Components.w9[2];
        p2Var.f32180n = "";
        p2Var.F = new AnimationNotificationsLocker();
        return p2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.f32179f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f32179f.setSelected(Long.valueOf(longValue));
            if (this.f32177b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.p5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.wc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ze1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f32177b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(10, this.currentAccount, longValue);
                    p5Var.setColorFilter(org.telegram.ui.ActionBar.j6.f18251v3);
                    w9VarArr[1].setAnimatedEmojiDrawable(p5Var);
                    w9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.v80 v80Var = new org.telegram.ui.Components.v80(1, null);
                    v80Var.a(this.f32180n);
                    this.v.b(v80Var, false);
                    w9VarArr[1].setImageDrawable(this.f32182s);
                    w9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.w9 w9Var = w9VarArr[0];
                org.telegram.ui.Components.w9 w9Var2 = w9VarArr[1];
                w9VarArr[0] = w9Var2;
                w9VarArr[1] = w9Var;
                AndroidUtilities.updateViewVisibilityAnimated(w9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.f32183w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new af1(this));
        if (this.f32183w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f17872a7;
        lVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.aw0 aw0Var = new org.telegram.ui.Components.aw0(context, null);
        this.fragmentView = aw0Var;
        aw0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        aw0Var.addView(linearLayout);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f32183w;
        if (tL_forumTopic != null && tL_forumTopic.f17247id == 1) {
            m4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            m4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.a6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new m0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final ef1 f38985b;

            {
                this.f38985b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                ef1 ef1Var = this.f38985b;
                switch (i11) {
                    case 0:
                        if (ef1Var.f32177b == 0 && ef1Var.f32183w == null) {
                            mg.a aVar = ef1Var.f32184x;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = mg.a.f13646k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.f13653i = i13;
                            aVar.h = (int[]) mg.a.f13647l.get(i13);
                            if (org.telegram.ui.ActionBar.j6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new gg.t1(6, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            ef1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.w8 w8Var = ef1Var.d;
                        w8Var.setChecked(true ^ w8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9VarArr[i11] = w9Var;
            frameLayout2.addView(w9Var, w7.a6.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.a6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f17928d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.a6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f32183w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f17247id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, w7.a6.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.a6.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.w8 w8Var = new org.telegram.ui.Cells.w8(context);
            this.d = w8Var;
            w8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f32183w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.j6.f18017i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final ef1 f38985b;

                {
                    this.f38985b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    ef1 ef1Var = this.f38985b;
                    switch (i112) {
                        case 0:
                            if (ef1Var.f32177b == 0 && ef1Var.f32183w == null) {
                                mg.a aVar = ef1Var.f32184x;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = mg.a.f13646k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.e];
                                aVar.f13653i = i13;
                                aVar.h = (int[]) mg.a.f13647l.get(i13);
                                if (org.telegram.ui.ActionBar.j6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new gg.t1(6, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                ef1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.w8 w8Var2 = ef1Var.d;
                            w8Var2.setChecked(true ^ w8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, w7.a6.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, w7.a6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.f9 f9Var = new org.telegram.ui.Cells.f9(context);
            f9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(f9Var, w7.a6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            df1 df1Var = new df1(this, this, getParentActivity());
            this.f32179f = df1Var;
            df1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f32179f.setClipChildren(false);
            frameLayout3.addView(this.f32179f, w7.a6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.vq d = mg.d.d(this.E, "");
            this.f32184x = (mg.a) d.f28573a;
            this.v = new org.telegram.ui.Components.am0(context);
            org.telegram.ui.Components.vq vqVar = new org.telegram.ui.Components.vq(d, this.v, 0, 0);
            vqVar.f28580w = true;
            this.f32179f.setForumIconDrawable(vqVar);
            this.f32182s = vqVar;
            org.telegram.ui.Components.am0 am0Var = this.v;
            org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
            ArrayList arrayList = am0Var.f21541n;
            if (!arrayList.contains(w9Var2)) {
                arrayList.add(w9Var2);
            }
            org.telegram.ui.Components.am0 am0Var2 = this.v;
            org.telegram.ui.Components.w9 w9Var3 = w9VarArr[1];
            ArrayList arrayList2 = am0Var2.f21541n;
            if (!arrayList2.contains(w9Var3)) {
                arrayList2.add(w9Var3);
            }
            w9VarArr[0].setImageDrawable(this.f32182s);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 1.0f, false);
            mg.a aVar = this.f32184x;
            aVar.d.add(w9VarArr[0]);
            mg.a aVar2 = this.f32184x;
            aVar2.d.add(w9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.a6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f32183w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f32183w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f32176a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f32178c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f32176a, this.f32178c);
            this.f32183w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = mg.a.f13646k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.e.requestFocus();
        AndroidUtilities.showKeyboard(this.e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f32181r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        df1 df1Var = this.f32179f;
        if (df1Var != null) {
            df1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z10, boolean z11) {
        super.onTransitionAnimationStart(z10, z11);
        if (z10) {
            this.F.lock();
        }
    }
}
