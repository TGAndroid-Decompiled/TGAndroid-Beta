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
public final class i50 extends org.telegram.ui.Components.vk0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final o50 I;
    public final Context f39010c;
    public int d;
    public int f39011e;
    public int f39012f;
    public int h;
    public int f39013n;
    public int f39014r;
    public int f39015s;
    public int v;
    public int f39016w;
    public int f39017x;
    public int f39018y;

    public i50(o50 o50Var, LaunchActivity launchActivity) {
        this.I = o50Var;
        this.f39010c = launchActivity;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        int i9 = q1Var.f5505f;
        if (i9 != 3 && i9 != 4 && i9 != 5 && i9 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        o50 o50Var = this.I;
        ArrayList arrayList = o50Var.m0;
        ChatObject.Call call = o50Var.W0;
        if (call != null && !call.isScheduled() && !o50Var.f40938o0) {
            this.f39016w = -1;
            this.f39017x = -1;
            this.f39018y = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            boolean z10 = false;
            this.B = 0;
            if (o50Var.W0.participants.h(MessageObject.getPeerId(o50Var.f40973w0)) >= 0) {
                z10 = true;
            }
            this.H = z10;
            if (o50Var.o1()) {
                int i9 = this.B;
                this.B = i9 + 1;
                this.G = i9;
            }
            int i10 = this.B;
            this.C = i10;
            int size = arrayList.size() + i10;
            this.B = size;
            this.D = size;
            if (arrayList.size() > 0) {
                int i11 = this.B;
                this.B = i11 + 1;
                this.E = i11;
            }
            if (!arrayList.isEmpty() && o50Var.Q0() && o50Var.W0.call.participants_count > o50Var.d.getMessagesController().groupCallVideoMaxParticipants) {
                int i12 = this.B;
                this.B = i12 + 1;
                this.F = i12;
            }
            this.d = this.B;
            if (!o50Var.r1()) {
                this.B = o50Var.W0.visibleParticipants.size() + this.B;
            }
            this.f39011e = this.B;
            if (!o50Var.W0.invitedUsers.isEmpty() && !o50Var.r1()) {
                int i13 = this.B;
                this.f39012f = i13;
                int size2 = o50Var.W0.invitedUsers.size() + i13;
                this.B = size2;
                this.h = size2;
            } else {
                this.f39012f = -1;
                this.h = -1;
            }
            if (!o50Var.W0.shadyJoinParticipants.isEmpty() && !o50Var.r1()) {
                int i14 = this.B;
                this.f39013n = i14;
                int size3 = o50Var.W0.shadyJoinParticipants.size() + i14;
                this.B = size3;
                this.f39014r = size3;
            } else {
                this.f39013n = -1;
                this.f39014r = -1;
            }
            if (!o50Var.W0.shadyLeftParticipants.isEmpty() && !o50Var.r1()) {
                int i15 = this.B;
                this.f39015s = i15;
                int size4 = o50Var.W0.shadyLeftParticipants.size() + i15;
                this.B = size4;
                this.v = size4;
            } else {
                this.f39015s = -1;
                this.v = -1;
            }
            if (o50Var.o1()) {
                int i16 = this.B;
                this.f39017x = i16;
                this.B = i16 + 2;
                this.f39018y = i16 + 1;
            } else if (!o50Var.r1() && (((!ChatObject.isChannel(o50Var.V0) || ((chat2 = o50Var.V0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(o50Var.V0)) || (ChatObject.isChannel(o50Var.V0) && (chat = o50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i17 = this.B;
                this.B = i17 + 1;
                this.f39016w = i17;
            }
            int i18 = this.B;
            this.B = i18 + 1;
            this.A = i18;
        }
    }

    @Override
    public final int h() {
        return this.B;
    }

    @Override
    public final int j(int i9) {
        if (i9 == this.A) {
            return 3;
        }
        if (i9 != this.f39016w && i9 != this.f39017x && i9 != this.f39018y) {
            if (i9 == this.E) {
                return 5;
            }
            if (i9 >= this.d && i9 < this.f39011e) {
                return 1;
            }
            if (i9 >= this.C && i9 < this.D) {
                return 4;
            }
            if (i9 == this.F) {
                return 6;
            }
            if (i9 == this.G) {
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
    public final void m(int i9) {
        E();
        super.m(i9);
    }

    @Override
    public final void p(int i9, int i10) {
        E();
        super.p(i9, i10);
    }

    @Override
    public final void q(int i9, int i10) {
        E();
        super.q(i9, i10);
    }

    @Override
    public final void r(int i9, int i10, Object obj) {
        E();
        super.r(i9, i10, obj);
    }

    @Override
    public final void s(int i9, int i10) {
        E();
        super.s(i9, i10);
    }

    @Override
    public final void t(int i9, int i10) {
        E();
        super.t(i9, i10);
    }

    @Override
    public final void v(f2.q1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.i50.v(f2.q1, int):void");
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        int i10;
        fh.l2 l2Var;
        int i11;
        float f10;
        float f11;
        int i12;
        int i13;
        float f12;
        float f13;
        int i14;
        int i15;
        float f14;
        float f15;
        o50 o50Var = this.I;
        AccountInstance accountInstance = o50Var.d;
        int i16 = 3;
        Context context = this.f39010c;
        if (i9 != 0) {
            if (i9 != 1) {
                if (i9 != 2) {
                    if (i9 != 4) {
                        if (i9 != 5) {
                            if (i9 != 6) {
                                if (i9 != 7) {
                                    l2Var = new View(context);
                                } else {
                                    if (o50Var.f40927l0 == null) {
                                        o50Var.f40927l0 = new z40();
                                    }
                                    l2Var = new fh.l2(context, o50Var.f40927l0);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                                if (ChatObject.isChannelOrGiga(o50Var.V0)) {
                                    textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    l2Var = textView;
                                } else {
                                    textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    l2Var = textView;
                                }
                            }
                        } else {
                            l2Var = new org.telegram.ui.Components.an(context, 16);
                        }
                    } else {
                        l2Var = new h50(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f25894n = org.telegram.ui.ActionBar.f6.f23258rg;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23065gg, false));
                    frameLayout.f25892e = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.b6) null);
                    org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(context);
                    frameLayout.f25889a = o9Var;
                    o9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i11 = 5;
                    } else {
                        i11 = 3;
                    }
                    int i17 = i11 | 48;
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = 11.0f;
                    }
                    if (z10) {
                        f11 = 11.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    frameLayout.addView(o9Var, g7.e6.d(46, 46.0f, i17, f10, 6.0f, f11, 0.0f));
                    org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                    frameLayout.f25890b = h5Var;
                    h5Var.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23188ng, false));
                    h5Var.setTypeface(AndroidUtilities.bold());
                    h5Var.setTextSize(16);
                    if (LocaleController.isRTL) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    h5Var.setGravity(i12 | 48);
                    boolean z11 = LocaleController.isRTL;
                    if (z11) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    int i18 = i13 | 48;
                    if (z11) {
                        f12 = 54.0f;
                    } else {
                        f12 = 67.0f;
                    }
                    if (z11) {
                        f13 = 67.0f;
                    } else {
                        f13 = 54.0f;
                    }
                    frameLayout.addView(h5Var, g7.e6.d(-1, 20.0f, i18, f12, 10.0f, f13, 0.0f));
                    org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
                    frameLayout.f25891c = h5Var2;
                    h5Var2.setTextSize(15);
                    if (LocaleController.isRTL) {
                        i14 = 5;
                    } else {
                        i14 = 3;
                    }
                    h5Var2.setGravity(i14 | 48);
                    h5Var2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, frameLayout.f25894n, false));
                    h5Var2.l(LocaleController.getString(R.string.Invited), false);
                    boolean z12 = LocaleController.isRTL;
                    if (z12) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    int i19 = i15 | 48;
                    if (z12) {
                        f14 = 54.0f;
                    } else {
                        f14 = 67.0f;
                    }
                    if (z12) {
                        f15 = 67.0f;
                    } else {
                        f15 = 54.0f;
                    }
                    frameLayout.addView(h5Var2, g7.e6.d(-1, 20.0f, i19, f14, 32.0f, f15, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.msg_invited);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, frameLayout.f25894n, false), PorterDuff.Mode.MULTIPLY));
                    if (!LocaleController.isRTL) {
                        i16 = 5;
                    }
                    frameLayout.addView(imageView, g7.e6.d(48, -1.0f, i16 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    l2Var = frameLayout;
                }
            } else {
                l2Var = new f50(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f25943n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f25944r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23065gg, false));
            frameLayout2.f25941e = 23;
            org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
            frameLayout2.f25938a = h5Var3;
            h5Var3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
            h5Var3.setTextSize(16);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            h5Var3.setGravity(i10);
            h5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(h5Var3);
            org.telegram.ui.ActionBar.h5 h5Var4 = new org.telegram.ui.ActionBar.h5(context);
            frameLayout2.f25939b = h5Var4;
            h5Var4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.I6, false));
            h5Var4.setTextSize(16);
            if (!LocaleController.isRTL) {
                i16 = 5;
            }
            h5Var4.setGravity(i16);
            h5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(h5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f25940c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23162m6, false), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            l2Var = frameLayout2;
        }
        return j3.r0.s(l2Var, l2Var, -1, -2);
    }

    @Override
    public final void y(f2.q1 q1Var) {
        int i9;
        int i10;
        k40 k40Var = this.I.K;
        int i11 = q1Var.f5505f;
        View view = q1Var.f5501a;
        boolean z10 = false;
        if (i11 == 1) {
            org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) view;
            if (k40Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.f6.f23258rg;
            } else {
                i10 = org.telegram.ui.ActionBar.f6.f23170mg;
            }
            e4Var.f(i10, org.telegram.ui.ActionBar.f6.w0(null, i10, false));
            if (q1Var.b() != this.B - 2) {
                z10 = true;
            }
            e4Var.setDrawDivider(z10);
        } else if (i11 == 2) {
            org.telegram.ui.Cells.w3 w3Var = (org.telegram.ui.Cells.w3) view;
            if (k40Var.getTag() != null) {
                i9 = org.telegram.ui.ActionBar.f6.f23258rg;
            } else {
                i9 = org.telegram.ui.ActionBar.f6.f23170mg;
            }
            w3Var.a(i9, org.telegram.ui.ActionBar.f6.w0(null, i9, false));
            if (q1Var.b() != this.B - 2) {
                z10 = true;
            }
            w3Var.setDrawDivider(z10);
        }
    }
}
