package org.telegram.ui.Components;

import android.text.TextUtils;
import android.view.View;
import java.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
public class UItem extends AdapterWithDiffUtils.Item {
    public boolean accent;
    public String chatType;
    public boolean checked;
    public Runnable clickCallback;
    public long dialogId;
    public boolean enabled;
    public int iconResId;
    public int id;
    public Utilities.Callback<Integer> intCallback;
    public int intValue;
    public Object object;
    public boolean red;
    public CharSequence subtext;
    public CharSequence text;
    public CharSequence textValue;
    public String[] texts;
    public View view;

    public UItem(int i, boolean z) {
        super(i, z);
        this.enabled = true;
    }

    public static UItem asCustom(View view) {
        UItem uItem = new UItem(-1, false);
        uItem.view = view;
        return uItem;
    }

    public static UItem asHeader(CharSequence charSequence) {
        UItem uItem = new UItem(0, false);
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asTopView(CharSequence charSequence, String str, String str2) {
        UItem uItem = new UItem(1, false);
        uItem.text = charSequence;
        uItem.subtext = str;
        uItem.textValue = str2;
        return uItem;
    }

    public static UItem asTopView(CharSequence charSequence, int i) {
        UItem uItem = new UItem(1, false);
        uItem.text = charSequence;
        uItem.iconResId = i;
        return uItem;
    }

    public static UItem asButton(int i, CharSequence charSequence) {
        UItem uItem = new UItem(2, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asButton(int i, int i2, CharSequence charSequence) {
        UItem uItem = new UItem(2, false);
        uItem.id = i;
        uItem.iconResId = i2;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asButton(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(2, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.textValue = charSequence2;
        return uItem;
    }

    public static UItem asRippleCheck(int i, CharSequence charSequence) {
        UItem uItem = new UItem(7, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asCheck(int i, CharSequence charSequence) {
        UItem uItem = new UItem(3, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asRadio(int i, CharSequence charSequence) {
        UItem uItem = new UItem(8, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asRadio(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(8, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.textValue = charSequence2;
        return uItem;
    }

    public static UItem asButtonCheck(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(4, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.subtext = charSequence2;
        return uItem;
    }

    public static UItem asShadow(CharSequence charSequence) {
        UItem uItem = new UItem(6, false);
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asShadow(int i, CharSequence charSequence) {
        UItem uItem = new UItem(6, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asFilterChat(boolean z, long j) {
        UItem uItem = new UItem(9, false);
        uItem.dialogId = j;
        return uItem;
    }

    public static UItem asFilterChat(boolean z, CharSequence charSequence, String str, int i) {
        UItem uItem = new UItem(9, false);
        uItem.text = charSequence;
        uItem.chatType = str;
        return uItem;
    }

    public static UItem asAddChat(Long l) {
        UItem uItem = new UItem(10, false);
        uItem.dialogId = l.longValue();
        return uItem;
    }

    public static UItem asSlideView(String[] strArr, int i, Utilities.Callback<Integer> callback) {
        UItem uItem = new UItem(11, false);
        uItem.texts = strArr;
        uItem.intValue = i;
        uItem.intCallback = callback;
        return uItem;
    }

    public static UItem asQuickReply(QuickRepliesController.QuickReply quickReply) {
        UItem uItem = new UItem(12, false);
        uItem.object = quickReply;
        return uItem;
    }

    public static UItem asLargeQuickReply(QuickRepliesController.QuickReply quickReply) {
        UItem uItem = new UItem(13, false);
        uItem.object = quickReply;
        return uItem;
    }

    public UItem setCloseIcon(Runnable runnable) {
        this.clickCallback = runnable;
        return this;
    }

    public UItem setChecked(boolean z) {
        this.checked = z;
        return this;
    }

    public UItem setEnabled(boolean z) {
        this.enabled = z;
        return this;
    }

    public UItem red() {
        this.red = true;
        return this;
    }

    public UItem accent() {
        this.accent = true;
        return this;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || UItem.class != obj.getClass()) {
            return false;
        }
        UItem uItem = (UItem) obj;
        return this.viewType == uItem.viewType && this.id == uItem.id && this.iconResId == uItem.iconResId && this.red == uItem.red && this.accent == uItem.accent && TextUtils.equals(this.text, uItem.text) && TextUtils.equals(this.subtext, uItem.subtext) && TextUtils.equals(this.textValue, uItem.textValue) && this.view == uItem.view && this.intValue == uItem.intValue && Objects.equals(this.object, uItem.object);
    }
}
