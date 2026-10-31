package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
public final class e1 implements Runnable {
    public final int f21840a;
    public final int f21841b;
    public final long f21842c;
    public final Object d;
    public final Object e;
    public final Object f21843f;

    public e1(Context context, int i10, org.telegram.messenger.t9 t9Var, long j10, Runnable runnable) {
        this.f21840a = 1;
        this.d = context;
        this.f21841b = i10;
        this.e = t9Var;
        this.f21842c = j10;
        this.f21843f = runnable;
    }

    @Override
    public final void run() {
        boolean z10;
        boolean z11;
        int i10 = this.f21840a;
        long j10 = this.f21842c;
        String str = null;
        r3 = null;
        TL_stories.StoryItem storyItem = null;
        int i11 = 0;
        int i12 = this.f21841b;
        Object obj = this.f21843f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i10) {
            case 0:
                q1 q1Var = (q1) obj3;
                TLRPC.User user = (TLRPC.User) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                if (user != null) {
                    q1Var.f22606j7[i12].r(user);
                    q1Var.f22594i7[i12].i0(user, q1Var.f22606j7[i12], null);
                    return;
                } else if (chat != null) {
                    q1Var.f22606j7[i12].q(chat);
                    q1Var.f22594i7[i12].i0(chat, q1Var.f22606j7[i12], null);
                    return;
                } else {
                    q1Var.f22606j7[i12].k(this.f21842c, "", "", null);
                    return;
                }
            case 1:
                new ph.g4((Context) obj3, this.f21841b, ((org.telegram.messenger.t9) obj2).d, null, this.f21842c, (Runnable) obj, false, false).show();
                return;
            case 2:
                rh.q qVar = (rh.q) obj2;
                TLObject tLObject = (TLObject) obj;
                int i13 = ((rh.r) obj3).f47383a;
                boolean[] zArr = qVar.d;
                boolean[] zArr2 = qVar.f47332b;
                ArrayList[] arrayListArr = qVar.f47331a;
                zArr[i12] = false;
                if (tLObject instanceof TL_stars.StarsStatus) {
                    TL_stars.StarsStatus starsStatus = (TL_stars.StarsStatus) tLObject;
                    vp.r1(i13).V3(starsStatus.users, false);
                    vp.r1(i13).P3(starsStatus.chats, false);
                    arrayListArr[i12].addAll(starsStatus.history);
                    if (arrayListArr[i12].isEmpty() && !zArr2[i12]) {
                        z10 = false;
                    } else {
                        z10 = true;
                    }
                    zArr2[i12] = z10;
                    boolean[] zArr3 = qVar.e;
                    if ((starsStatus.flags & 1) == 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    zArr3[i12] = z11;
                    String[] strArr = qVar.f47333c;
                    if (!z11) {
                        str = starsStatus.next_offset;
                    }
                    strArr[i12] = str;
                    zs.f(i13).k(226, Long.valueOf(j10));
                    return;
                }
                return;
            case 3:
                vh.d dVar = (vh.d) obj3;
                dVar.setLoading(true);
                TL_stars.TL_fulfillStarsSubscription tL_fulfillStarsSubscription = new TL_stars.TL_fulfillStarsSubscription();
                tL_fulfillStarsSubscription.subscription_id = ((TL_stars.StarsSubscription) obj2).f20022id;
                tL_fulfillStarsSubscription.peer = new TLRPC.TL_inputPeerSelf();
                int i14 = this.f21841b;
                ConnectionsManager.getInstance(i14).sendRequest(tL_fulfillStarsSubscription, new org.telegram.ui.Components.o2(i14, 3, this.f21842c, dVar, (org.telegram.ui.ActionBar.z2[]) obj));
                return;
            default:
                th.e5 e5Var = (th.e5) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                String str2 = (String) obj;
                int i15 = e5Var.f48904a;
                HashSet hashSet = e5Var.f48920t;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject2;
                    vp.r1(i15).V3(tL_stories_stories.users, false);
                    vp.r1(i15).P3(tL_stories_stories.chats, false);
                    while (true) {
                        if (i11 < tL_stories_stories.stories.size()) {
                            if (tL_stories_stories.stories.get(i11).f20031id == i12) {
                                storyItem = tL_stories_stories.stories.get(i11);
                            } else {
                                i11++;
                            }
                        }
                    }
                }
                e5Var.W.remove(str2);
                if (storyItem != null) {
                    storyItem.dialogId = j10;
                    TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
                    tL_updateStory.peer = vp.r1(i15).y1(j10);
                    tL_updateStory.story = storyItem;
                    e5Var.c0(tL_updateStory);
                    return;
                }
                Iterator it = hashSet.iterator();
                while (true) {
                    if (it.hasNext()) {
                        String str3 = (String) it.next();
                        if (str3.endsWith(":" + j10 + ":" + i12)) {
                            hashSet.remove(str3);
                        }
                    }
                }
                hashSet.add(str2);
                e5Var.f48912l.edit().putStringSet("unsupported_stories_checked", hashSet).apply();
                return;
        }
    }

    public e1(Object obj, Object obj2, int i10, Object obj3, long j10, int i11) {
        this.f21840a = i11;
        this.d = obj;
        this.e = obj2;
        this.f21841b = i10;
        this.f21843f = obj3;
        this.f21842c = j10;
    }
}
