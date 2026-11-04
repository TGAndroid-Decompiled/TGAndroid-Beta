package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class k5 implements RequestDelegate {
    public final int f46768a;
    public final v5 f46769b;
    public final CountDownLatch f46770c;
    public final Runnable d;

    public k5(v5 v5Var, CountDownLatch countDownLatch, Runnable runnable, int i3) {
        this.f46768a = i3;
        this.f46769b = v5Var;
        this.f46770c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f46768a) {
            case 0:
                final v5 v5Var = this.f46769b;
                final CountDownLatch countDownLatch = this.f46770c;
                final Runnable runnable = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                v5 v5Var2 = v5Var;
                                ArrayList arrayList = v5Var2.Y;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    v5Var2.m0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.hp.s1(v5Var2.T).Y3(tL_premium_boostsList.users, false);
                                    v5Var2.f50393l0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i3 = 0;
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
                                            i3 += i11;
                                        } else {
                                            v5Var2.f50384c0 = Math.max(0, tL_premium_boostsList.count - i3);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && v5Var2.f50384c0 > 0) {
                                                z10 = true;
                                            }
                                            v5Var2.f50383b0 = z10;
                                            v5Var2.f50395o0 = tL_premium_boostsList.count;
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
                                v5 v5Var3 = v5Var;
                                ArrayList arrayList2 = v5Var3.X;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    v5Var3.f50394n0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.hp.s1(v5Var3.T).Y3(tL_premium_boostsList2.users, false);
                                    v5Var3.f50392k0 = tL_premium_boostsList2.next_offset;
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
                                            v5Var3.f50382a0 = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && v5Var3.f50382a0 > 0) {
                                                z11 = true;
                                            }
                                            v5Var3.Z = z11;
                                            v5Var3.f50396p0 = tL_premium_boostsList2.count;
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
                final v5 v5Var2 = this.f46769b;
                final CountDownLatch countDownLatch2 = this.f46770c;
                final Runnable runnable2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                v5 v5Var22 = v5Var2;
                                ArrayList arrayList = v5Var22.Y;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    v5Var22.m0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.hp.s1(v5Var22.T).Y3(tL_premium_boostsList.users, false);
                                    v5Var22.f50393l0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i3 = 0;
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
                                            i3 += i11;
                                        } else {
                                            v5Var22.f50384c0 = Math.max(0, tL_premium_boostsList.count - i3);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && v5Var22.f50384c0 > 0) {
                                                z10 = true;
                                            }
                                            v5Var22.f50383b0 = z10;
                                            v5Var22.f50395o0 = tL_premium_boostsList.count;
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
                                v5 v5Var3 = v5Var2;
                                ArrayList arrayList2 = v5Var3.X;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    v5Var3.f50394n0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.hp.s1(v5Var3.T).Y3(tL_premium_boostsList2.users, false);
                                    v5Var3.f50392k0 = tL_premium_boostsList2.next_offset;
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
                                            v5Var3.f50382a0 = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && v5Var3.f50382a0 > 0) {
                                                z11 = true;
                                            }
                                            v5Var3.Z = z11;
                                            v5Var3.f50396p0 = tL_premium_boostsList2.count;
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
