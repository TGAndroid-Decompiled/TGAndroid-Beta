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
public final class l50 extends org.telegram.ui.Components.il0 {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public final r50 I;
    public final Context f40095c;
    public int d;
    public int f40096e;
    public int f40097f;
    public int h;
    public int f40098n;
    public int f40099r;
    public int f40100s;
    public int v;
    public int f40101w;
    public int f40102x;
    public int f40103y;

    public l50(r50 r50Var, LaunchActivity launchActivity) {
        this.I = r50Var;
        this.f40095c = launchActivity;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        int i10 = n1Var.f6436f;
        if (i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6) {
            return true;
        }
        return false;
    }

    public final void E() {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        r50 r50Var = this.I;
        ArrayList arrayList = r50Var.m0;
        ChatObject.Call call = r50Var.W0;
        if (call != null && !call.isScheduled() && !r50Var.f41925o0) {
            this.f40101w = -1;
            this.f40102x = -1;
            this.f40103y = -1;
            this.E = -1;
            this.F = -1;
            this.G = -1;
            boolean z10 = false;
            this.B = 0;
            if (r50Var.W0.participants.h(MessageObject.getPeerId(r50Var.f41960w0)) >= 0) {
                z10 = true;
            }
            this.H = z10;
            if (r50Var.o1()) {
                int i10 = this.B;
                this.B = i10 + 1;
                this.G = i10;
            }
            int i11 = this.B;
            this.C = i11;
            int size = arrayList.size() + i11;
            this.B = size;
            this.D = size;
            if (arrayList.size() > 0) {
                int i12 = this.B;
                this.B = i12 + 1;
                this.E = i12;
            }
            if (!arrayList.isEmpty() && r50Var.Q0() && r50Var.W0.call.participants_count > r50Var.d.getMessagesController().groupCallVideoMaxParticipants) {
                int i13 = this.B;
                this.B = i13 + 1;
                this.F = i13;
            }
            this.d = this.B;
            if (!r50Var.r1()) {
                this.B = r50Var.W0.visibleParticipants.size() + this.B;
            }
            this.f40096e = this.B;
            if (!r50Var.W0.invitedUsers.isEmpty() && !r50Var.r1()) {
                int i14 = this.B;
                this.f40097f = i14;
                int size2 = r50Var.W0.invitedUsers.size() + i14;
                this.B = size2;
                this.h = size2;
            } else {
                this.f40097f = -1;
                this.h = -1;
            }
            if (!r50Var.W0.shadyJoinParticipants.isEmpty() && !r50Var.r1()) {
                int i15 = this.B;
                this.f40098n = i15;
                int size3 = r50Var.W0.shadyJoinParticipants.size() + i15;
                this.B = size3;
                this.f40099r = size3;
            } else {
                this.f40098n = -1;
                this.f40099r = -1;
            }
            if (!r50Var.W0.shadyLeftParticipants.isEmpty() && !r50Var.r1()) {
                int i16 = this.B;
                this.f40100s = i16;
                int size4 = r50Var.W0.shadyLeftParticipants.size() + i16;
                this.B = size4;
                this.v = size4;
            } else {
                this.f40100s = -1;
                this.v = -1;
            }
            if (r50Var.o1()) {
                int i17 = this.B;
                this.f40102x = i17;
                this.B = i17 + 2;
                this.f40103y = i17 + 1;
            } else if (!r50Var.r1() && (((!ChatObject.isChannel(r50Var.V0) || ((chat2 = r50Var.V0) != null && chat2.megagroup)) && ChatObject.canWriteToChat(r50Var.V0)) || (ChatObject.isChannel(r50Var.V0) && (chat = r50Var.V0) != null && !chat.megagroup && ChatObject.isPublic(chat)))) {
                int i18 = this.B;
                this.B = i18 + 1;
                this.f40101w = i18;
            }
            int i19 = this.B;
            this.B = i19 + 1;
            this.A = i19;
        }
    }

    @Override
    public final int h() {
        return this.B;
    }

