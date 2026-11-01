package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class h5 implements RequestDelegate {
    public final int f37701a;
    public final t5 f37702b;
    public final CountDownLatch f37703c;
    public final Runnable d;

    public h5(t5 t5Var, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.f37701a = i10;
        this.f37702b = t5Var;
        this.f37703c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f37701a) {
            case 0:
                final t5 t5Var = this.f37702b;
                final CountDownLatch countDownLatch = this.f37703c;
                final Runnable runnable = this.d;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                t5 t5Var2 = t5Var;
                                ArrayList arrayList = t5Var2.X;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    t5Var2.f41545l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.wp.r1(t5Var2.S).V3(tL_premium_boostsList.users, false);
                                    t5Var2.f41544k0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 < size) {
                                            Object obj = arrayList.get(i11);
                                            i11++;
                                            int i13 = ((TL_stories.Boost) obj).multiplier;
                                            if (i13 > 0) {
                                                i12 = i13;
                                            }
                                            i10 += i12;
                                        } else {
                                            t5Var2.f41535b0 = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && t5Var2.f41535b0 > 0) {
                                                z10 = true;
                                            }
                                            t5Var2.f41534a0 = z10;
                                            t5Var2.f41546n0 = tL_premium_boostsList.count;
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                t5 t5Var3 = t5Var;
                                ArrayList arrayList2 = t5Var3.W;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    t5Var3.m0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.wp.r1(t5Var3.S).V3(tL_premium_boostsList2.users, false);
                                    t5Var3.f41543j0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 < size2) {
                                            Object obj2 = arrayList2.get(i15);
                                            i15++;
                                            int i17 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i17 > 0) {
                                                i16 = i17;
                                            }
                                            i14 += i16;
                                        } else {
                                            t5Var3.Z = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && t5Var3.Z > 0) {
                                                z11 = true;
                                            }
                                            t5Var3.Y = z11;
                                            t5Var3.f41547o0 = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
            default:
                final t5 t5Var2 = this.f37702b;
                final CountDownLatch countDownLatch2 = this.f37703c;
                final Runnable runnable2 = this.d;
                org.telegram.messenger.i0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                t5 t5Var22 = t5Var2;
                                ArrayList arrayList = t5Var22.X;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    t5Var22.f41545l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.wp.r1(t5Var22.S).V3(tL_premium_boostsList.users, false);
                                    t5Var22.f41544k0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i10 = 0;
                                    int i11 = 0;
                                    while (true) {
                                        int i12 = 1;
                                        if (i11 < size) {
                                            Object obj = arrayList.get(i11);
                                            i11++;
                                            int i13 = ((TL_stories.Boost) obj).multiplier;
                                            if (i13 > 0) {
                                                i12 = i13;
                                            }
                                            i10 += i12;
                                        } else {
                                            t5Var22.f41535b0 = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && t5Var22.f41535b0 > 0) {
                                                z10 = true;
                                            }
                                            t5Var22.f41534a0 = z10;
                                            t5Var22.f41546n0 = tL_premium_boostsList.count;
                                            Runnable runnable22 = runnable2;
                                            if (runnable22 != null) {
                                                runnable22.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                            default:
                                t5 t5Var3 = t5Var2;
                                ArrayList arrayList2 = t5Var3.W;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    t5Var3.m0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.wp.r1(t5Var3.S).V3(tL_premium_boostsList2.users, false);
                                    t5Var3.f41543j0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i14 = 0;
                                    int i15 = 0;
                                    while (true) {
                                        int i16 = 1;
                                        if (i15 < size2) {
                                            Object obj2 = arrayList2.get(i15);
                                            i15++;
                                            int i17 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i17 > 0) {
                                                i16 = i17;
                                            }
                                            i14 += i16;
                                        } else {
                                            t5Var3.Z = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && t5Var3.Z > 0) {
                                                z11 = true;
                                            }
                                            t5Var3.Y = z11;
                                            t5Var3.f41547o0 = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                                return;
                                            }
                                            return;
                                        }
                                    }
                                } else {
                                    return;
                                }
                                break;
                        }
                    }
                });
                return;
        }
    }
}
