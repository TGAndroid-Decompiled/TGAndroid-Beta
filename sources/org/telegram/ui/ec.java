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
public final class ec implements RequestDelegate {
    public final int f35509a;
    public final ic f35510b;
    public final CountDownLatch f35511c;
    public final Runnable d;

    public ec(ic icVar, CountDownLatch countDownLatch, Runnable runnable, int i10) {
        this.f35509a = i10;
        this.f35510b = icVar;
        this.f35511c = countDownLatch;
        this.d = runnable;
    }

    @Override
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f35509a) {
            case 0:
                final ic icVar = this.f35510b;
                final CountDownLatch countDownLatch = this.f35511c;
                final Runnable runnable = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                ic icVar2 = icVar;
                                ArrayList arrayList = icVar2.h;
                                CountDownLatch countDownLatch2 = countDownLatch;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    icVar2.N = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(icVar2.f37086b).putUsers(tL_premium_boostsList.users, false);
                                    icVar2.K = tL_premium_boostsList.next_offset;
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
                                            icVar2.f37091s = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && icVar2.f37091s > 0) {
                                                z10 = true;
                                            }
                                            icVar2.f37090r = z10;
                                            icVar2.P = tL_premium_boostsList.count;
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
                                ic icVar3 = icVar;
                                ArrayList arrayList2 = icVar3.f37089n;
                                CountDownLatch countDownLatch3 = countDownLatch;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    icVar3.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(icVar3.f37086b).putUsers(tL_premium_boostsList2.users, false);
                                    icVar3.L = tL_premium_boostsList2.next_offset;
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
                                            icVar3.f37092w = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && icVar3.f37092w > 0) {
                                                z11 = true;
                                            }
                                            icVar3.v = z11;
                                            icVar3.O = tL_premium_boostsList2.count;
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
                final ic icVar2 = this.f35510b;
                final CountDownLatch countDownLatch2 = this.f35511c;
                final Runnable runnable2 = this.d;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        switch (r5) {
                            case 0:
                                ic icVar22 = icVar2;
                                ArrayList arrayList = icVar22.h;
                                CountDownLatch countDownLatch22 = countDownLatch2;
                                if (countDownLatch22 != null) {
                                    countDownLatch22.countDown();
                                }
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null) {
                                    icVar22.N = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList = (TL_stories.TL_premium_boostsList) tLObject2;
                                    boolean z10 = false;
                                    MessagesController.getInstance(icVar22.f37086b).putUsers(tL_premium_boostsList.users, false);
                                    icVar22.K = tL_premium_boostsList.next_offset;
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
                                            icVar22.f37091s = Math.max(0, tL_premium_boostsList.count - i10);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList.next_offset) && icVar22.f37091s > 0) {
                                                z10 = true;
                                            }
                                            icVar22.f37090r = z10;
                                            icVar22.P = tL_premium_boostsList.count;
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
                                ic icVar3 = icVar2;
                                ArrayList arrayList2 = icVar3.f37089n;
                                CountDownLatch countDownLatch3 = countDownLatch2;
                                if (countDownLatch3 != null) {
                                    countDownLatch3.countDown();
                                }
                                TLObject tLObject3 = tLObject;
                                if (tLObject3 != null) {
                                    icVar3.M = 20;
                                    TL_stories.TL_premium_boostsList tL_premium_boostsList2 = (TL_stories.TL_premium_boostsList) tLObject3;
                                    boolean z11 = false;
                                    MessagesController.getInstance(icVar3.f37086b).putUsers(tL_premium_boostsList2.users, false);
                                    icVar3.L = tL_premium_boostsList2.next_offset;
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
                                            icVar3.f37092w = Math.max(0, tL_premium_boostsList2.count - i14);
                                            if (!TextUtils.isEmpty(tL_premium_boostsList2.next_offset) && icVar3.f37092w > 0) {
                                                z11 = true;
                                            }
                                            icVar3.v = z11;
                                            icVar3.O = tL_premium_boostsList2.count;
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