    @Override
    public final int j(int i10) {
        if (i10 == this.A) {
            return 3;
        }
        if (i10 != this.f40101w && i10 != this.f40102x && i10 != this.f40103y) {
            if (i10 == this.E) {
                return 5;
            }
            if (i10 >= this.d && i10 < this.f40096e) {
                return 1;
            }
            if (i10 >= this.C && i10 < this.D) {
                return 4;
            }
            if (i10 == this.F) {
                return 6;
            }
            if (i10 == this.G) {
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
    public final void v(f2.n1 r23, int r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l50.v(f2.n1, int):void");
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        int i11;
        cg.h0 h0Var;
        int i12;
        float f9;
        float f10;
        int i13;
        int i14;
        float f11;
        float f12;
        int i15;
        int i16;
        float f13;
        float f14;
        r50 r50Var = this.I;
        AccountInstance accountInstance = r50Var.d;
        int i17 = 3;
        Context context = this.f40095c;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 6) {
                                if (i10 != 7) {
                                    h0Var = new View(context);
                                } else {
                                    if (r50Var.f41914l0 == null) {
                                        r50Var.f41914l0 = new b50();
                                    }
                                    h0Var = new cg.h0(context, r50Var.f41914l0);
                                }
                            } else {
                                TextView textView = new TextView(context);
                                textView.setTextColor(-8682615);
                                textView.setTextSize(1, 13.0f);
                                textView.setGravity(1);
                                textView.setPadding(0, 0, 0, AndroidUtilities.dp(10.0f));
                                if (ChatObject.isChannelOrGiga(r50Var.V0)) {
                                    textView.setText(LocaleController.formatString(R.string.VoipChannelVideoNotAvailableAdmin, LocaleController.formatPluralString("Participants", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    h0Var = textView;
                                } else {
                                    textView.setText(LocaleController.formatString(R.string.VoipVideoNotAvailableAdmin, LocaleController.formatPluralString("Members", accountInstance.getMessagesController().groupCallVideoMaxParticipants, new Object[0])));
                                    h0Var = textView;
                                }
                            }
                        } else {
                            h0Var = new org.telegram.ui.Components.fn(context, 13);
                        }
                    } else {
                        h0Var = new k50(this, context);
                    }
                } else {
                    ?? frameLayout = new FrameLayout(context);
                    frameLayout.f25697n = org.telegram.ui.ActionBar.g6.f23318rg;
                    Paint paint = new Paint();
                    frameLayout.h = paint;
                    paint.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126gg, false));
                    frameLayout.f25695e = new org.telegram.ui.Components.e9((org.telegram.ui.ActionBar.c6) null);
                    org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
                    frameLayout.f25692a = t9Var;
                    t9Var.setRoundRadius(AndroidUtilities.dp(24.0f));
                    boolean z10 = LocaleController.isRTL;
                    if (z10) {
                        i12 = 5;
                    } else {
                        i12 = 3;
                    }
                    int i18 = i12 | 48;
                    if (z10) {
                        f9 = 0.0f;
                    } else {
                        f9 = 11.0f;
                    }
                    if (z10) {
                        f10 = 11.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    frameLayout.addView(t9Var, i7.f6.d(46, 46.0f, i18, f9, 6.0f, f10, 0.0f));
                    org.telegram.ui.ActionBar.h5 h5Var = new org.telegram.ui.ActionBar.h5(context);
                    frameLayout.f25693b = h5Var;
                    h5Var.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23251ng, false));
                    h5Var.setTypeface(AndroidUtilities.bold());
                    h5Var.setTextSize(16);
                    if (LocaleController.isRTL) {
                        i13 = 5;
                    } else {
                        i13 = 3;
                    }
                    h5Var.setGravity(i13 | 48);
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
                    frameLayout.addView(h5Var, i7.f6.d(-1, 20.0f, i19, f11, 10.0f, f12, 0.0f));
                    org.telegram.ui.ActionBar.h5 h5Var2 = new org.telegram.ui.ActionBar.h5(context);
                    frameLayout.f25694c = h5Var2;
                    h5Var2.setTextSize(15);
                    if (LocaleController.isRTL) {
                        i15 = 5;
                    } else {
                        i15 = 3;
                    }
                    h5Var2.setGravity(i15 | 48);
                    h5Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, frameLayout.f25697n, false));
                    h5Var2.l(LocaleController.getString(R.string.Invited), false);
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
                    frameLayout.addView(h5Var2, i7.f6.d(-1, 20.0f, i20, f13, 32.0f, f14, 0.0f));
                    ImageView imageView = new ImageView(context);
                    frameLayout.d = imageView;
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.msg_invited);
                    imageView.setImportantForAccessibility(2);
                    imageView.setPadding(0, 0, AndroidUtilities.dp(4.0f), 0);
                    imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, frameLayout.f25697n, false), PorterDuff.Mode.MULTIPLY));
                    if (!LocaleController.isRTL) {
                        i17 = 5;
                    }
                    frameLayout.addView(imageView, i7.f6.d(48, -1.0f, i17 | 16, 6.0f, 0.0f, 6.0f, 0.0f));
                    frameLayout.setWillNotDraw(false);
                    frameLayout.setFocusable(true);
                    h0Var = frameLayout;
                }
            } else {
                h0Var = new i50(this, context);
            }
        } else {
            ?? frameLayout2 = new FrameLayout(context);
            frameLayout2.h = 67;
            frameLayout2.f25726n = 18;
            Paint paint2 = new Paint();
            frameLayout2.f25727r = paint2;
            paint2.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23126gg, false));
            frameLayout2.f25724e = 23;
            org.telegram.ui.ActionBar.h5 h5Var3 = new org.telegram.ui.ActionBar.h5(context);
            frameLayout2.f25721a = h5Var3;
            h5Var3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
            h5Var3.setTextSize(16);
            if (LocaleController.isRTL) {
                i11 = 5;
            } else {
                i11 = 3;
            }
            h5Var3.setGravity(i11);
            h5Var3.setImportantForAccessibility(2);
            frameLayout2.addView(h5Var3);
            org.telegram.ui.ActionBar.h5 h5Var4 = new org.telegram.ui.ActionBar.h5(context);
            frameLayout2.f25722b = h5Var4;
            h5Var4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false));
            h5Var4.setTextSize(16);
            if (!LocaleController.isRTL) {
                i17 = 5;
            }
            h5Var4.setGravity(i17);
            h5Var4.setImportantForAccessibility(2);
            frameLayout2.addView(h5Var4);
            ImageView imageView2 = new ImageView(context);
            frameLayout2.f25723c = imageView2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView2.setScaleType(scaleType);
            imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23223m6, false), PorterDuff.Mode.MULTIPLY));
            frameLayout2.addView(imageView2);
            ImageView imageView3 = new ImageView(context);
            frameLayout2.d = imageView3;
            imageView3.setScaleType(scaleType);
            frameLayout2.addView(imageView3);
            frameLayout2.setFocusable(true);
            h0Var = frameLayout2;
        }
        return th.m(h0Var, h0Var, -1, -2);
    }

    @Override
    public final void y(f2.n1 n1Var) {
        int i10;
        int i11;
        n40 n40Var = this.I.K;
        int i12 = n1Var.f6436f;
        View view = n1Var.f6432a;
        boolean z10 = false;
        if (i12 == 1) {
            org.telegram.ui.Cells.c4 c4Var = (org.telegram.ui.Cells.c4) view;
            if (n40Var.getTag() != null) {
                i11 = org.telegram.ui.ActionBar.g6.f23318rg;
            } else {
                i11 = org.telegram.ui.ActionBar.g6.f23232mg;
            }
            c4Var.f(i11, org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            if (n1Var.b() != this.B - 2) {
                z10 = true;
            }
            c4Var.setDrawDivider(z10);
        } else if (i12 == 2) {
            org.telegram.ui.Cells.t3 t3Var = (org.telegram.ui.Cells.t3) view;
            if (n40Var.getTag() != null) {
                i10 = org.telegram.ui.ActionBar.g6.f23318rg;
            } else {
                i10 = org.telegram.ui.ActionBar.g6.f23232mg;
            }
            t3Var.a(i10, org.telegram.ui.ActionBar.g6.w0(null, i10, false));
            if (n1Var.b() != this.B - 2) {
                z10 = true;
            }
            t3Var.setDrawDivider(z10);
        }
    }
}
