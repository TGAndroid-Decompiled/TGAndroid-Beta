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
public final class af1 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f34437a;
    public long f34438b;
    public long f34439c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor f34440e;
    public ze1 f34441f;
    public org.telegram.ui.Components.x9[] h;
    public String f34442n;
    public boolean f34443r;
    public org.telegram.ui.Components.oq f34444s;
    public org.telegram.ui.Components.ql0 v;
    public TLRPC.TL_forumTopic f34445w;
    public og.a f34446x;
    public co f34447y;

    public static af1 a0(long j3, long j10) {
        Bundle e7 = w.f.e(j3, "chat_id");
        e7.putLong("topic_id", j10);
        ?? n2Var = new org.telegram.ui.ActionBar.n2(e7);
        n2Var.h = new org.telegram.ui.Components.x9[2];
        n2Var.f34442n = "";
        n2Var.F = new AnimationNotificationsLocker();
        return n2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.x9[] x9VarArr = this.h;
        if (this.f34441f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f34441f.setSelected(Long.valueOf(longValue));
            if (this.f34438b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.q5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.yc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ve1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f34438b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(10, this.currentAccount, longValue);
                    q5Var.setColorFilter(org.telegram.ui.ActionBar.j6.f21014v3);
                    x9VarArr[1].setAnimatedEmojiDrawable(q5Var);
                    x9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(1, null);
                    l80Var.a(this.f34442n);
                    this.v.b(l80Var, false);
                    x9VarArr[1].setImageDrawable(this.f34444s);
                    x9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.x9 x9Var = x9VarArr[0];
                org.telegram.ui.Components.x9 x9Var2 = x9VarArr[1];
                x9VarArr[0] = x9Var2;
                x9VarArr[1] = x9Var;
                AndroidUtilities.updateViewVisibilityAnimated(x9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(x9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.x9[] x9VarArr = this.h;
        if (this.f34445w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new we1(this));
        if (this.f34445w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20634a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(context, null);
        this.fragmentView = ov0Var;
        ov0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        ov0Var.addView(linearLayout);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f34445w;
        if (tL_forumTopic != null && tL_forumTopic.f19948id == 1) {
            l4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            l4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f34440e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.f34440e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.j6.Vd));
        this.f34440e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.j6.Ud));
        this.f34440e.setPadding(AndroidUtilities.dp(0.0f), this.f34440e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.f34440e.getPaddingBottom());
        this.f34440e.setBackground(null);
        this.f34440e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f34440e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f34440e, w7.x5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.f34440e.addTextChangedListener(new l0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final af1 f41107b;

            {
                this.f41107b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                af1 af1Var = this.f41107b;
                switch (i11) {
                    case 0:
                        if (af1Var.f34438b == 0 && af1Var.f34445w == null) {
                            og.a aVar = af1Var.f34446x;
                            int i12 = aVar.f17044e + 1;
                            aVar.f17044e = i12;
                            int[] iArr = og.a.f17039k;
                            if (i12 > 5) {
                                aVar.f17044e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.f17044e];
                            aVar.f17047i = i13;
                            aVar.h = (int[]) og.a.f17040l.get(i13);
                            if (org.telegram.ui.ActionBar.j6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ah.m0(9, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            af1Var.E = iArr[aVar.f17044e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = af1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.x9 x9Var = new org.telegram.ui.Components.x9(context);
            x9VarArr[i11] = x9Var;
            frameLayout2.addView(x9Var, w7.x5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.x5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(l4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.j6.f20690d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.j6.d0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.x5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f34445w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f19948id == 1) {
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
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f34445w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.j6.Z(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.j6.f20780i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final af1 f41107b;

                {
                    this.f41107b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    af1 af1Var = this.f41107b;
                    switch (i112) {
                        case 0:
                            if (af1Var.f34438b == 0 && af1Var.f34445w == null) {
                                og.a aVar = af1Var.f34446x;
                                int i122 = aVar.f17044e + 1;
                                aVar.f17044e = i122;
                                int[] iArr = og.a.f17039k;
                                if (i122 > 5) {
                                    aVar.f17044e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.f17044e];
                                aVar.f17047i = i13;
                                aVar.h = (int[]) og.a.f17040l.get(i13);
                                if (org.telegram.ui.ActionBar.j6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ah.m0(9, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                af1Var.E = iArr[aVar.f17044e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var2 = af1Var.d;
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
            ze1 ze1Var = new ze1(this, this, getParentActivity());
            this.f34441f = ze1Var;
            ze1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f34441f.setClipChildren(false);
            frameLayout3.addView(this.f34441f, w7.x5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.oq d = og.d.d(this.E, "");
            this.f34446x = (og.a) d.f29186a;
            this.v = new org.telegram.ui.Components.ql0(context);
            org.telegram.ui.Components.oq oqVar = new org.telegram.ui.Components.oq(d, this.v, 0, 0);
            oqVar.f29194w = true;
            this.f34441f.setForumIconDrawable(oqVar);
            this.f34444s = oqVar;
            org.telegram.ui.Components.ql0 ql0Var = this.v;
            org.telegram.ui.Components.x9 x9Var2 = x9VarArr[0];
            ArrayList arrayList = ql0Var.f29793n;
            if (!arrayList.contains(x9Var2)) {
                arrayList.add(x9Var2);
            }
            org.telegram.ui.Components.ql0 ql0Var2 = this.v;
            org.telegram.ui.Components.x9 x9Var3 = x9VarArr[1];
            ArrayList arrayList2 = ql0Var2.f29793n;
            if (!arrayList2.contains(x9Var3)) {
                arrayList2.add(x9Var3);
            }
            x9VarArr[0].setImageDrawable(this.f34444s);
            AndroidUtilities.updateViewVisibilityAnimated(x9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(x9VarArr[1], false, 1.0f, false);
            og.a aVar = this.f34446x;
            aVar.d.add(x9VarArr[0]);
            og.a aVar2 = this.f34446x;
            aVar2.d.add(x9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.x5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f34445w;
        if (tL_forumTopic3 != null) {
            this.f34440e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f34445w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f34437a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f34439c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f34437a, this.f34439c);
            this.f34445w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = og.a.f17039k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f34440e.requestFocus();
        AndroidUtilities.showKeyboard(this.f34440e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f34443r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        ze1 ze1Var = this.f34441f;
        if (ze1Var != null) {
            ze1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
