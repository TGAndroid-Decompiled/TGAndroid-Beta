package org.telegram.ui.Components.quickforward;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.ChatMessageCell;

public final class QuickShareSelectorOverlayLayout extends View {
    public final int currentAccount;
    public final ArrayList dialogs;
    public final HashMap drawableHashMap;
    public final ArrayList drawablesForRemove;

    public QuickShareSelectorOverlayLayout(Context context) {
        super(context);
        this.drawableHashMap = new HashMap();
        this.drawablesForRemove = new ArrayList();
        this.dialogs = new ArrayList();
        this.currentAccount = UserConfig.selectedAccount;
    }

    public static String key(ChatMessageCell chatMessageCell) {
        MessageObject messageObject = chatMessageCell.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.getChatId() + "_" + messageObject.getId();
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof QuickShareSelectorDrawable) {
            invalidate();
        }
    }

    public final boolean isActive() {
        Iterator it = this.drawableHashMap.entrySet().iterator();
        while (it.hasNext()) {
            if (!((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).closeAnimationStarted) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap map = this.drawableHashMap;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).destroy();
        }
        map.clear();
        this.drawablesForRemove.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        HashMap map = this.drawableHashMap;
        Iterator it = map.entrySet().iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            } else {
                ((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).draw(canvas, false, 255);
            }
        }
        ArrayList arrayList = this.drawablesForRemove;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            QuickShareSelectorDrawable quickShareSelectorDrawable = (QuickShareSelectorDrawable) map.remove((String) obj);
            if (quickShareSelectorDrawable != null) {
                quickShareSelectorDrawable.destroy();
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        Iterator it = this.drawableHashMap.entrySet().iterator();
        while (it.hasNext()) {
            ((QuickShareSelectorDrawable) ((Map.Entry) it.next()).getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
