package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class ob implements RequestDelegate {
    public final int f48249a;
    public final rb f48250b;
    public final CountDownLatch f48251c;
    public final Runnable d;

    public ob(rb rbVar, CountDownLatch countDownLatch, Runnable runnable, int i3) {
        this.f48249a = i3;
        this.f48250b = rbVar;
        this.f48251c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f48249a) {
            case 0:
                final rb rbVar = this.f48250b;
                final CountDownLatch countDownLatch = this.f48251c;
                final Runnable runnable = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                rb rbVar2 = rbVar;
                                ArrayList arrayList = rbVar2.h;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    rbVar2.N = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.hp.s1(rbVar2.f49176b).Y3(tL_premium_boostsList.users, false);
                                    rbVar2.K = tL_premium_boostsList.next_offset;
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
                                            rbVar2.f49182s = Math.max(0, tL_premium_boostsList.count - i3);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && rbVar2.f49182s > 0) {
                                                z10 = true;
                                            }
                                            rbVar2.f49181r = z10;
                                            rbVar2.P = tL_premium_boostsList.count;
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
                                rb rbVar3 = rbVar;
                                ArrayList arrayList2 = rbVar3.f49180n;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    rbVar3.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.hp.s1(rbVar3.f49176b).Y3(tL_premium_boostsList2.users, false);
                                    rbVar3.L = tL_premium_boostsList2.next_offset;
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
                                            rbVar3.f49184x = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && rbVar3.f49184x > 0) {
                                                z11 = true;
                                            }
                                            rbVar3.f49183w = z11;
                                            rbVar3.O = tL_premium_boostsList2.count;
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
                final rb rbVar2 = this.f48250b;
                final CountDownLatch countDownLatch2 = this.f48251c;
                final Runnable runnable2 = this.d;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                rb rbVar22 = rbVar2;
                                ArrayList arrayList = rbVar22.h;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    rbVar22.N = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    org.telegram.messenger.hp.s1(rbVar22.f49176b).Y3(tL_premium_boostsList.users, false);
                                    rbVar22.K = tL_premium_boostsList.next_offset;
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
                                            rbVar22.f49182s = Math.max(0, tL_premium_boostsList.count - i3);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && rbVar22.f49182s > 0) {
                                                z10 = true;
                                            }
                                            rbVar22.f49181r = z10;
                                            rbVar22.P = tL_premium_boostsList.count;
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
                                rb rbVar3 = rbVar2;
                                ArrayList arrayList2 = rbVar3.f49180n;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    rbVar3.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    org.telegram.messenger.hp.s1(rbVar3.f49176b).Y3(tL_premium_boostsList2.users, false);
                                    rbVar3.L = tL_premium_boostsList2.next_offset;
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
                                            rbVar3.f49184x = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && rbVar3.f49184x > 0) {
                                                z11 = true;
                                            }
                                            rbVar3.f49183w = z11;
                                            rbVar3.O = tL_premium_boostsList2.count;
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
