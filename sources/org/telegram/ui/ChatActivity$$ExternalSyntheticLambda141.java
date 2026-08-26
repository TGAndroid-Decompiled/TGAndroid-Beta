package org.telegram.ui;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import org.telegram.ui.Cells.ChatActionCell;
import org.telegram.ui.Cells.ChatMessageCell;
import org.telegram.ui.Components.ViewPagerFixed;

public final class ChatActivity$$ExternalSyntheticLambda141 implements Consumer {
    public final int $r8$classId;
    public final Object f$0;
    public final boolean f$1;

    public ChatActivity$$ExternalSyntheticLambda141(int i, Object obj, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
    }

    @Override
    public final void accept(Object obj) {
        ViewPagerFixed.TabsView.TabsViewDelegate tabsViewDelegate;
        View view = (View) obj;
        switch (this.$r8$classId) {
            case 0:
                ChatActivity chatActivity = (ChatActivity) this.f$0;
                chatActivity.getClass();
                boolean z = view instanceof ChatMessageCell;
                boolean z2 = this.f$1;
                if (!z) {
                    if (view instanceof ChatActionCell) {
                        ((ChatActionCell) view).isAllChats = z2;
                    }
                    break;
                } else {
                    ChatMessageCell chatMessageCell = (ChatMessageCell) view;
                    if ((chatMessageCell.isAllChats && chatMessageCell.isSideMenuEnabled) != z2 && chatActivity.isSideMenuEnabled()) {
                        chatMessageCell.isAllChats = z2;
                        chatMessageCell.isSideMenuEnabled = chatActivity.isSideMenuEnabled();
                        chatMessageCell.forcedLayout = true;
                        chatMessageCell.forceLayout();
                        break;
                    }
                }
                break;
            case 1:
                ChannelColorActivity.PeerColorPicker peerColorPicker = (ChannelColorActivity.PeerColorPicker) this.f$0;
                peerColorPicker.getClass();
                ChannelColorActivity.PeerColorPicker.ColorCell colorCell = (ChannelColorActivity.PeerColorPicker.ColorCell) view;
                peerColorPicker.listView.getClass();
                boolean z3 = RecyclerView.getChildAdapterPosition(view) == peerColorPicker.selectedPosition;
                colorCell.selected = z3;
                if (!this.f$1) {
                    colorCell.selectedT.set(z3, true);
                }
                colorCell.invalidate();
                break;
            default:
                ViewPagerFixed.TabsView tabsView = (ViewPagerFixed.TabsView) this.f$0;
                tabsView.listView.getClass();
                int childAdapterPosition = RecyclerView.getChildAdapterPosition(view);
                if (view instanceof ViewPagerFixed.TabsView.TabView) {
                    ViewPagerFixed.TabsView.TabView tabView = (ViewPagerFixed.TabsView.TabView) view;
                    boolean z4 = false;
                    if (this.f$1 && (tabsViewDelegate = tabsView.delegate) != null) {
                        ViewPagerFixed.Adapter adapter = ViewPagerFixed.this.adapter;
                        if (adapter == null ? false : adapter.canReorder(childAdapterPosition)) {
                            z4 = true;
                        }
                    }
                    tabView.setReordering(z4);
                }
                break;
        }
    }
}
