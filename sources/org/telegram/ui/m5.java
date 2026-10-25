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
public final class m5 implements RequestDelegate {
    public final int f41461a;
    public final x5 f41462b;
    public final CountDownLatch f41463c;
    public final Runnable d;

    public m5(x5 x5Var, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.f41461a = i10;
        this.f41462b = x5Var;
        this.f41463c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f41461a) {
            case 0:
                final x5 x5Var = this.f41462b;
                final CountDownLatch countDownLatch = this.f41463c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                x5 x5Var2 = x5Var;
                                ArrayList arrayList = x5Var2.X;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    x5Var2.f45651l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(x5Var2.S).putUsers(tL_premium_boostsList.users, false);
                                    x5Var2.f45650k0 = tL_premium_boostsList.next_offset;
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
                                            x5Var2.f45641b0 = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && x5Var2.f45641b0 > 0) {
                                                z10 = true;
                                            }
                                            x5Var2.f45640a0 = z10;
                                            x5Var2.f45652n0 = tL_premium_boostsList.count;
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
                                x5 x5Var3 = x5Var;
                                ArrayList arrayList2 = x5Var3.W;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    x5Var3.m0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(x5Var3.S).putUsers(tL_premium_boostsList2.users, false);
                                    x5Var3.f45649j0 = tL_premium_boostsList2.next_offset;
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
                                            x5Var3.Z = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && x5Var3.Z > 0) {
                                                z11 = true;
                                            }
                                            x5Var3.Y = z11;
                                            x5Var3.f45653o0 = tL_premium_boostsList2.count;
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
                final x5 x5Var2 = this.f41462b;
                final CountDownLatch countDownLatch2 = this.f41463c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                x5 x5Var22 = x5Var2;
                                ArrayList arrayList = x5Var22.X;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    x5Var22.f45651l0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(x5Var22.S).putUsers(tL_premium_boostsList.users, false);
                                    x5Var22.f45650k0 = tL_premium_boostsList.next_offset;
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
                                            x5Var22.f45641b0 = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && x5Var22.f45641b0 > 0) {
                                                z10 = true;
                                            }
                                            x5Var22.f45640a0 = z10;
                                            x5Var22.f45652n0 = tL_premium_boostsList.count;
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
                                x5 x5Var3 = x5Var2;
                                ArrayList arrayList2 = x5Var3.W;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    x5Var3.m0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(x5Var3.S).putUsers(tL_premium_boostsList2.users, false);
                                    x5Var3.f45649j0 = tL_premium_boostsList2.next_offset;
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
                                            x5Var3.Z = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && x5Var3.Z > 0) {
                                                z11 = true;
                                            }
                                            x5Var3.Y = z11;
                                            x5Var3.f45653o0 = tL_premium_boostsList2.count;
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
