package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import c8.ja;
import c8.na;
import di.tb;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import org.telegram.messenger.a8;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.ou;
import org.telegram.messenger.q10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cv0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.jn;
import org.telegram.ui.Components.k20;
import org.telegram.ui.Components.t70;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.br;
import org.telegram.ui.up;
public final class l5 implements Runnable {
    public final int f29366a;
    public final Object f29367b;
    public final Object f29368c;
    public final Object d;
    public final Object f29369e;

    public l5(Object obj, Object obj2, Object obj3, Object obj4, int i7) {
        this.f29366a = i7;
        this.f29367b = obj;
        this.f29368c = obj2;
        this.d = obj3;
        this.f29369e = obj4;
    }

    private final void a() {
        int x02;
        int x03;
        int x04;
        int x05;
        ih ihVar;
        int i7;
        jn jnVar = (jn) this.f29367b;
        Context context = (Context) this.f29368c;
        e6 e6Var = (e6) this.f29369e;
        long j3 = jnVar.W;
        final org.telegram.ui.Components.f1 f1Var = new org.telegram.ui.Components.f1(14, jnVar, (View) this.d);
        ih ihVar2 = new ih(1);
        int i10 = j6.f28957j5;
        if (e6Var != null) {
            x02 = e6Var.f(i10);
        } else {
            x02 = j6.x0(null, i10, false);
        }
        int i11 = j6.f28922h5;
        if (e6Var != null) {
            x03 = e6Var.f(i11);
        } else {
            x03 = j6.x0(null, i11, false);
        }
        int i12 = j6.Aj;
        if (e6Var != null) {
            e6Var.f(i12);
        } else {
            j6.x0(null, i12, false);
        }
        int i13 = j6.Ej;
        if (e6Var != null) {
            e6Var.f(i13);
        } else {
            j6.x0(null, i13, false);
        }
        int i14 = j6.E8;
        if (e6Var != null) {
            e6Var.f(i14);
        } else {
            j6.x0(null, i14, false);
        }
        int i15 = j6.G8;
        if (e6Var != null) {
            e6Var.f(i15);
        } else {
            j6.x0(null, i15, false);
        }
        int i16 = j6.f28941i6;
        if (e6Var != null) {
            e6Var.f(i16);
        } else {
            j6.x0(null, i16, false);
        }
        int i17 = j6.Ji;
        if (e6Var != null) {
            x04 = e6Var.f(i17);
        } else {
            x04 = j6.x0(null, i17, false);
        }
        int i18 = j6.Fi;
        if (e6Var != null) {
            x05 = e6Var.f(i18);
        } else {
            x05 = j6.x0(null, i18, false);
        }
        int i19 = j6.Hi;
        if (e6Var != null) {
            e6Var.f(i19);
        } else {
            j6.x0(null, i19, false);
        }
        Pattern pattern = org.telegram.ui.Components.t4.f39505a;
        if (context == null) {
            return;
        }
        int i20 = x02;
        final int z02 = (int) np.s1(m10.f24940t0).f25451y7.E.z0(TimeUnit.SECONDS);
        final ou ouVar = new ou(context, e6Var);
        ((u2) ouVar.f25806b).f29720w0 = false;
        int i21 = x03;
        final ib0 ib0Var = new ib0(context, e6Var);
        ib0Var.setTextColor(i20);
        ib0Var.setTextOffset(org.telegram.messenger.g0.L(10.0f));
        ib0Var.setItemCount(5);
        int i22 = x04;
        final ?? ib0Var2 = new ib0(context, e6Var);
        ib0Var2.setWrapSelectorWheel(true);
        ib0Var2.setAllItemsCount(24);
        ib0Var2.setItemCount(5);
        ib0Var2.setTextColor(i20);
        ib0Var2.setTextOffset(-org.telegram.messenger.g0.L(10.0f));
        int i23 = x05;
        final ?? ib0Var3 = new ib0(context, e6Var);
        ib0Var3.setWrapSelectorWheel(true);
        ib0Var3.setAllItemsCount(60);
        ib0Var3.setItemCount(5);
        ib0Var3.setTextColor(i20);
        ib0Var3.setTextOffset(-org.telegram.messenger.g0.L(34.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        org.telegram.ui.Components.n3 n3Var = new org.telegram.ui.Components.n3(context, ib0Var, ib0Var2, ib0Var3, 3);
        n3Var.setOrientation(1);
        frameLayout.addView(n3Var, ja.c(-1.0f, -1));
        frameLayout.addView(new FrameLayout(context), ja.d(-1, 100.0f, 87, 0.0f, 0.0f, 0.0f, 120.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        n3Var.addView(frameLayout2, ja.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(hd.M0(2131744827, null));
        textView.setTextColor(i20);
        i5.c.v(textView, 1, 20.0f);
        frameLayout2.addView(textView, ja.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new gi.a(10));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        n3Var.addView(linearLayout, ja.q(-1, -2, 1.0f, 0, 0, 23, 0, 23));
        final TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 12.0f);
        q6.U(textView2, j6.f29088q5, e6Var);
        textView2.setGravity(17);
        final Calendar calendar = Calendar.getInstance();
        tb tbVar = new tb(context, 16);
        tbVar.setText(hd.M0(2131744828, null));
        na.b(tbVar, 0.02f, 1.2f);
        linearLayout.addView(ib0Var, ja.l(0.5f, 0, 270));
        ib0Var.setMinValue(0);
        ib0Var.setMaxValue(365);
        ib0Var.setWrapSelectorWheel(false);
        ib0Var.setFormatter(new br(27));
        bi.b3 b3Var = new bi.b3(z02, ib0Var, (org.telegram.ui.Components.x3) ib0Var2, (org.telegram.ui.Components.y3) ib0Var3, textView2);
        ib0Var.setOnValueChangedListener(b3Var);
        ib0Var2.setMinValue(0);
        ib0Var2.setMaxValue(23);
        linearLayout.addView((View) ib0Var2, ja.l(0.2f, 0, 270));
        ib0Var2.setFormatter(new br(28));
        ib0Var2.setOnValueChangedListener(b3Var);
        ib0Var3.setMinValue(0);
        ib0Var3.setMaxValue(59);
        ib0Var3.setValue(0);
        ib0Var3.setFormatter(new br(29));
        linearLayout.addView((View) ib0Var3, ja.l(0.3f, 0, 270));
        ib0Var3.setOnValueChangedListener(b3Var);
        if (j3 > 0 && j3 != 2147483646) {
            long j10 = 1000 * j3;
            ihVar = ihVar2;
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            i7 = i22;
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            if (timeInMillis >= 0) {
                ib0Var3.setValue(calendar.get(12));
                ib0Var2.setValue(calendar.get(11));
                ib0Var.setValue(timeInMillis);
            }
        } else {
            ihVar = ihVar2;
            i7 = i22;
        }
        final boolean[] zArr = {true};
        org.telegram.ui.Components.t4.g(null, null, 0L, z02, 3, ib0Var, ib0Var2, ib0Var3);
        org.telegram.ui.Components.t4.e(textView2, ib0Var, ib0Var2, ib0Var3);
        tbVar.setPadding(org.telegram.messenger.g0.L(34.0f), 0, org.telegram.messenger.g0.L(34.0f), 0);
        tbVar.setGravity(17);
        tbVar.setTextColor(i7);
        tbVar.setTextSize(1, 14.0f);
        tbVar.setTypeface(org.telegram.messenger.g0.o());
        tbVar.setBackground(y5.e(i23, 24.0f));
        n3Var.addView(tbVar, ja.t(-1, 48, 83, 14, 15, 14, 16));
        tbVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                zArr[0] = false;
                ib0 ib0Var4 = ib0Var;
                x3 x3Var = ib0Var2;
                y3 y3Var = ib0Var3;
                boolean g10 = t4.g(null, null, 0L, z02, 3, ib0Var4, x3Var, y3Var);
                t4.e(textView2, ib0Var4, x3Var, y3Var);
                long currentTimeMillis = System.currentTimeMillis();
                Calendar calendar2 = calendar;
                calendar2.setTimeInMillis(currentTimeMillis);
                calendar2.add(6, ib0Var4.getValue());
                calendar2.set(11, x3Var.getValue());
                calendar2.set(12, y3Var.getValue());
                if (g10) {
                    calendar2.set(13, 0);
                    calendar2.set(14, 0);
                }
                f1Var.L((int) (calendar2.getTimeInMillis() / 1000), 0, true);
                ((org.telegram.ui.ActionBar.u2) ouVar.f25806b).f29724y0.run();
            }
        });
        n3Var.addView(textView2, ja.t(-1, -2, 83, 14, 0, 14, 16));
        u2 u2Var = (u2) ouVar.f25806b;
        u2Var.O = frameLayout;
        u2Var.show();
        u2Var.setOnDismissListener(new org.telegram.ui.Components.c2(0, ihVar, zArr));
        u2Var.v0(i21);
        u2Var.P(i21);
    }

    private final void b() {
        int i7;
        a0.h hVar;
        ArrayList arrayList;
        a0.h hVar2;
        boolean z10;
        k20 k20Var = (k20) this.f29368c;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.d;
        TLObject tLObject = (TLObject) this.f29367b;
        TLRPC.TL_channels_getParticipants tL_channels_getParticipants = (TLRPC.TL_channels_getParticipants) this.f29369e;
        cv0 cv0Var = k20Var.f34197u1;
        a0.h hVar3 = k20Var.V1;
        a0.h hVar4 = k20Var.W1;
        ArrayList arrayList2 = k20Var.S1;
        if (tL_error == null) {
            TLRPC.TL_channels_channelParticipants tL_channels_channelParticipants = (TLRPC.TL_channels_channelParticipants) tLObject;
            np.s1(k20Var.f29679a).Y3(tL_channels_channelParticipants.users, false);
            np.s1(k20Var.f29679a).S3(tL_channels_channelParticipants.chats, false);
            long e10 = m10.i(k20Var.f29679a).e();
            int i10 = 0;
            while (true) {
                if (i10 >= tL_channels_channelParticipants.participants.size()) {
                    break;
                } else if (gj.B1(tL_channels_channelParticipants.participants.get(i10).peer) == e10) {
                    tL_channels_channelParticipants.participants.remove(i10);
                    break;
                } else {
                    i10++;
                }
            }
            k20Var.P1--;
            if (tL_channels_getParticipants.filter instanceof TLRPC.TL_channelParticipantsContacts) {
                arrayList = k20Var.T1;
                hVar = hVar4;
            } else {
                hVar = hVar3;
                arrayList = arrayList2;
            }
            arrayList.clear();
            arrayList.addAll(tL_channels_channelParticipants.participants);
            int size = tL_channels_channelParticipants.participants.size();
            for (int i11 = 0; i11 < size; i11++) {
                TLRPC.ChannelParticipant channelParticipant = tL_channels_channelParticipants.participants.get(i11);
                hVar.k(channelParticipant, gj.B1(channelParticipant.peer));
            }
            int size2 = arrayList2.size();
            int i12 = 0;
            while (i12 < size2) {
                long B1 = gj.B1(((TLRPC.ChannelParticipant) arrayList2.get(i12)).peer);
                if (hVar4.f(B1) != null || ((hVar2 = k20Var.Z1) != null && hVar2.h(B1) >= 0)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.User a22 = np.s1(k20Var.f29679a).a2(Long.valueOf(B1));
                if ((a22 != null && a22.bot) || q10.x(a22)) {
                    z10 = true;
                }
                if (z10) {
                    arrayList2.remove(i12);
                    hVar3.l(B1);
                    i12--;
                    size2--;
                }
                i12++;
            }
            try {
                if (k20Var.R1.participants_count <= 200) {
                    Collections.sort(arrayList, new up(k20Var, ConnectionsManager.getInstance(k20Var.f29679a).getCurrentTime(), 1));
                }
            } catch (Exception e11) {
                a8.g(e11, true);
            }
        }
        if (k20Var.P1 <= 0) {
            k20Var.X1 = false;
            k20Var.Y1 = true;
            if (k20Var.f36252l2 == 1) {
                i7 = 1;
            } else {
                tj0 tj0Var = k20Var.f34193q1;
                if (tj0Var != null) {
                    i7 = tj0Var.b() - 1;
                } else {
                    i7 = 0;
                }
            }
            k20Var.O0(i7);
            if (arrayList2.isEmpty()) {
                k20Var.f36244c2 = true;
                k20Var.R0();
            }
        }
        k20Var.T0();
        tj0 tj0Var2 = k20Var.f34193q1;
        if (tj0Var2 != null) {
            tj0Var2.f();
            if (cv0Var != null && k20Var.f34193q1.b() == 0 && k20Var.Y1) {
                cv0Var.e(false, true);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.l5.run():void");
    }

    public l5(Object obj, Object obj2, TLObject tLObject, Object obj3, int i7) {
        this.f29366a = i7;
        this.f29368c = obj;
        this.d = obj2;
        this.f29367b = tLObject;
        this.f29369e = obj3;
    }

    public l5(e2 e2Var, TLObject tLObject, TLObject tLObject2, Object obj, int i7) {
        this.f29366a = i7;
        this.f29368c = e2Var;
        this.f29367b = tLObject;
        this.d = tLObject2;
        this.f29369e = obj;
    }

    public l5(t70 t70Var, TLRPC.TL_chatInviteExported tL_chatInviteExported, TLRPC.TL_error tL_error, TLObject tLObject) {
        this.f29366a = 29;
        this.f29368c = t70Var;
        this.d = tL_chatInviteExported;
        this.f29369e = tL_error;
        this.f29367b = tLObject;
    }
}
