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
public final class nd1 extends org.telegram.ui.ActionBar.n2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f39541a;
    public long f39542b;
    public long f39543c;
    public org.telegram.ui.Cells.u8 d;
    public EditTextBoldCursor e;
    public md1 f39544f;
    public org.telegram.ui.Components.w9[] h;
    public String f39545n;
    public boolean f39546r;
    public org.telegram.ui.Components.zq f39547s;
    public org.telegram.ui.Components.om0 v;
    public TLRPC.TL_forumTopic f39548w;
    public og.a f39549x;
    public qn f39550y;

    public static int X(nd1 nd1Var) {
        return nd1Var.currentAccount;
    }

    public static nd1 a0(long j10, long j11) {
        Bundle b10 = zf.d0.b(j10, "chat_id");
        b10.putLong("topic_id", j11);
        ?? n2Var = new org.telegram.ui.ActionBar.n2(b10);
        n2Var.h = new org.telegram.ui.Components.w9[2];
        n2Var.f39545n = "";
        n2Var.F = new AnimationNotificationsLocker();
        return n2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.w9[] w9VarArr = this.h;
        if (this.f39544f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f39544f.setSelected(Long.valueOf(longValue));
            if (this.f39542b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.r5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.xc.a0(this).r(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new id1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f39542b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(10, this.currentAccount, longValue);
                    r5Var.setColorFilter(org.telegram.ui.ActionBar.h6.f21320v3);
                    w9VarArr[1].setAnimatedEmojiDrawable(r5Var);
                    w9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.f90 f90Var = new org.telegram.ui.Components.f90(1, null);
                    f90Var.a(this.f39545n);
                    this.v.b(f90Var, false);
                    w9VarArr[1].setImageDrawable(this.f39547s);
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
        if (this.f39548w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new jd1(this));
        if (this.f39548w == null) {
            this.actionBar.n().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.n().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20932a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.lw0 lw0Var = new org.telegram.ui.Components.lw0(context, null);
        this.fragmentView = lw0Var;
        lw0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        lw0Var.addView(linearLayout);
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f39548w;
        if (tL_forumTopic != null && tL_forumTopic.f20328id == 1) {
            l4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            l4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.h6.Vd));
        this.e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ud));
        this.e.setPadding(AndroidUtilities.dp(0.0f), this.e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.e.getPaddingBottom());
        this.e.setBackground(null);
        this.e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.e, w7.z5.d(-1, -1.0f, 0, 51.0f, 4.0f, 21.0f, 4.0f));
        this.e.addTextChangedListener(new o0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final nd1 f37580b;

            {
                this.f37580b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                nd1 nd1Var = this.f37580b;
                switch (i11) {
                    case 0:
                        if (nd1Var.f39542b == 0 && nd1Var.f39548w == null) {
                            og.a aVar = nd1Var.f39549x;
                            int i12 = aVar.e + 1;
                            aVar.e = i12;
                            int[] iArr = og.a.f17730k;
                            if (i12 > 5) {
                                aVar.e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.e];
                            aVar.f17737i = i13;
                            aVar.h = (int[]) og.a.f17731l.get(i13);
                            if (org.telegram.ui.ActionBar.h6.I.q()) {
                                aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ah.l0(10, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            nd1Var.E = iArr[aVar.e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.u8 u8Var = nd1Var.d;
                        u8Var.setChecked(true ^ u8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
            w9VarArr[i11] = w9Var;
            frameLayout2.addView(w9Var, w7.z5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.z5.d(40, 40.0f, 16, 10.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(l4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.h6.f20990d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.e0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.z5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f39548w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f20328id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, w7.z5.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.z5.c(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.h6.e0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.u8 u8Var = new org.telegram.ui.Cells.u8(context);
            this.d = u8Var;
            u8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f39548w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.h6.a0(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.h6.f21079i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final nd1 f37580b;

                {
                    this.f37580b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    nd1 nd1Var = this.f37580b;
                    switch (i112) {
                        case 0:
                            if (nd1Var.f39542b == 0 && nd1Var.f39548w == null) {
                                og.a aVar = nd1Var.f39549x;
                                int i122 = aVar.e + 1;
                                aVar.e = i122;
                                int[] iArr = og.a.f17730k;
                                if (i122 > 5) {
                                    aVar.e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.e];
                                aVar.f17737i = i13;
                                aVar.h = (int[]) og.a.f17731l.get(i13);
                                if (org.telegram.ui.ActionBar.h6.I.q()) {
                                    aVar.h = new int[]{i0.a.f(0.2f, aVar.h[0], -1), i0.a.f(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ah.l0(10, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                nd1Var.E = iArr[aVar.e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.u8 u8Var2 = nd1Var.d;
                            u8Var2.setChecked(true ^ u8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, w7.z5.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, w7.z5.d(-1, 56.0f, 48, 9.0f, 8.0f, 9.0f, 0.0f));
            org.telegram.ui.Cells.d9 d9Var = new org.telegram.ui.Cells.d9(context);
            d9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(d9Var, w7.z5.d(-1, -2.0f, 48, 0.0f, 58.0f, 0.0f, 0.0f));
        } else {
            md1 md1Var = new md1(this, this, getParentActivity());
            this.f39544f = md1Var;
            md1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f39544f.setClipChildren(false);
            frameLayout3.addView(this.f39544f, w7.z5.d(-1, -1.0f, 0, 12.0f, 12.0f, 12.0f, 12.0f));
            org.telegram.ui.Components.zq d = og.d.d(this.E, "");
            this.f39549x = (og.a) d.f33017a;
            this.v = new org.telegram.ui.Components.om0(context);
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(d, this.v, 0, 0);
            zqVar.f33024w = true;
            this.f39544f.setForumIconDrawable(zqVar);
            this.f39547s = zqVar;
            org.telegram.ui.Components.om0 om0Var = this.v;
            org.telegram.ui.Components.w9 w9Var2 = w9VarArr[0];
            ArrayList arrayList = om0Var.f29077n;
            if (!arrayList.contains(w9Var2)) {
                arrayList.add(w9Var2);
            }
            org.telegram.ui.Components.om0 om0Var2 = this.v;
            org.telegram.ui.Components.w9 w9Var3 = w9VarArr[1];
            ArrayList arrayList2 = om0Var2.f29077n;
            if (!arrayList2.contains(w9Var3)) {
                arrayList2.add(w9Var3);
            }
            w9VarArr[0].setImageDrawable(this.f39547s);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(w9VarArr[1], false, 1.0f, false);
            this.f39549x.d.add(w9VarArr[0]);
            this.f39549x.d.add(w9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.z5.c(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f39548w;
        if (tL_forumTopic3 != null) {
            this.e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f39548w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f39541a = -this.arguments.getLong("chat_id");
        long j10 = this.arguments.getLong("topic_id", 0L);
        this.f39543c = j10;
        if (j10 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f39541a, this.f39543c);
            this.f39548w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = og.a.f17730k[Math.abs(Utilities.random.nextInt() % 6)];
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
        if (!z10 && this.f39546r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        md1 md1Var = this.f39544f;
        if (md1Var != null) {
            md1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
