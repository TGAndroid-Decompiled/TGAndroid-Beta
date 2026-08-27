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

public final class k5 implements RequestDelegate {

    public final int f39602a;

    public final v5 f39603b;

    public final CountDownLatch f39604c;
    public final Runnable d;

    public k5(v5 v5Var, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.f39602a = i10;
        this.f39603b = v5Var;
        this.f39604c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f39602a) {
            case 0:
                final int i10 = 1;
                final v5 v5Var = this.f39603b;
                final CountDownLatch countDownLatch = this.f39604c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i10) {
                            case 0:
                                v5 v5Var2 = v5Var;
                                ArrayList arrayList = v5Var2.R;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    v5Var2.f43360f0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(v5Var2.M).putUsers(tL_premium_boostsList.users, false);
                                    v5Var2.f43359e0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i11 = 0;
                                    int i12 = 0;
                                    while (true) {
                                        int i13 = 1;
                                        if (i12 >= size) {
                                            v5Var2.V = Math.max(0, tL_premium_boostsList.count - i11);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && v5Var2.V > 0) {
                                                z10 = true;
                                            }
                                            v5Var2.U = z10;
                                            v5Var2.f43362h0 = tL_premium_boostsList.count;
                                            Runnable runnable2 = runnable;
                                            if (runnable2 != null) {
                                                runnable2.run();
                                            }
                                        } else {
                                            Object obj = arrayList.get(i12);
                                            i12++;
                                            int i14 = ((TL_stories.Boost) obj).multiplier;
                                            if (i14 > 0) {
                                                i13 = i14;
                                            }
                                            i11 += i13;
                                        }
                                    }
                                }
                                break;
                            default:
                                v5 v5Var3 = v5Var;
                                ArrayList arrayList2 = v5Var3.Q;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    v5Var3.f43361g0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(v5Var3.M).putUsers(tL_premium_boostsList2.users, false);
                                    v5Var3.f43358d0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i15 = 0;
                                    int i16 = 0;
                                    while (true) {
                                        int i17 = 1;
                                        if (i16 >= size2) {
                                            v5Var3.T = Math.max(0, tL_premium_boostsList2.count - i15);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && v5Var3.T > 0) {
                                                z11 = true;
                                            }
                                            v5Var3.S = z11;
                                            v5Var3.f43363i0 = tL_premium_boostsList2.count;
                                            Runnable runnable3 = runnable;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                            }
                                        } else {
                                            Object obj2 = arrayList2.get(i16);
                                            i16++;
                                            int i18 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i18 > 0) {
                                                i17 = i18;
                                            }
                                            i15 += i17;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final v5 v5Var2 = this.f39603b;
                final CountDownLatch countDownLatch2 = this.f39604c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (i11) {
                            case 0:
                                v5 v5Var3 = v5Var2;
                                ArrayList arrayList = v5Var3.R;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    v5Var3.f43360f0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(v5Var3.M).putUsers(tL_premium_boostsList.users, false);
                                    v5Var3.f43359e0 = tL_premium_boostsList.next_offset;
                                    arrayList.addAll(tL_premium_boostsList.boosts);
                                    int size = arrayList.size();
                                    int i12 = 0;
                                    int i13 = 0;
                                    while (true) {
                                        int i14 = 1;
                                        if (i13 >= size) {
                                            v5Var3.V = Math.max(0, tL_premium_boostsList.count - i12);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && v5Var3.V > 0) {
                                                z10 = true;
                                            }
                                            v5Var3.U = z10;
                                            v5Var3.f43362h0 = tL_premium_boostsList.count;
                                            Runnable runnable3 = runnable2;
                                            if (runnable3 != null) {
                                                runnable3.run();
                                            }
                                        } else {
                                            Object obj = arrayList.get(i13);
                                            i13++;
                                            int i15 = ((TL_stories.Boost) obj).multiplier;
                                            if (i15 > 0) {
                                                i14 = i15;
                                            }
                                            i12 += i14;
                                        }
                                    }
                                }
                                break;
                            default:
                                v5 v5Var4 = v5Var2;
                                ArrayList arrayList2 = v5Var4.Q;
                                CountDownLatch countDownLatch4 = countDownLatch2;
                                if (countDownLatch4 != null) {
                                    countDownLatch4.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    v5Var4.f43361g0 = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(v5Var4.M).putUsers(tL_premium_boostsList2.users, false);
                                    v5Var4.f43358d0 = tL_premium_boostsList2.next_offset;
                                    arrayList2.addAll(tL_premium_boostsList2.boosts);
                                    int size2 = arrayList2.size();
                                    int i16 = 0;
                                    int i17 = 0;
                                    while (true) {
                                        int i18 = 1;
                                        if (i17 >= size2) {
                                            v5Var4.T = Math.max(0, tL_premium_boostsList2.count - i16);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && v5Var4.T > 0) {
                                                z11 = true;
                                            }
                                            v5Var4.S = z11;
                                            v5Var4.f43363i0 = tL_premium_boostsList2.count;
                                            Runnable runnable4 = runnable2;
                                            if (runnable4 != null) {
                                                runnable4.run();
                                            }
                                        } else {
                                            Object obj2 = arrayList2.get(i17);
                                            i17++;
                                            int i19 = ((TL_stories.Boost) obj2).multiplier;
                                            if (i19 > 0) {
                                                i18 = i19;
                                            }
                                            i16 += i18;
                                        }
                                    }
                                }
                                break;
                        }
                    }
                });
                break;
        }
    }
}
