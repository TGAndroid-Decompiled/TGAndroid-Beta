package org.telegram.ui;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.TopicsTabsView;

public final class ChatActivity$$ExternalSyntheticLambda48 implements AlertDialog.OnButtonClickListener, RecyclerListView.OnItemClickListenerExtended {
    public final int $r8$classId;
    public final NotificationCenter.NotificationCenterDelegate f$0;
    public final Object f$1;
    public final Object f$2;
    public final Object f$3;
    public final long f$4;

    public ChatActivity$$ExternalSyntheticLambda48(Object obj, KeyEvent.Callback callback, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = (NotificationCenter.NotificationCenterDelegate) obj;
        this.f$1 = callback;
        this.f$2 = obj2;
        this.f$4 = j;
        this.f$3 = obj3;
    }

    @Override
    public boolean hasDoubleTap(View view, int i) {
        return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$showOpenGameAlert$373((TLRPC.TL_game) this.f$1, (MessageObject) this.f$2, (String) this.f$3, this.f$4, alertDialog, i);
                break;
            default:
                ((TopicsTabsView) this.f$0).lambda$deleteTopics$20((ArrayList) this.f$1, this.f$4, (HashSet) this.f$2, (Runnable) this.f$3, alertDialog, i);
                break;
        }
    }

    @Override
    public void onDoubleTap(View view, int i, float f, float f2) {
        RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
    }

    @Override
    public void onItemClick(View view, int i, float f, float f2) {
        ((SharedMediaLayout) this.f$0).lambda$new$28((SharedMediaLayout.MediaPage) this.f$1, (Context) this.f$2, this.f$4, (Theme.ResourcesProvider) this.f$3, view, i, f, f2);
    }

    public ChatActivity$$ExternalSyntheticLambda48(ChatActivity chatActivity, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j) {
        this.$r8$classId = 0;
        this.f$0 = chatActivity;
        this.f$1 = tL_game;
        this.f$2 = messageObject;
        this.f$3 = str;
        this.f$4 = j;
    }

    public ChatActivity$$ExternalSyntheticLambda48(TopicsTabsView topicsTabsView, ArrayList arrayList, long j, HashSet hashSet, Runnable runnable) {
        this.$r8$classId = 2;
        this.f$0 = topicsTabsView;
        this.f$1 = arrayList;
        this.f$4 = j;
        this.f$2 = hashSet;
        this.f$3 = runnable;
    }
}
