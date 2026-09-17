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
public final class bf1 extends org.telegram.ui.ActionBar.o2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f32115a;
    public long f32116b;
    public long f32117c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor e;
    public af1 f32118f;
    public org.telegram.ui.Components.u9[] h;
    public String f32119n;
    public boolean f32120r;
    public org.telegram.ui.Components.pq f32121s;
    public org.telegram.ui.Components.rl0 v;
    public TLRPC.TL_forumTopic f32122w;
    public ng.a f32123x;
    public bo f32124y;

    public static bf1 a0(long j3, long j10) {
        Bundle e = w.f.e(j3, "chat_id");
        e.putLong("topic_id", j10);
        ?? o2Var = new org.telegram.ui.ActionBar.o2(e);
        o2Var.h = new org.telegram.ui.Components.u9[2];
        o2Var.f32119n = "";
        o2Var.F = new AnimationNotificationsLocker();
        return o2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.u9[] u9VarArr = this.h;
        if (this.f32118f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f32118f.setSelected(Long.valueOf(longValue));
            if (this.f32116b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.o5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.vc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new we1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f32116b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(10, this.currentAccount, longValue);
                    o5Var.setColorFilter(org.telegram.ui.ActionBar.j6.f19189v3);
                    u9VarArr[1].setAnimatedEmojiDrawable(o5Var);
                    u9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(1, null);
                    l80Var.a(this.f32119n);
                    this.v.b(l80Var, false);
                    u9VarArr[1].setImageDrawable(this.f32121s);
                    u9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.u9 u9Var = u9VarArr[0];
                org.telegram.ui.Components.u9 u9Var2 = u9VarArr[1];
                u9VarArr[0] = u9Var2;
                u9VarArr[1] = u9Var;
                AndroidUtilities.updateViewVisibilityAnimated(u9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(u9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.u9[] u9VarArr = this.h;
        if (this.f32122w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this));
        if (this.f32122w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f18806a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.qv0 qv0Var = new org.telegram.ui.Components.qv0(context, null);
        this.fragmentView = qv0Var;
        qv0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        qv0Var.addView(linearLayout);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f32122w;
        if (tL_forumTopic != null && tL_forumTopic.f18173id == 1) {
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
        frameLayout.addView(this.e, w7.x5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new l0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final bf1 f38404b;

            {
                this.f38404b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                bf1 bf1Var = this.f38404b;
                switch (i11) {
                    case 0:
                        if (bf1Var.f32116b == 0 && bf1Var.f32122w == null) {
                            ng.a aVar = bf1Var.f32123x;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = ng.a.f15227k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.f15234i = i13;
                            aVar.h = (int[]) ng.a.f15228l.get(i13);
                            if (org.telegram.ui.ActionBar.j6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            bf1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = bf1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
            u9VarArr[i11] = u9Var;
            frameLayout2.addView(u9Var, w7.x5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.x5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(l4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f18862d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.x5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f32122w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f18173id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.j6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, w7.x5.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.x5.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.j6.d0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.d = v8Var;
            v8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f32122w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.j6.f18952i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final bf1 f38404b;

                {
                    this.f38404b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    bf1 bf1Var = this.f38404b;
                    switch (i112) {
                        case 0:
                            if (bf1Var.f32116b == 0 && bf1Var.f32122w == null) {
                                ng.a aVar = bf1Var.f32123x;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = ng.a.f15227k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.e];
                                aVar.f15234i = i13;
                                aVar.h = (int[]) ng.a.f15228l.get(i13);
                                if (org.telegram.ui.ActionBar.j6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                bf1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var2 = bf1Var.d;
                            v8Var2.setChecked(true ^ v8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, w7.x5.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, w7.x5.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(e9Var, w7.x5.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            af1 af1Var = new af1(this, this, getParentActivity());
            this.f32118f = af1Var;
            af1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f32118f.setClipChildren(false);
            frameLayout3.addView(this.f32118f, w7.x5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.pq d = ng.d.d(this.E, "");
            this.f32123x = (ng.a) d.f27106a;
            this.v = new org.telegram.ui.Components.rl0(context);
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(d, this.v, 0, 0);
            pqVar.f27113w = true;
            this.f32118f.setForumIconDrawable(pqVar);
            this.f32121s = pqVar;
            org.telegram.ui.Components.rl0 rl0Var = this.v;
            org.telegram.ui.Components.u9 u9Var2 = u9VarArr[0];
            ArrayList arrayList = rl0Var.f27645n;
            if (!arrayList.contains(u9Var2)) {
                arrayList.add(u9Var2);
            }
            org.telegram.ui.Components.rl0 rl0Var2 = this.v;
            org.telegram.ui.Components.u9 u9Var3 = u9VarArr[1];
            ArrayList arrayList2 = rl0Var2.f27645n;
            if (!arrayList2.contains(u9Var3)) {
                arrayList2.add(u9Var3);
            }
            u9VarArr[0].setImageDrawable(this.f32121s);
            AndroidUtilities.updateViewVisibilityAnimated(u9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(u9VarArr[1], false, 1.0f, false);
            ng.a aVar = this.f32123x;
            aVar.d.add(u9VarArr[0]);
            ng.a aVar2 = this.f32123x;
            aVar2.d.add(u9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.x5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f32122w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f32122w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f32115a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f32117c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f32115a, this.f32117c);
            this.f32122w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = ng.a.f15227k[Math.abs(Utilities.random.nextInt() % 6)];
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
        if (!z10 && this.f32120r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        af1 af1Var = this.f32118f;
        if (af1Var != null) {
            af1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
