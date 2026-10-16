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
public final class gf1 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f36180a;
    public long f36181b;
    public long f36182c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor e;
    public ff1 f36183f;
    public org.telegram.ui.Components.z9[] h;
    public String f36184n;
    public boolean f36185r;
    public org.telegram.ui.Components.cr f36186s;
    public org.telegram.ui.Components.rm0 v;
    public TLRPC.TL_forumTopic f36187w;
    public og.a f36188x;
    public fo f36189y;

    public static gf1 a0(long j10, long j11) {
        Bundle e = t8.b.e(j10, "chat_id");
        e.putLong("topic_id", j11);
        ?? m2Var = new org.telegram.ui.ActionBar.m2(e);
        m2Var.h = new org.telegram.ui.Components.z9[2];
        m2Var.f36184n = "";
        m2Var.F = new AnimationNotificationsLocker();
        return m2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.z9[] z9VarArr = this.h;
        if (this.f36183f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f36183f.setSelected(Long.valueOf(longValue));
            if (this.f36181b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.s5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.zc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new bf1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f36181b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(10, this.currentAccount, longValue);
                    s5Var.setColorFilter(org.telegram.ui.ActionBar.g6.f19930v3);
                    z9VarArr[1].setAnimatedEmojiDrawable(s5Var);
                    z9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.m90 m90Var = new org.telegram.ui.Components.m90(1, null);
                    m90Var.a(this.f36184n);
                    this.v.b(m90Var, false);
                    z9VarArr[1].setImageDrawable(this.f36186s);
                    z9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.z9 z9Var = z9VarArr[0];
                org.telegram.ui.Components.z9 z9Var2 = z9VarArr[1];
                z9VarArr[0] = z9Var2;
                z9VarArr[1] = z9Var;
                AndroidUtilities.updateViewVisibilityAnimated(z9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(z9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.z9[] z9VarArr = this.h;
        if (this.f36187w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new cf1(this));
        if (this.f36187w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19543a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.ow0 ow0Var = new org.telegram.ui.Components.ow0(context, null);
        this.fragmentView = ow0Var;
        ow0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ow0Var.addView(linearLayout);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f36187w;
        if (tL_forumTopic != null && tL_forumTopic.f18968id == 1) {
            m4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            m4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.g6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.z5.a(-1.0f, 51.0f, 4.0f, 21.0f, 4.0f, -1, 0));
        this.e.addTextChangedListener(new n0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final gf1 f33895b;

            {
                this.f33895b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                gf1 gf1Var = this.f33895b;
                switch (i11) {
                    case 0:
                        if (gf1Var.f36181b == 0 && gf1Var.f36187w == null) {
                            og.a aVar = gf1Var.f36188x;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = og.a.f16332k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.f16339i = i13;
                            aVar.h = (int[]) og.a.f16333l.get(i13);
                            if (org.telegram.ui.ActionBar.g6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ah.l0(9, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            gf1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = gf1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.z9 z9Var = new org.telegram.ui.Components.z9(context);
            z9VarArr[i11] = z9Var;
            frameLayout2.addView(z9Var, w7.z5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.z5.a(40.0f, 10.0f, 0.0f, 0.0f, 0.0f, 40, 16));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.g6.f19601d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.g6.e0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f36187w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f18968id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, w7.z5.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.z5.d(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.g6.e0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.d = v8Var;
            v8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f36187w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.g6.a0(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.g6.f19690i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final gf1 f33895b;

                {
                    this.f33895b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    gf1 gf1Var = this.f33895b;
                    switch (i112) {
                        case 0:
                            if (gf1Var.f36181b == 0 && gf1Var.f36187w == null) {
                                og.a aVar = gf1Var.f36188x;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = og.a.f16332k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.e];
                                aVar.f16339i = i13;
                                aVar.h = (int[]) og.a.f16333l.get(i13);
                                if (org.telegram.ui.ActionBar.g6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ah.l0(9, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                gf1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var2 = gf1Var.d;
                            v8Var2.setChecked(true ^ v8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, w7.z5.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, w7.z5.a(56.0f, 9.0f, 8.0f, 9.0f, 0.0f, -1, 48));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(e9Var, w7.z5.a(-2.0f, 0.0f, 58.0f, 0.0f, 0.0f, -1, 48));
        } else {
            ff1 ff1Var = new ff1(this, this, getParentActivity());
            this.f36183f = ff1Var;
            ff1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f36183f.setClipChildren(false);
            frameLayout3.addView(this.f36183f, w7.z5.a(-1.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 0));
            org.telegram.ui.Components.cr d = og.d.d(this.E, "");
            this.f36188x = (og.a) d.f23876a;
            this.v = new org.telegram.ui.Components.rm0(context);
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(d, this.v, 0, 0);
            crVar.f23883w = true;
            this.f36183f.setForumIconDrawable(crVar);
            this.f36186s = crVar;
            org.telegram.ui.Components.rm0 rm0Var = this.v;
            org.telegram.ui.Components.z9 z9Var2 = z9VarArr[0];
            ArrayList arrayList = rm0Var.f28578n;
            if (!arrayList.contains(z9Var2)) {
                arrayList.add(z9Var2);
            }
            org.telegram.ui.Components.rm0 rm0Var2 = this.v;
            org.telegram.ui.Components.z9 z9Var3 = z9VarArr[1];
            ArrayList arrayList2 = rm0Var2.f28578n;
            if (!arrayList2.contains(z9Var3)) {
                arrayList2.add(z9Var3);
            }
            z9VarArr[0].setImageDrawable(this.f36186s);
            AndroidUtilities.updateViewVisibilityAnimated(z9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(z9VarArr[1], false, 1.0f, false);
            this.f36188x.d.add(z9VarArr[0]);
            this.f36188x.d.add(z9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.z5.d(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f36187w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f36187w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36180a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f36182c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f36180a, this.f36182c);
            this.f36187w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = og.a.f16332k[Math.abs(Utilities.random.nextInt() % 6)];
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
        if (!z10 && this.f36185r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        ff1 ff1Var = this.f36183f;
        if (ff1Var != null) {
            ff1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
