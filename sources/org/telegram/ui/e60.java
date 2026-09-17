package org.telegram.ui;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class e60 extends org.telegram.ui.Components.ll0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final k60 M;
    public final Context f33291c;
    public int d;
    public int e;
    public int f33292f;
    public int h;
    public int f33293n;
    public int f33294r;
    public int f33295s;
    public int v;
    public int f33296w;
    public int f33297x;
    public int f33298y;

    public e60(k60 k60Var, LaunchActivity launchActivity) {
        this.M = k60Var;
        this.f33291c = launchActivity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        int i10 = c1Var.f42700f;
        if (i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        k60 k60Var = this.M;
        ArrayList arrayList = k60Var.f35075q0;
        ChatObject.Call call = k60Var.f35012a1;
        if (call != null && !call.isScheduled() && !k60Var.f35085s0) {
            this.f33296w = -1;
            this.f33297x = -1;
            this.f33298y = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            boolean z10 = false;
            this.F = 0;
            if (k60Var.f35012a1.participants.h(MessageObject.getPeerId(k60Var.A0)) >= 0) {
                z10 = true;
            }
            this.L = z10;
            if (k60Var.o1()) {
                int i10 = this.F;
                this.F = i10 + 1;
                this.K = i10;
            }
            int i11 = this.F;
            this.G = i11;
            int size = arrayList.size() + i11;
            this.F = size;
            this.H = size;
            if (arrayList.size() > 0) {
                int i12 = this.F;
                this.F = i12 + 1;
                this.I = i12;
            }
            if (!arrayList.isEmpty() && k60Var.Q0() && k60Var.f35012a1.call.participants_count > k60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.J = i13;
            }
            this.d = this.F;
            if (!k60Var.r1()) {
                this.F = k60Var.f35012a1.visibleParticipants.size() + this.F;
            }
            this.e = this.F;
            if (!k60Var.f35012a1.invitedUsers.isEmpty() && !k60Var.r1()) {
                int i14 = this.F;
                this.f33292f = i14;
                int size2 = k60Var.f35012a1.invitedUsers.size() + i14;
                this.F = size2;
                this.h = size2;
            } else {
                this.f33292f = -1;
                this.h = -1;
            }
            if (!k60Var.f35012a1.shadyJoinParticipants.isEmpty() && !k60Var.r1()) {
                int i15 = this.F;
                this.f33293n = i15;
                int size3 = k60Var.f35012a1.shadyJoinParticipants.size() + i15;
                this.F = size3;
                this.f33294r = size3;
            } else {
                this.f33293n = -1;
                this.f33294r = -1;
            }
            if (!k60Var.f35012a1.shadyLeftParticipants.isEmpty() && !k60Var.r1()) {
                int i16 = this.F;
                this.f33295s = i16;
                int size4 = k60Var.f35012a1.shadyLeftParticipants.size() + i16;
                this.F = size4;
                this.v = size4;
            } else {
                this.f33295s = -1;
                this.v = -1;
            }
            if (k60Var.o1()) {
                int i17 = this.F;
                this.f33297x = i17;
                this.F = i17 + 2;
                this.f33298y = i17 + 1;
            } else if (!k60Var.r1() && (((!ChatObject.isChannel(k60Var.Z0) || ((chat2 = k60Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(k60Var.Z0)) || (ChatObject.isChannel(k60Var.Z0) && (chat = k60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i18 = this.F;
                this.F = i18 + 1;
                this.f33296w = i18;
            }
            int i19 = this.F;
            this.F = i19 + 1;
            this.E = i19;
        }
    }

    @Override
    public final int h() {
        return this.F;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.E) {
            return 3;
        }
        if (i10 != this.f33296w && i10 != this.f33297x && i10 != this.f33298y) {
            if (i10 == this.I) {
                return 5;
            }
            if (i10 >= this.d && i10 < this.e) {
                return 1;
            }
            if (i10 >= this.G && i10 < this.H) {
                return 4;
            }
            if (i10 == this.J) {
                return 6;
            }
            if (i10 == this.K) {
                return 7;
            }
            return 2;
        }
        return 0;
    }

    @Override
    public final void l() {
        E();
        super.l();
    }

    @Override
    public final void m(int i10) {
        E();
        super.m(i10);
    }

    @Override
    public final void p(int i10, int i11) {
        E();
        super.p(i10, i11);
    }

    @Override
    public final void q(int i10, int i11) {
        E();
        super.q(i10, i11);
    }

    @Override
    public final void r(int i10, int i11, Object obj) {
        E();
        super.r(i10, i11, obj);
    }

    @Override
    public final void s(int i10, int i11) {
        E();
        super.s(i10, i11);
    }

    @Override
    public final void t(int i10, int i11) {
        E();
        super.t(i10, i11);
    }

    @Override
    public final void v(s4.c1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.e60.v(s4.c1, int):void");
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        int i11;
        u50 u50Var;
        int i12;
        float f7;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        k60 k60Var = this.M;
        AccountInstance accountInstance = k60Var.d;
        int i17 = 3;
        Context context = this.f33291c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    u50Var = new View(context);
                                } else {
                                    if (k60Var.f35071p0 == null) {
                                        k60Var.f35071p0 = new v50();
                                    }
                                    u50Var = new u50(context, k60Var.f35071p0);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                                if (ChatObject.isChannelOrGiga(k60Var.Z0)) {
                                    textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    u50Var = textView;
                                } else {
                                    textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    u50Var = textView;
                                }
                            }
                        } else {
                            u50Var = new org.telegram.ui.Components.kn(context, 15);
                        }
                    } else {
                        u50Var = new d60(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f21478n = org.telegram.ui.ActionBar.j6.f19128rg;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18925gg, false));
                    frameLayout.e = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
                    org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(context);
                    frameLayout.f21474a = u9Var;
                    u9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i18 = i12 | 48;
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = 11.0f;
                    }
                    if (z10) {
                        f10 = 11.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    frameLayout.addView(u9Var, w7.x5.d(46, 46.0f, i18, f7, 6.0f, f10, 0.0f));
                    org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
                    frameLayout.f21475b = k5Var;
                    k5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19054ng, false));
                    k5Var.setTypeface(AndroidUtilities.bold());
                    k5Var.setTextSize(16);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    k5Var.setGravity(i13 | 48);
                    boolean z11 = LocaleController.isRTL;
                    if (z11) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    int i19 = i14 | 48;
                    if (z11) {
                        f11 = 54.0f;
                    } else {
                        f11 = 67.0f;
                    }
                    if (z11) {
                        f12 = 67.0f;
                    } else {
                        f12 = 54.0f;
                    }
                    frameLayout.addView(k5Var, w7.x5.d(-1, 20.0f, i19, f11, 10.0f, f12, 0.0f));
                    org.telegram.ui.ActionBar.k5 k5Var2 = new org.telegram.ui.ActionBar.k5(context);
                    frameLayout.f21476c = k5Var2;
                    k5Var2.setTextSize(15);
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    k5Var2.setGravity(i15 | 48);
                    k5Var2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, frameLayout.f21478n, false));
                    k5Var2.l(LocaleController.getString(R.string.Invited), false);
                    boolean z12 = LocaleController.isRTL;
                    if (z12) {
                        i16 = 5;
                    } else {
                        i16 = 3;
                    }
                    int i20 = i16 | 48;
                    if (z12) {
                        f13 = 54.0f;
                    } else {
                        f13 = 67.0f;
                    }
                    if (z12) {
                        f14 = 67.0f;
                    } else {
                        f14 = 54.0f;
                    }
                    frameLayout.addView(k5Var2, w7.x5.d(-1, 20.0f, i20, f13, 32.0f, f14, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.msg_invited);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, frameLayout.f21478n, false), PorterDuff.Mode.MULTIPLY));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout.addView(imageView, w7.x5.d(48, -1.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    u50Var = frameLayout;
                }
            } else {
                u50Var = new b60(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f21581n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f21582r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18925gg, false));
            frameLayout2.e = 23;
            org.telegram.ui.ActionBar.k5 k5Var3 = new org.telegram.ui.ActionBar.k5(context);
            frameLayout2.f21577a = k5Var3;
            k5Var3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
            k5Var3.setTextSize(16);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            k5Var3.setGravity(i11);
            k5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(k5Var3);
            org.telegram.ui.ActionBar.k5 k5Var4 = new org.telegram.ui.ActionBar.k5(context);
            frameLayout2.f21578b = k5Var4;
            k5Var4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false));
            k5Var4.setTextSize(16);
            if (!LocaleController.isRTL) {
                i17 = 5;
            }
            k5Var4.setGravity(i17);
            k5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(k5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f21579c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19027m6, false), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            u50Var = frameLayout2;
        }
        return com.google.android.gms.internal.vision.e2.k(u50Var, u50Var, -1, -2);
    }

    @Override
    public final void y(s4.c1 c1Var) {
        int i10;
        int i11;
        g50 g50Var = this.M.O;
        int i12 = c1Var.f42700f;
        View view = c1Var.f42697a;
        boolean z10 = false;
        if (i12 == 1) {
            org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) view;
            if (g50Var.getTag() != null) {
                i11 = org.telegram.ui.ActionBar.j6.f19128rg;
            } else {
                i11 = org.telegram.ui.ActionBar.j6.f19037mg;
            }
            d4Var.f(i11, org.telegram.ui.ActionBar.j6.w0(null, i11, false));
            if (c1Var.b() != this.F - 2) {
                z10 = true;
            }
            d4Var.setDrawDivider(z10);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.v3 v3Var = (org.telegram.ui.Cells.v3) view;
            if (g50Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.j6.f19128rg;
            } else {
                i10 = org.telegram.ui.ActionBar.j6.f19037mg;
            }
            v3Var.a(i10, org.telegram.ui.ActionBar.j6.w0(null, i10, false));
            if (c1Var.b() != this.F - 2) {
                z10 = true;
            }
            v3Var.setDrawDivider(z10);
        }
    }
}
