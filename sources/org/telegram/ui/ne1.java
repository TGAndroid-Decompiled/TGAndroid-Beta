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
public final class ne1 extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public AnimationNotificationsLocker C;
    public long f36491a;
    public long f36492b;
    public long f36493c;
    public org.telegram.ui.Cells.q8 d;
    public EditTextBoldCursor e;
    public me1 f36494f;
    public org.telegram.ui.Components.p9[] h;
    public String f36495n;
    public boolean f36496r;
    public org.telegram.ui.Components.mq f36497s;
    public org.telegram.ui.Components.xl0 v;
    public TLRPC.TL_forumTopic f36498w;
    public ag.b f36499x;
    public zn f36500y;

    public static int X(ne1 ne1Var) {
        return ne1Var.currentAccount;
    }

    public static ne1 a0(long j10, long j11) {
        Bundle g10 = kf.k0.g(j10, "chat_id");
        g10.putLong("topic_id", j11);
        ?? p2Var = new org.telegram.ui.ActionBar.p2(g10);
        p2Var.h = new org.telegram.ui.Components.p9[2];
        p2Var.f36495n = "";
        p2Var.C = new AnimationNotificationsLocker();
        return p2Var;
    }

    public final void b0(Long l10, boolean z4) {
        long longValue;
        org.telegram.ui.Components.p9[] p9VarArr = this.h;
        if (this.f36494f != null && this.v != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f36494f.setSelected(Long.valueOf(longValue));
            if (this.f36492b != longValue) {
                if (!z4 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f10 = org.telegram.ui.Components.l5.f(this.currentAccount, l10.longValue());
                    if (f10 != null) {
                        org.telegram.ui.Components.qc.a0(this).q(f10, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ie1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f36492b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.l5 l5Var = new org.telegram.ui.Components.l5(10, this.currentAccount, longValue);
                    l5Var.setColorFilter(org.telegram.ui.ActionBar.j6.f20197v3);
                    p9VarArr[1].setAnimatedEmojiDrawable(l5Var);
                    p9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.n80 n80Var = new org.telegram.ui.Components.n80(1, null);
                    n80Var.a(this.f36495n);
                    this.v.b(n80Var, false);
                    p9VarArr[1].setImageDrawable(this.f36497s);
                    p9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.p9 p9Var = p9VarArr[0];
                org.telegram.ui.Components.p9 p9Var2 = p9VarArr[1];
                p9VarArr[0] = p9Var2;
                p9VarArr[1] = p9Var;
                AndroidUtilities.updateViewVisibilityAnimated(p9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(p9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.p9[] p9VarArr = this.h;
        if (this.f36498w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new je1(this));
        if (this.f36498w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f19827a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.qv0 qv0Var = new org.telegram.ui.Components.qv0(context, null);
        this.fragmentView = qv0Var;
        qv0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        qv0Var.addView(linearLayout);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f36498w;
        if (tL_forumTopic != null && tL_forumTopic.f19211id == 1) {
            l4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            l4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
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
        frameLayout.addView(this.e, k7.b6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new p0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final ne1 f34658b;

            {
                this.f34658b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                ne1 ne1Var = this.f34658b;
                switch (i11) {
                    case 0:
                        if (ne1Var.f36492b == 0 && ne1Var.f36498w == null) {
                            ag.b bVar = ne1Var.f36499x;
                            int i12 = bVar.e + 1;
                            bVar.e = i12;
                            int[] iArr = ag.b.f187k;
                            if (i12 > 5) {
                                bVar.e = 0;
                            }
                            int[] iArr2 = bVar.h;
                            int i13 = iArr[bVar.e];
                            bVar.f194i = i13;
                            bVar.h = (int[]) ag.b.f188l.get(i13);
                            if (org.telegram.ui.ActionBar.j6.I.q()) {
                                bVar.h = new int[]{i0.a.d(0.2f, bVar.h[0], -1), i0.a.d(0.2f, bVar.h[1], -1)};
                            }
                            bVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ag.a(0, bVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            ne1Var.B = iArr[bVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.q8 q8Var = ne1Var.d;
                        q8Var.setChecked(true ^ q8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9VarArr[i11] = p9Var;
            frameLayout2.addView(p9Var, k7.b6.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, k7.b6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(l4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f19881d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, k7.b6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f36498w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f19211id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, k7.b6.e(22, 22, 17));
            frameLayout3.addView(new View(context), k7.b6.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.d = q8Var;
            q8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f36498w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.j6.f19971i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final ne1 f34658b;

                {
                    this.f34658b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    ne1 ne1Var = this.f34658b;
                    switch (i112) {
                        case 0:
                            if (ne1Var.f36492b == 0 && ne1Var.f36498w == null) {
                                ag.b bVar = ne1Var.f36499x;
                                int i122 = bVar.e + 1;
                                bVar.e = i122;
                                int[] iArr = ag.b.f187k;
                                if (i122 > 5) {
                                    bVar.e = 0;
                                }
                                int[] iArr2 = bVar.h;
                                int i13 = iArr[bVar.e];
                                bVar.f194i = i13;
                                bVar.h = (int[]) ag.b.f188l.get(i13);
                                if (org.telegram.ui.ActionBar.j6.I.q()) {
                                    bVar.h = new int[]{i0.a.d(0.2f, bVar.h[0], -1), i0.a.d(0.2f, bVar.h[1], -1)};
                                }
                                bVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ag.a(0, bVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                ne1Var.B = iArr[bVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.q8 q8Var2 = ne1Var.d;
                            q8Var2.setChecked(true ^ q8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, k7.b6.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, k7.b6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.z8 z8Var = new org.telegram.ui.Cells.z8(context);
            z8Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(z8Var, k7.b6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            me1 me1Var = new me1(this, this, getParentActivity());
            this.f36494f = me1Var;
            me1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f36494f.setClipChildren(false);
            frameLayout3.addView(this.f36494f, k7.b6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.mq d = ag.f.d(this.B, "");
            this.f36499x = (ag.b) d.f27109a;
            this.v = new org.telegram.ui.Components.xl0(context);
            org.telegram.ui.Components.mq mqVar = new org.telegram.ui.Components.mq(d, this.v, 0, 0);
            mqVar.f27116w = true;
            this.f36494f.setForumIconDrawable(mqVar);
            this.f36497s = mqVar;
            org.telegram.ui.Components.xl0 xl0Var = this.v;
            org.telegram.ui.Components.p9 p9Var2 = p9VarArr[0];
            ArrayList arrayList = xl0Var.f30663n;
            if (!arrayList.contains(p9Var2)) {
                arrayList.add(p9Var2);
            }
            org.telegram.ui.Components.xl0 xl0Var2 = this.v;
            org.telegram.ui.Components.p9 p9Var3 = p9VarArr[1];
            ArrayList arrayList2 = xl0Var2.f30663n;
            if (!arrayList2.contains(p9Var3)) {
                arrayList2.add(p9Var3);
            }
            p9VarArr[0].setImageDrawable(this.f36497s);
            AndroidUtilities.updateViewVisibilityAnimated(p9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(p9VarArr[1], false, 1.0f, false);
            ag.b bVar = this.f36499x;
            bVar.d.add(p9VarArr[0]);
            ag.b bVar2 = this.f36499x;
            bVar2.d.add(p9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, k7.b6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f36498w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f36498w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36491a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f36493c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f36491a, this.f36493c);
            this.f36498w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.B = findTopic.icon_color;
        } else {
            this.B = ag.b.f187k[Math.abs(Utilities.random.nextInt() % 6)];
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
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (!z4 && this.f36496r) {
            removeSelfFromStack();
        }
        this.C.unlock();
        me1 me1Var = this.f36494f;
        if (me1Var != null) {
            me1Var.setAnimationsEnabled(this.fragmentBeginToShow);
        }
    }

    @Override
    public final void onTransitionAnimationStart(boolean z4, boolean z10) {
        super.onTransitionAnimationStart(z4, z10);
        if (z4) {
            this.C.lock();
        }
    }
}
