package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class i5 implements RequestDelegate {
    public final int f46572a;
    public final t5 f46573b;
    public final CountDownLatch f46574c;
    public final Runnable d;

    public i5(t5 t5Var, CountDownLatch countDownLatch, Runnable runnable, int i7) {
        this.f46572a = i7;
        this.f46573b = t5Var;
        this.f46574c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46572a) {
            case 0:
                final t5 t5Var = this.f46573b;
                final CountDownLatch countDownLatch = this.f46574c;
                final Runnable runnable = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
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
                                    t5Var2.f49936l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z9 = false;
                                    org.telegram.messenger.qp.s1(t5Var2.S).Y3(tL_premium_boostsList.users, false);
                                    t5Var2.f49935k0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = 1;
                                        if (i10 < size) {
                                            Object obj = arrayList.get(i10);
                                            i10++;
                                            int i12 = ((TL_stories.Boost) obj).multiplier;
                                            if (i12 > 0) {
                                                i11 = i12;
                                            }
                                            i7 += i11;
                                        } else {
                                            t5Var2.f49926b0 = Math.max(0, tL_premium_boostsList.count - i7);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && t5Var2.f49926b0 > 0) {
                                                z9 = true;
                                            }
                                            t5Var2.f49925a0 = z9;
                                            t5Var2.f49937n0 = tL_premium_boostsList.count;
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
                                    boolean z10 = false;
                                    org.telegram.messenger.qp.s1(t5Var3.S).Y3(tL_premium_boostsList2.users, false);
                                    t5Var3.f49934j0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i13 = 0;
                                    int i14 = 0;
                                    while (true) {
                                        int i15 = 1;
                                        if (i14 < size2) {
                                            Object obj2 = arrayList2.get(i14);
                                            i14++;
                                            int i16 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i16 > 0) {
                                                i15 = i16;
                                            }
                                            i13 += i15;
                                        } else {
                                            t5Var3.Z = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && t5Var3.Z > 0) {
                                                z10 = true;
                                            }
                                            t5Var3.Y = z10;
                                            t5Var3.f49938o0 = tL_premium_boostsList2.count;
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
                final t5 t5Var2 = this.f46573b;
                final CountDownLatch countDownLatch2 = this.f46574c;
                final Runnable runnable2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
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
                                    t5Var22.f49936l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z9 = false;
                                    org.telegram.messenger.qp.s1(t5Var22.S).Y3(tL_premium_boostsList.users, false);
                                    t5Var22.f49935k0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i7 = 0;
                                    int i10 = 0;
                                    while (true) {
                                        int i11 = 1;
                                        if (i10 < size) {
                                            Object obj = arrayList.get(i10);
                                            i10++;
                                            int i12 = ((TL_stories.Boost) obj).multiplier;
                                            if (i12 > 0) {
                                                i11 = i12;
                                            }
                                            i7 += i11;
                                        } else {
                                            t5Var22.f49926b0 = Math.max(0, tL_premium_boostsList.count - i7);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && t5Var22.f49926b0 > 0) {
                                                z9 = true;
                                            }
                                            t5Var22.f49925a0 = z9;
                                            t5Var22.f49937n0 = tL_premium_boostsList.count;
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
                                    boolean z10 = false;
                                    org.telegram.messenger.qp.s1(t5Var3.S).Y3(tL_premium_boostsList2.users, false);
                                    t5Var3.f49934j0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i13 = 0;
                                    int i14 = 0;
                                    while (true) {
                                        int i15 = 1;
                                        if (i14 < size2) {
                                            Object obj2 = arrayList2.get(i14);
                                            i14++;
                                            int i16 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i16 > 0) {
                                                i15 = i16;
                                            }
                                            i13 += i15;
                                        } else {
                                            t5Var3.Z = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && t5Var3.Z > 0) {
                                                z10 = true;
                                            }
                                            t5Var3.Y = z10;
                                            t5Var3.f49938o0 = tL_premium_boostsList2.count;
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
