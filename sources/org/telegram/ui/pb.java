package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class pb implements RequestDelegate {
    public final int f50826a;
    public final sb f50827b;
    public final CountDownLatch f50828c;
    public final Runnable d;

    public pb(sb sbVar, CountDownLatch countDownLatch, Runnable runnable, int i7) {
        this.f50826a = i7;
        this.f50827b = sbVar;
        this.f50828c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f50826a) {
            case 0:
                final sb sbVar = this.f50827b;
                final CountDownLatch countDownLatch = this.f50828c;
                final Runnable runnable = this.d;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                sb sbVar2 = sbVar;
                                ArrayList arrayList = sbVar2.h;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    sbVar2.N = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.mp.u1(sbVar2.f51989b).f4(tL_premium_boostsList.users, false);
                                    sbVar2.K = tL_premium_boostsList.next_offset;
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
                                            sbVar2.f51995s = Math.max(0, tL_premium_boostsList.count - i7);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && sbVar2.f51995s > 0) {
                                                z10 = true;
                                            }
                                            sbVar2.f51994r = z10;
                                            sbVar2.P = tL_premium_boostsList.count;
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
                                sb sbVar3 = sbVar;
                                ArrayList arrayList2 = sbVar3.f51993n;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    sbVar3.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.mp.u1(sbVar3.f51989b).f4(tL_premium_boostsList2.users, false);
                                    sbVar3.L = tL_premium_boostsList2.next_offset;
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
                                            sbVar3.f51997x = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && sbVar3.f51997x > 0) {
                                                z11 = true;
                                            }
                                            sbVar3.f51996w = z11;
                                            sbVar3.O = tL_premium_boostsList2.count;
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
                final sb sbVar2 = this.f50827b;
                final CountDownLatch countDownLatch2 = this.f50828c;
                final Runnable runnable2 = this.d;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                sb sbVar22 = sbVar2;
                                ArrayList arrayList = sbVar22.h;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    sbVar22.N = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.mp.u1(sbVar22.f51989b).f4(tL_premium_boostsList.users, false);
                                    sbVar22.K = tL_premium_boostsList.next_offset;
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
                                            sbVar22.f51995s = Math.max(0, tL_premium_boostsList.count - i7);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && sbVar22.f51995s > 0) {
                                                z10 = true;
                                            }
                                            sbVar22.f51994r = z10;
                                            sbVar22.P = tL_premium_boostsList.count;
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
                                sb sbVar3 = sbVar2;
                                ArrayList arrayList2 = sbVar3.f51993n;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    sbVar3.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.mp.u1(sbVar3.f51989b).f4(tL_premium_boostsList2.users, false);
                                    sbVar3.L = tL_premium_boostsList2.next_offset;
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
                                            sbVar3.f51997x = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && sbVar3.f51997x > 0) {
                                                z11 = true;
                                            }
                                            sbVar3.f51996w = z11;
                                            sbVar3.O = tL_premium_boostsList2.count;
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
