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
public final class ie1 extends org.telegram.ui.ActionBar.p2 {
    public int B;
    public AnimationNotificationsLocker C;
    public long f37820a;
    public long f37821b;
    public long f37822c;
    public org.telegram.ui.Cells.r8 d;
    public EditTextBoldCursor f37823e;
    public he1 f37824f;
    public org.telegram.ui.Components.p9[] h;
    public String f37825n;
    public boolean f37826r;
    public org.telegram.ui.Components.pq f37827s;
    public org.telegram.ui.Components.zl0 v;
    public TLRPC.TL_forumTopic f37828w;
    public bg.b f37829x;
    public xn f37830y;

    public static int X(ie1 ie1Var) {
        return ie1Var.currentAccount;
    }

    public static ie1 a0(long j10, long j11) {
        Bundle g10 = l.d.g(j10, "chat_id");
        g10.putLong("topic_id", j11);
        ?? p2Var = new org.telegram.ui.ActionBar.p2(g10);
        p2Var.h = new org.telegram.ui.Components.p9[2];
        p2Var.f37825n = "";
        p2Var.C = new AnimationNotificationsLocker();
        return p2Var;
    }

    public final void b0(Long l10, boolean z4) {
        long longValue;
        org.telegram.ui.Components.p9[] p9VarArr = this.h;
        if (this.f37824f != null && this.v != null) {
            if (l10 == null) {
                longValue = 0;
            } else {
                longValue = l10.longValue();
            }
            this.f37824f.setSelected(Long.valueOf(longValue));
            if (this.f37821b != longValue) {
                if (!z4 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f10 = org.telegram.ui.Components.l5.f(this.currentAccount, l10.longValue());
                    if (f10 != null) {
                        org.telegram.ui.Components.qc.a0(this).q(f10, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new de1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f37821b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.l5 l5Var = new org.telegram.ui.Components.l5(10, this.currentAccount, longValue);
                    l5Var.setColorFilter(org.telegram.ui.ActionBar.k6.f21976v3);
                    p9VarArr[1].setAnimatedEmojiDrawable(l5Var);
                    p9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.o80 o80Var = new org.telegram.ui.Components.o80(1, null);
                    o80Var.a(this.f37825n);
                    this.v.b(o80Var, false);
                    p9VarArr[1].setImageDrawable(this.f37827s);
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
        if (this.f37828w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ee1(this));
        if (this.f37828w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21605a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.qv0 qv0Var = new org.telegram.ui.Components.qv0(context, null);
        this.fragmentView = qv0Var;
        qv0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        qv0Var.addView(linearLayout);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f37828w;
        if (tL_forumTopic != null && tL_forumTopic.f20895id == 1) {
            m4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            m4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f37823e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.f37823e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.k6.Vd));
        this.f37823e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ud));
        this.f37823e.setPadding(AndroidUtilities.dp(0.0f), this.f37823e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.f37823e.getPaddingBottom());
        this.f37823e.setBackground(null);
        this.f37823e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f37823e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f37823e, k7.c6.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f37823e.addTextChangedListener(new n0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final ie1 f35790b;

            {
                this.f35790b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                ie1 ie1Var = this.f35790b;
                switch (i11) {
                    case 0:
                        if (ie1Var.f37821b == 0 && ie1Var.f37828w == null) {
                            bg.b bVar = ie1Var.f37829x;
                            int i12 = bVar.f1971e + 1;
                            bVar.f1971e = i12;
                            int[] iArr = bg.b.f1966k;
                            if (i12 > 5) {
                                bVar.f1971e = 0;
                            }
                            int[] iArr2 = bVar.h;
                            int i13 = iArr[bVar.f1971e];
                            bVar.f1974i = i13;
                            bVar.h = (int[]) bg.b.f1967l.get(i13);
                            if (org.telegram.ui.ActionBar.k6.I.q()) {
                                bVar.h = new int[]{i0.a.d(0.2f, bVar.h[0], -1), i0.a.d(0.2f, bVar.h[1], -1)};
                            }
                            bVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new bg.a(0, bVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            ie1Var.B = iArr[bVar.f1971e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.r8 r8Var = ie1Var.d;
                        r8Var.setChecked(true ^ r8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
            p9VarArr[i11] = p9Var;
            frameLayout2.addView(p9Var, k7.c6.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, k7.c6.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.k6.f21659d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.k6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, k7.c6.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f37828w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f20895id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, k7.c6.e(22, 22, 17));
            frameLayout3.addView(new View(context), k7.c6.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.k6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.d = r8Var;
            r8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f37828w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.k6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.k6.f21750i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final ie1 f35790b;

                {
                    this.f35790b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    ie1 ie1Var = this.f35790b;
                    switch (i112) {
                        case 0:
                            if (ie1Var.f37821b == 0 && ie1Var.f37828w == null) {
                                bg.b bVar = ie1Var.f37829x;
                                int i122 = bVar.f1971e + 1;
                                bVar.f1971e = i122;
                                int[] iArr = bg.b.f1966k;
                                if (i122 > 5) {
                                    bVar.f1971e = 0;
                                }
                                int[] iArr2 = bVar.h;
                                int i13 = iArr[bVar.f1971e];
                                bVar.f1974i = i13;
                                bVar.h = (int[]) bg.b.f1967l.get(i13);
                                if (org.telegram.ui.ActionBar.k6.I.q()) {
                                    bVar.h = new int[]{i0.a.d(0.2f, bVar.h[0], -1), i0.a.d(0.2f, bVar.h[1], -1)};
                                }
                                bVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new bg.a(0, bVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                ie1Var.B = iArr[bVar.f1971e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.r8 r8Var2 = ie1Var.d;
                            r8Var2.setChecked(true ^ r8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, k7.c6.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, k7.c6.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.a9 a9Var = new org.telegram.ui.Cells.a9(context);
            a9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(a9Var, k7.c6.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            he1 he1Var = new he1(this, this, getParentActivity());
            this.f37824f = he1Var;
            he1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f37824f.setClipChildren(false);
            frameLayout3.addView(this.f37824f, k7.c6.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.pq d = bg.e.d(this.B, "");
            this.f37829x = (bg.b) d.f30165a;
            this.v = new org.telegram.ui.Components.zl0(context);
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(d, this.v, 0, 0);
            pqVar.f30173w = true;
            this.f37824f.setForumIconDrawable(pqVar);
            this.f37827s = pqVar;
            org.telegram.ui.Components.zl0 zl0Var = this.v;
            org.telegram.ui.Components.p9 p9Var2 = p9VarArr[0];
            ArrayList arrayList = zl0Var.f33916n;
            if (!arrayList.contains(p9Var2)) {
                arrayList.add(p9Var2);
            }
            org.telegram.ui.Components.zl0 zl0Var2 = this.v;
            org.telegram.ui.Components.p9 p9Var3 = p9VarArr[1];
            ArrayList arrayList2 = zl0Var2.f33916n;
            if (!arrayList2.contains(p9Var3)) {
                arrayList2.add(p9Var3);
            }
            p9VarArr[0].setImageDrawable(this.f37827s);
            AndroidUtilities.updateViewVisibilityAnimated(p9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(p9VarArr[1], false, 1.0f, false);
            bg.b bVar = this.f37829x;
            bVar.d.add(p9VarArr[0]);
            bg.b bVar2 = this.f37829x;
            bVar2.d.add(p9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, k7.c6.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f37828w;
        if (tL_forumTopic3 != null) {
            this.f37823e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f37828w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f37820a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f37822c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f37820a, this.f37822c);
            this.f37828w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.B = findTopic.icon_color;
        } else {
            this.B = bg.b.f1966k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f37823e.requestFocus();
        AndroidUtilities.showKeyboard(this.f37823e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        super.onTransitionAnimationEnd(z4, z10);
        if (!z4 && this.f37826r) {
            removeSelfFromStack();
        }
        this.C.unlock();
        he1 he1Var = this.f37824f;
        if (he1Var != null) {
            he1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
