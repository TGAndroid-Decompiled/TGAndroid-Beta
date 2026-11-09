package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class i5 implements RequestDelegate {
    public final int f46466a;
    public final t5 f46467b;
    public final CountDownLatch f46468c;
    public final Runnable d;

    public i5(t5 t5Var, CountDownLatch countDownLatch, Runnable runnable, int i7) {
        this.f46466a = i7;
        this.f46467b = t5Var;
        this.f46468c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46466a) {
            case 0:
                final t5 t5Var = this.f46467b;
                final CountDownLatch countDownLatch = this.f46468c;
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
                                    t5Var2.f50086l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z9 = false;
                                    org.telegram.messenger.qp.s1(t5Var2.S).Y3(tL_premium_boostsList.users, false);
                                    t5Var2.f50085k0 = tL_premium_boostsList.next_offset;
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
                                            t5Var2.f50076b0 = Math.max(0, tL_premium_boostsList.count - i7);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && t5Var2.f50076b0 > 0) {
                                                z9 = true;
                                            }
                                            t5Var2.f50075a0 = z9;
                                            t5Var2.f50087n0 = tL_premium_boostsList.count;
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
                                    t5Var3.f50084j0 = tL_premium_boostsList2.next_offset;
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
                                            t5Var3.f50088o0 = tL_premium_boostsList2.count;
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
                final t5 t5Var2 = this.f46467b;
                final CountDownLatch countDownLatch2 = this.f46468c;
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
                                    t5Var22.f50086l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z9 = false;
                                    org.telegram.messenger.qp.s1(t5Var22.S).Y3(tL_premium_boostsList.users, false);
                                    t5Var22.f50085k0 = tL_premium_boostsList.next_offset;
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
                                            t5Var22.f50076b0 = Math.max(0, tL_premium_boostsList.count - i7);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && t5Var22.f50076b0 > 0) {
                                                z9 = true;
                                            }
                                            t5Var22.f50075a0 = z9;
                                            t5Var22.f50087n0 = tL_premium_boostsList.count;
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
                                    t5Var3.f50084j0 = tL_premium_boostsList2.next_offset;
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
                                            t5Var3.f50088o0 = tL_premium_boostsList2.count;
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
