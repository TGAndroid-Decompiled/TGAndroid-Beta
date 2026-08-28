package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public final class j5 implements RequestDelegate {
    public final int f39371a;
    public final u5 f39372b;
    public final CountDownLatch f39373c;
    public final Runnable d;

    public j5(u5 u5Var, CountDownLatch countDownLatch, Runnable runnable, int i9) {
        this.f39371a = i9;
        this.f39372b = u5Var;
        this.f39373c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39371a) {
            case 0:
                final u5 u5Var = this.f39372b;
                final CountDownLatch countDownLatch = this.f39373c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                u5 u5Var2 = u5Var;
                                ArrayList arrayList = u5Var2.R;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    u5Var2.f43133f0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(u5Var2.M).putUsers(tL_premium_boostsList.users, false);
                                    u5Var2.f43132e0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i9 = 0;
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
                                            i9 += i11;
                                        } else {
                                            u5Var2.V = Math.max(0, tL_premium_boostsList.count - i9);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && u5Var2.V > 0) {
                                                z10 = true;
                                            }
                                            u5Var2.U = z10;
                                            u5Var2.f43135h0 = tL_premium_boostsList.count;
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
                                u5 u5Var3 = u5Var;
                                ArrayList arrayList2 = u5Var3.Q;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    u5Var3.f43134g0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(u5Var3.M).putUsers(tL_premium_boostsList2.users, false);
                                    u5Var3.f43131d0 = tL_premium_boostsList2.next_offset;
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
                                            u5Var3.T = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && u5Var3.T > 0) {
                                                z11 = true;
                                            }
                                            u5Var3.S = z11;
                                            u5Var3.f43136i0 = tL_premium_boostsList2.count;
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
                final u5 u5Var2 = this.f39372b;
                final CountDownLatch countDownLatch2 = this.f39373c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                u5 u5Var22 = u5Var2;
                                ArrayList arrayList = u5Var22.R;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    u5Var22.f43133f0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(u5Var22.M).putUsers(tL_premium_boostsList.users, false);
                                    u5Var22.f43132e0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i9 = 0;
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
                                            i9 += i11;
                                        } else {
                                            u5Var22.V = Math.max(0, tL_premium_boostsList.count - i9);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && u5Var22.V > 0) {
                                                z10 = true;
                                            }
                                            u5Var22.U = z10;
                                            u5Var22.f43135h0 = tL_premium_boostsList.count;
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
                                u5 u5Var3 = u5Var2;
                                ArrayList arrayList2 = u5Var3.Q;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    u5Var3.f43134g0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(u5Var3.M).putUsers(tL_premium_boostsList2.users, false);
                                    u5Var3.f43131d0 = tL_premium_boostsList2.next_offset;
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
                                            u5Var3.T = Math.max(0, tL_premium_boostsList2.count - i13);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && u5Var3.T > 0) {
                                                z11 = true;
                                            }
                                            u5Var3.S = z11;
                                            u5Var3.f43136i0 = tL_premium_boostsList2.count;
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
