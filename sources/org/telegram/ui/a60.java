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
public final class a60 extends org.telegram.ui.Components.pm0 {
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public boolean L;
    public final g60 M;
    public final Context f35843c;
    public int d;
    public int f35844e;
    public int f35845f;
    public int h;
    public int f35846n;
    public int f35847r;
    public int f35848s;
    public int v;
    public int f35849w;
    public int f35850x;
    public int f35851y;

    public a60(g60 g60Var, LaunchActivity launchActivity) {
        this.M = g60Var;
        this.f35843c = launchActivity;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        int i10 = d1Var.f47662f;
        if (i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        g60 g60Var = this.M;
        ArrayList arrayList = g60Var.f37853q0;
        ChatObject.Call call = g60Var.f37789a1;
        if (call != null && !call.isScheduled() && !g60Var.f37863s0) {
            this.f35849w = -1;
            this.f35850x = -1;
            this.f35851y = -1;
            this.I = -1;
            this.J = -1;
            this.K = -1;
            boolean z10 = false;
            this.F = 0;
            if (g60Var.f37789a1.participants.h(MessageObject.getPeerId(g60Var.A0)) >= 0) {
                z10 = true;
            }
            this.L = z10;
            if (g60Var.p1()) {
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
            if (!arrayList.isEmpty() && g60Var.R0() && g60Var.f37789a1.call.participants_count > g60Var.d.getMessagesController().groupCallVideoMaxParticipants) {
                int i13 = this.F;
                this.F = i13 + 1;
                this.J = i13;
            }
            this.d = this.F;
            if (!g60Var.s1()) {
                this.F = g60Var.f37789a1.visibleParticipants.size() + this.F;
            }
            this.f35844e = this.F;
            if (!g60Var.f37789a1.invitedUsers.isEmpty() && !g60Var.s1()) {
                int i14 = this.F;
                this.f35845f = i14;
                int size2 = g60Var.f37789a1.invitedUsers.size() + i14;
                this.F = size2;
                this.h = size2;
            } else {
                this.f35845f = -1;
                this.h = -1;
            }
            if (!g60Var.f37789a1.shadyJoinParticipants.isEmpty() && !g60Var.s1()) {
                int i15 = this.F;
                this.f35846n = i15;
                int size3 = g60Var.f37789a1.shadyJoinParticipants.size() + i15;
                this.F = size3;
                this.f35847r = size3;
            } else {
                this.f35846n = -1;
                this.f35847r = -1;
            }
            if (!g60Var.f37789a1.shadyLeftParticipants.isEmpty() && !g60Var.s1()) {
                int i16 = this.F;
                this.f35848s = i16;
                int size4 = g60Var.f37789a1.shadyLeftParticipants.size() + i16;
                this.F = size4;
                this.v = size4;
            } else {
                this.f35848s = -1;
                this.v = -1;
            }
            if (g60Var.p1()) {
                int i17 = this.F;
                this.f35850x = i17;
                this.F = i17 + 2;
                this.f35851y = i17 + 1;
            } else if (!g60Var.s1() && (((!ChatObject.isChannel(g60Var.Z0) || ((chat2 = g60Var.Z0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(g60Var.Z0)) || (ChatObject.isChannel(g60Var.Z0) && (chat = g60Var.Z0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i18 = this.F;
                this.F = i18 + 1;
                this.f35849w = i18;
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
        if (i10 != this.f35849w && i10 != this.f35850x && i10 != this.f35851y) {
            if (i10 == this.I) {
                return 5;
            }
            if (i10 >= this.d && i10 < this.f35844e) {
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
    public final void v(s4.d1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.a60.v(s4.d1, int):void");
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        int i11;
        q50 q50Var;
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
        g60 g60Var = this.M;
        AccountInstance accountInstance = g60Var.d;
        int i17 = 3;
        Context context = this.f35843c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    q50Var = new View(context);
                                } else {
                                    if (g60Var.f37849p0 == null) {
                                        g60Var.f37849p0 = new r50();
                                    }
                                    q50Var = new q50(context, g60Var.f37849p0);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                                if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                                    textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    q50Var = textView;
                                } else {
                                    textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    q50Var = textView;
                                }
                            }
                        } else {
                            q50Var = new org.telegram.ui.Components.ao(context, 15);
                        }
                    } else {
                        q50Var = new z50(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f23664n = org.telegram.ui.ActionBar.i6.f21064rg;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20860gg, false));
                    frameLayout.f23662e = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(context);
                    frameLayout.f23659a = y9Var;
                    y9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
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
                    frameLayout.addView(y9Var, w7.x5.a(46.0f, f7, 6.0f, f10, 0.0f, 46, i18));
                    org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
                    frameLayout.f23660b = j5Var;
                    j5Var.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20990ng, false));
                    j5Var.setTypeface(AndroidUtilities.bold());
                    j5Var.setTextSize(16);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    j5Var.setGravity(i13 | 48);
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
                    frameLayout.addView(j5Var, w7.x5.a(20.0f, f11, 10.0f, f12, 0.0f, -1, i19));
                    org.telegram.ui.ActionBar.j5 j5Var2 = new org.telegram.ui.ActionBar.j5(context);
                    frameLayout.f23661c = j5Var2;
                    j5Var2.setTextSize(15);
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    j5Var2.setGravity(i15 | 48);
                    j5Var2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, frameLayout.f23664n, false));
                    j5Var2.l(LocaleController.getString(R.string.Invited), false);
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
                    frameLayout.addView(j5Var2, w7.x5.a(20.0f, f13, 32.0f, f14, 0.0f, -1, i20));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.msg_invited);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, frameLayout.f23664n, false), PorterDuff.Mode.MULTIPLY));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout.addView(imageView, w7.x5.a(-1.0f, 6.0f, 0.0f, 6.0f, 0.0f, 48, i17 | 16));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    q50Var = frameLayout;
                }
            } else {
                q50Var = new x50(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f23725n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f23726r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20860gg, false));
            frameLayout2.f23723e = 23;
            org.telegram.ui.ActionBar.j5 j5Var3 = new org.telegram.ui.ActionBar.j5(context);
            frameLayout2.f23720a = j5Var3;
            j5Var3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
            j5Var3.setTextSize(16);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            j5Var3.setGravity(i11);
            j5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(j5Var3);
            org.telegram.ui.ActionBar.j5 j5Var4 = new org.telegram.ui.ActionBar.j5(context);
            frameLayout2.f23721b = j5Var4;
            j5Var4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I6, false));
            j5Var4.setTextSize(16);
            if (!LocaleController.isRTL) {
                i17 = 5;
            }
            j5Var4.setGravity(i17);
            j5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(j5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f23722c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20962m6, false), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            q50Var = frameLayout2;
        }
        return com.google.android.gms.internal.vision.e2.k(q50Var, q50Var, -1, -2);
    }

    @Override
    public final void y(s4.d1 d1Var) {
        int i10;
        int i11;
        c50 c50Var = this.M.O;
        int i12 = d1Var.f47662f;
        View view = d1Var.f47658a;
        boolean z10 = false;
        if (i12 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            if (c50Var.getTag() != null) {
                i11 = org.telegram.ui.ActionBar.i6.f21064rg;
            } else {
                i11 = org.telegram.ui.ActionBar.i6.f20972mg;
            }
            e4Var.f(i11, org.telegram.ui.ActionBar.i6.x0(null, i11, false));
            if (d1Var.b() != this.F - 2) {
                z10 = true;
            }
            e4Var.setDrawDivider(z10);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            if (c50Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.i6.f21064rg;
            } else {
                i10 = org.telegram.ui.ActionBar.i6.f20972mg;
            }
            w3Var.a(i10, org.telegram.ui.ActionBar.i6.x0(null, i10, false));
            if (d1Var.b() != this.F - 2) {
                z10 = true;
            }
            w3Var.setDrawDivider(z10);
        }
    }
}
