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
public final class df1 extends org.telegram.ui.ActionBar.m2 {
    public int E;
    public AnimationNotificationsLocker F;
    public long f36785a;
    public long f36786b;
    public long f36787c;
    public org.telegram.ui.Cells.v8 d;
    public EditTextBoldCursor f36788e;
    public cf1 f36789f;
    public org.telegram.ui.Components.y9[] h;
    public String f36790n;
    public boolean f36791r;
    public org.telegram.ui.Components.hr f36792s;
    public org.telegram.ui.Components.bn0 v;
    public TLRPC.TL_forumTopic f36793w;
    public ng.a f36794x;
    public eo f36795y;

    public static df1 a0(long j3, long j10) {
        Bundle f7 = sc.v.f(j3, "chat_id");
        f7.putLong("topic_id", j10);
        ?? m2Var = new org.telegram.ui.ActionBar.m2(f7);
        m2Var.h = new org.telegram.ui.Components.y9[2];
        m2Var.f36790n = "";
        m2Var.F = new AnimationNotificationsLocker();
        return m2Var;
    }

    public final void b0(Long l4, boolean z10) {
        long longValue;
        org.telegram.ui.Components.y9[] y9VarArr = this.h;
        if (this.f36789f != null && this.v != null) {
            if (l4 == null) {
                longValue = 0;
            } else {
                longValue = l4.longValue();
            }
            this.f36789f.setSelected(Long.valueOf(longValue));
            if (this.f36786b != longValue) {
                if (!z10 && longValue != 0 && !getUserConfig().isPremium()) {
                    TLRPC.Document f7 = org.telegram.ui.Components.s5.f(this.currentAccount, l4.longValue());
                    if (f7 != null) {
                        org.telegram.ui.Components.zc.a0(this).q(f7, AndroidUtilities.replaceTags(LocaleController.getString(R.string.UnlockPremiumEmojiHint)), LocaleController.getString(R.string.PremiumMore), new ye1(this, 0)).j();
                        return;
                    }
                    return;
                }
                this.f36786b = longValue;
                if (longValue != 0) {
                    org.telegram.ui.Components.s5 s5Var = new org.telegram.ui.Components.s5(10, this.currentAccount, longValue);
                    s5Var.setColorFilter(org.telegram.ui.ActionBar.h6.f20889v3);
                    y9VarArr[1].setAnimatedEmojiDrawable(s5Var);
                    y9VarArr[1].setImageDrawable(null);
                } else {
                    org.telegram.ui.Components.r90 r90Var = new org.telegram.ui.Components.r90(1, null);
                    r90Var.a(this.f36790n);
                    this.v.b(r90Var, false);
                    y9VarArr[1].setImageDrawable(this.f36792s);
                    y9VarArr[1].setAnimatedEmojiDrawable(null);
                }
                org.telegram.ui.Components.y9 y9Var = y9VarArr[0];
                org.telegram.ui.Components.y9 y9Var2 = y9VarArr[1];
                y9VarArr[0] = y9Var2;
                y9VarArr[1] = y9Var;
                AndroidUtilities.updateViewVisibilityAnimated(y9Var2, true, 0.5f, true);
                AndroidUtilities.updateViewVisibilityAnimated(y9VarArr[1], false, 0.5f, true);
            }
        }
    }

    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.y9[] y9VarArr = this.h;
        if (this.f36793w != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.EditTopic));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.NewTopic));
        }
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setActionBarMenuOnItemClick(new ze1(this));
        if (this.f36793w == null) {
            this.actionBar.p().e(1, LocaleController.getString(R.string.Create));
        } else {
            this.actionBar.p().a(2, R.drawable.ic_ab_done);
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.h6.f20503a7;
        kVar.setBackgroundColor(getThemedColor(i10));
        this.actionBar.setCastShadows(false);
        org.telegram.ui.Components.yw0 yw0Var = new org.telegram.ui.Components.yw0(context, null);
        this.fragmentView = yw0Var;
        yw0Var.setBackgroundColor(getThemedColor(i10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        yw0Var.addView(linearLayout);
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context);
        TLRPC.TL_forumTopic tL_forumTopic = this.f36793w;
        if (tL_forumTopic != null && tL_forumTopic.f19854id == 1) {
            m4Var.setText(LocaleController.getString(R.string.CreateGeneralTopicTitle));
        } else {
            m4Var.setText(LocaleController.getString(R.string.CreateTopicTitle));
        }
        FrameLayout frameLayout = new FrameLayout(context);
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f36788e = editTextBoldCursor;
        editTextBoldCursor.setHintText(LocaleController.getString(R.string.EnterTopicName));
        this.f36788e.setHintColor(getThemedColor(org.telegram.ui.ActionBar.h6.Vd));
        this.f36788e.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ud));
        this.f36788e.setPadding(AndroidUtilities.dp(0.0f), this.f36788e.getPaddingTop(), AndroidUtilities.dp(0.0f), this.f36788e.getPaddingBottom());
        this.f36788e.setBackground(null);
        this.f36788e.setSingleLine(true);
        EditTextBoldCursor editTextBoldCursor2 = this.f36788e;
        editTextBoldCursor2.setInputType(editTextBoldCursor2.getInputType() | 16384);
        frameLayout.addView(this.f36788e, w7.w5.a(-1.0f, 51.0f, 4.0f, 21.0f, 4.0f, -1, 0));
        this.f36788e.addTextChangedListener(new m0(this, 16));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final df1 f43920b;

            {
                this.f43920b = this;
            }

            @Override
            public final void onClick(View view) {
                int i11 = r2;
                df1 df1Var = this.f43920b;
                switch (i11) {
                    case 0:
                        if (df1Var.f36786b == 0 && df1Var.f36793w == null) {
                            ng.a aVar = df1Var.f36794x;
                            int i12 = aVar.f16600e + 1;
                            aVar.f16600e = i12;
                            int[] iArr = ng.a.f16595k;
                            if (i12 > 5) {
                                aVar.f16600e = 0;
                            }
                            int[] iArr2 = aVar.h;
                            int i13 = iArr[aVar.f16600e];
                            aVar.f16603i = i13;
                            aVar.h = (int[]) ng.a.f16596l.get(i13);
                            if (org.telegram.ui.ActionBar.h6.I.q()) {
                                aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                            }
                            aVar.invalidateSelf();
                            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                            ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                            ofFloat.setDuration(200L);
                            ofFloat.start();
                            df1Var.E = iArr[aVar.f16600e];
                            return;
                        }
                        return;
                    default:
                        org.telegram.ui.Cells.v8 v8Var = df1Var.d;
                        v8Var.setChecked(true ^ v8Var.d.h);
                        return;
                }
            }
        });
        for (int i11 = 0; i11 < 2; i11++) {
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
            y9VarArr[i11] = y9Var;
            frameLayout2.addView(y9Var, w7.w5.e(28, 28, 17));
        }
        frameLayout.addView(frameLayout2, w7.w5.a(40.0f, 10.0f, 0.0f, 0.0f, 0.0f, 40, 16));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.addView(m4Var);
        linearLayout2.addView(frameLayout);
        int dp = AndroidUtilities.dp(16.0f);
        int i12 = org.telegram.ui.ActionBar.h6.f20559d6;
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.e0(dp, getThemedColor(i12)));
        linearLayout.addView(linearLayout2, w7.w5.t(-1, -2, 48, 9, 1, 9, 0));
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.setClipChildren(false);
        TLRPC.TL_forumTopic tL_forumTopic2 = this.f36793w;
        if (tL_forumTopic2 != null && tL_forumTopic2.f19854id == 1) {
            ImageView imageView = new ImageView(context);
            imageView.setImageResource(R.drawable.msg_filled_general);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.Ac), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView, w7.w5.e(22, 22, 17));
            frameLayout3.addView(new View(context), w7.w5.d(8.0f, -1));
            FrameLayout frameLayout4 = new FrameLayout(context);
            frameLayout4.setBackground(org.telegram.ui.ActionBar.h6.e0(AndroidUtilities.dp(16.0f), getThemedColor(i12)));
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.d = v8Var;
            v8Var.getCheckBox().setDrawIconType(0);
            this.d.d(LocaleController.getString(R.string.EditTopicHide), !this.f36793w.hidden, false, false);
            this.d.setBackground(org.telegram.ui.ActionBar.h6.a0(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.h6.f20650i6), 16, 16));
            this.d.setOnClickListener(new View.OnClickListener(this) {
                public final df1 f43920b;

                {
                    this.f43920b = this;
                }

                @Override
                public final void onClick(View view) {
                    int i112 = r2;
                    df1 df1Var = this.f43920b;
                    switch (i112) {
                        case 0:
                            if (df1Var.f36786b == 0 && df1Var.f36793w == null) {
                                ng.a aVar = df1Var.f36794x;
                                int i122 = aVar.f16600e + 1;
                                aVar.f16600e = i122;
                                int[] iArr = ng.a.f16595k;
                                if (i122 > 5) {
                                    aVar.f16600e = 0;
                                }
                                int[] iArr2 = aVar.h;
                                int i13 = iArr[aVar.f16600e];
                                aVar.f16603i = i13;
                                aVar.h = (int[]) ng.a.f16596l.get(i13);
                                if (org.telegram.ui.ActionBar.h6.I.q()) {
                                    aVar.h = new int[]{i0.a.d(0.2f, aVar.h[0], -1), i0.a.d(0.2f, aVar.h[1], -1)};
                                }
                                aVar.invalidateSelf();
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                ofFloat.addUpdateListener(new ai.x(8, aVar, iArr2));
                                ofFloat.setDuration(200L);
                                ofFloat.start();
                                df1Var.E = iArr[aVar.f16600e];
                                return;
                            }
                            return;
                        default:
                            org.telegram.ui.Cells.v8 v8Var2 = df1Var.d;
                            v8Var2.setChecked(true ^ v8Var2.d.h);
                            return;
                    }
                }
            });
            frameLayout4.addView(this.d, w7.w5.e(-1, 50, 119));
            frameLayout3.addView(frameLayout4, w7.w5.a(56.0f, 9.0f, 8.0f, 9.0f, 0.0f, -1, 48));
            org.telegram.ui.Cells.e9 e9Var = new org.telegram.ui.Cells.e9(context);
            e9Var.setText(LocaleController.getString(R.string.EditTopicHideInfo));
            frameLayout3.addView(e9Var, w7.w5.a(-2.0f, 0.0f, 58.0f, 0.0f, 0.0f, -1, 48));
        } else {
            cf1 cf1Var = new cf1(this, this, getParentActivity());
            this.f36789f = cf1Var;
            cf1Var.setAnimationsEnabled(this.fragmentBeginToShow);
            this.f36789f.setClipChildren(false);
            frameLayout3.addView(this.f36789f, w7.w5.a(-1.0f, 12.0f, 12.0f, 12.0f, 12.0f, -1, 0));
            org.telegram.ui.Components.hr d = ng.d.d(this.E, "");
            this.f36794x = (ng.a) d.f26889a;
            this.v = new org.telegram.ui.Components.bn0(context);
            org.telegram.ui.Components.hr hrVar = new org.telegram.ui.Components.hr(d, this.v, 0, 0);
            hrVar.f26897w = true;
            this.f36789f.setForumIconDrawable(hrVar);
            this.f36792s = hrVar;
            org.telegram.ui.Components.bn0 bn0Var = this.v;
            org.telegram.ui.Components.y9 y9Var2 = y9VarArr[0];
            ArrayList arrayList = bn0Var.f24697n;
            if (!arrayList.contains(y9Var2)) {
                arrayList.add(y9Var2);
            }
            org.telegram.ui.Components.bn0 bn0Var2 = this.v;
            org.telegram.ui.Components.y9 y9Var3 = y9VarArr[1];
            ArrayList arrayList2 = bn0Var2.f24697n;
            if (!arrayList2.contains(y9Var3)) {
                arrayList2.add(y9Var3);
            }
            y9VarArr[0].setImageDrawable(this.f36792s);
            AndroidUtilities.updateViewVisibilityAnimated(y9VarArr[0], true, 1.0f, false);
            AndroidUtilities.updateViewVisibilityAnimated(y9VarArr[1], false, 1.0f, false);
            this.f36794x.d.add(y9VarArr[0]);
            this.f36794x.d.add(y9VarArr[1]);
        }
        linearLayout.addView(frameLayout3, w7.w5.d(-1.0f, -1));
        TLRPC.TL_forumTopic tL_forumTopic3 = this.f36793w;
        if (tL_forumTopic3 != null) {
            this.f36788e.setText(tL_forumTopic3.title);
            b0(Long.valueOf(this.f36793w.icon_emoji_id), true);
        } else {
            b0(0L, true);
        }
        return this.fragmentView;
    }

    @Override
    public final boolean onFragmentCreate() {
        this.f36785a = -this.arguments.getLong("chat_id");
        long j3 = this.arguments.getLong("topic_id", 0L);
        this.f36787c = j3;
        if (j3 != 0) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(-this.f36785a, this.f36787c);
            this.f36793w = findTopic;
            if (findTopic == null) {
                return false;
            }
            this.E = findTopic.icon_color;
        } else {
            this.E = ng.a.f16595k[Math.abs(Utilities.random.nextInt() % 6)];
        }
        return super.onFragmentCreate();
    }

    @Override
    public final void onResume() {
        super.onResume();
        this.f36788e.requestFocus();
        AndroidUtilities.showKeyboard(this.f36788e);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        super.onTransitionAnimationEnd(z10, z11);
        if (!z10 && this.f36791r) {
            removeSelfFromStack();
        }
        this.F.unlock();
        cf1 cf1Var = this.f36789f;
        if (cf1Var != null) {
            cf1Var.setAnimationsEnabled(this.fragmentBeginToShow);
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
