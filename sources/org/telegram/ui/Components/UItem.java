package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.BusinessLinksActivity;
import org.telegram.ui.Business.QuickRepliesController;
import org.telegram.ui.Cells.SlideIntChooseView;
import org.telegram.ui.ChannelMonetizationLayout;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.StatisticActivity;

public class UItem extends AdapterWithDiffUtils.Item {
    private static LongSparseArray factories = null;
    private static HashMap factoryInstances = null;
    private static int factoryViewType = 10000;
    public static int factoryViewTypeStartsWith = 10000;
    public boolean accent;
    public CharSequence animatedText;
    public Utilities.Callback bind;
    public String chatType;
    public boolean checked;
    public View.OnClickListener clickCallback;
    public View.OnClickListener clickCallback2;
    public boolean collapsed;
    public long dialogId;
    public Drawable drawable;
    public boolean enabled;
    public int flags;
    public float floatValue;
    public boolean hideDivider;
    public int iconResId;
    public int id;
    public boolean include;
    public Utilities.Callback intCallback;
    public int intValue;
    public boolean locked;
    public long longValue;
    public Object object;
    public Object object2;
    public int pad;
    public int parentSpanCount;
    public boolean red;
    public boolean reordering;
    public int spanCount;
    public CharSequence subtext;
    public CharSequence text;
    public CharSequence textValue;
    public String[] texts;
    public boolean transparent;
    public View view;
    public boolean withUsername;

    static int access$208() {
        int i = factoryViewType;
        factoryViewType = i + 1;
        return i;
    }

    public UItem(int i, boolean z) {
        super(i, z);
        this.enabled = true;
        this.spanCount = -1;
        this.withUsername = true;
    }

    public static UItem asCustom(int i, View view) {
        UItem uItem = new UItem(-1, false);
        uItem.id = i;
        uItem.view = view;
        uItem.intValue = -1;
        return uItem;
    }

    public static UItem asCustom(View view) {
        UItem uItem = new UItem(-1, false);
        uItem.view = view;
        uItem.intValue = -1;
        return uItem;
    }

    public static UItem asCustomShadow(View view) {
        UItem uItem = new UItem(-4, false);
        uItem.view = view;
        uItem.intValue = -1;
        return uItem;
    }

    public static UItem asCustomShadow(View view, boolean z) {
        UItem uItem = new UItem(-4, false);
        uItem.view = view;
        uItem.intValue = -1;
        uItem.checked = z;
        return uItem;
    }

    public static UItem asCustomShadow(View view, int i) {
        UItem uItem = new UItem(-4, false);
        uItem.view = view;
        uItem.intValue = i;
        return uItem;
    }

    public static UItem asFullyCustom(View view) {
        UItem uItem = new UItem(-2, false);
        uItem.view = view;
        return uItem;
    }

    public static UItem asFullscreenCustom(View view, int i) {
        return asFullscreenCustom(view, i, false);
    }

    public static UItem asFullscreenCustom(View view, int i, boolean z) {
        UItem uItem = new UItem(-3, false);
        uItem.view = view;
        uItem.intValue = i;
        uItem.flags = z ? 1 : 0;
        return uItem;
    }

    public static UItem asHeader(CharSequence charSequence) {
        UItem uItem = new UItem(0, false);
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asHeader(int i, CharSequence charSequence) {
        UItem uItem = new UItem(0, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asAnimatedHeader(int i, CharSequence charSequence) {
        UItem uItem = new UItem(42, false);
        uItem.id = i;
        uItem.animatedText = charSequence;
        return uItem;
    }

    public static UItem asBlackHeader(CharSequence charSequence) {
        UItem uItem = new UItem(1, false);
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asTopView(CharSequence charSequence, CharSequence charSequence2, String str, String str2) {
        UItem uItem = new UItem(2, false);
        uItem.text = charSequence;
        uItem.animatedText = charSequence2;
        uItem.subtext = str;
        uItem.textValue = str2;
        return uItem;
    }

    public static UItem asTopView(CharSequence charSequence, CharSequence charSequence2, int i, String str, String str2) {
        UItem uItem = new UItem(2, false);
        uItem.text = charSequence;
        uItem.animatedText = charSequence2;
        uItem.subtext = str;
        uItem.textValue = str2;
        uItem.intValue = i;
        return uItem;
    }

    public static UItem asTopView(CharSequence charSequence, CharSequence charSequence2, int i) {
        UItem uItem = new UItem(2, false);
        uItem.text = charSequence;
        uItem.animatedText = charSequence2;
        uItem.iconResId = i;
        return uItem;
    }

    public static UItem asTopView(CharSequence charSequence, int i) {
        UItem uItem = new UItem(2, false);
        uItem.text = charSequence;
        uItem.iconResId = i;
        return uItem;
    }

    public static UItem asButton(int i, CharSequence charSequence) {
        UItem uItem = new UItem(3, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asButton(int i, int i2, CharSequence charSequence) {
        UItem uItem = new UItem(3, false);
        uItem.id = i;
        uItem.iconResId = i2;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asButton(int i, Drawable drawable, CharSequence charSequence) {
        UItem uItem = new UItem(3, false);
        uItem.id = i;
        uItem.object = drawable;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asButton(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(3, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.textValue = charSequence2;
        return uItem;
    }

    public static UItem asButton(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(3, false);
        uItem.id = i;
        uItem.iconResId = i2;
        uItem.text = charSequence;
        uItem.textValue = charSequence2;
        return uItem;
    }

    public static UItem asStickerButton(int i, CharSequence charSequence, TLRPC.Document document) {
        UItem uItem = new UItem(3, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.object = document;
        return uItem;
    }

    public static UItem asStickerButton(int i, CharSequence charSequence, String str) {
        UItem uItem = new UItem(3, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.object = str;
        return uItem;
    }

    public static UItem asRippleCheck(int i, CharSequence charSequence) {
        UItem uItem = new UItem(9, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asCheck(int i, CharSequence charSequence) {
        UItem uItem = new UItem(4, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asRadio(int i, CharSequence charSequence) {
        UItem uItem = new UItem(10, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asRadio(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(10, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.textValue = charSequence2;
        return uItem;
    }

    public static UItem asButtonCheck(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(5, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.subtext = charSequence2;
        return uItem;
    }

    public static UItem asShadow(CharSequence charSequence) {
        UItem uItem = new UItem(7, false);
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asLargeShadow(CharSequence charSequence) {
        UItem uItem = new UItem(8, false);
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asCenterShadow(CharSequence charSequence) {
        UItem uItem = new UItem(7, false);
        uItem.text = charSequence;
        uItem.accent = true;
        return uItem;
    }

    public static UItem asProceedOverview(ChannelMonetizationLayout.ProceedOverview proceedOverview) {
        UItem uItem = new UItem(24, false);
        uItem.object = proceedOverview;
        return uItem;
    }

    public static UItem asShadow(int i, CharSequence charSequence) {
        UItem uItem = new UItem(7, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asFilterChat(boolean z, long j) {
        UItem uItem = new UItem(11, false);
        uItem.include = z;
        uItem.dialogId = j;
        return uItem;
    }

    public static UItem asAddChat(Long l) {
        UItem uItem = new UItem(13, false);
        uItem.dialogId = l.longValue();
        return uItem;
    }

    public static UItem asAddChat(Long l, String str) {
        UItem uItem = new UItem(13, false);
        uItem.dialogId = l.longValue();
        uItem.textValue = str;
        return uItem;
    }

    public static UItem asSlideView(String[] strArr, int i, Utilities.Callback callback) {
        UItem uItem = new UItem(14, false);
        uItem.texts = strArr;
        uItem.intValue = i;
        uItem.intCallback = callback;
        uItem.longValue = -1L;
        return uItem;
    }

    public static UItem asIntSlideView(int i, int i2, int i3, int i4, Utilities.CallbackReturn callbackReturn, Utilities.Callback callback) {
        UItem uItem = new UItem(15, false);
        uItem.intValue = i3;
        uItem.intCallback = callback;
        uItem.object = SlideIntChooseView.Options.make(i, i2, i4, callbackReturn);
        uItem.longValue = -1L;
        return uItem;
    }

    public UItem setMinSliderValue(int i) {
        this.longValue = i;
        return this;
    }

    public static UItem asQuickReply(QuickRepliesController.QuickReply quickReply) {
        UItem uItem = new UItem(16, false);
        uItem.object = quickReply;
        return uItem;
    }

    public static UItem asLargeQuickReply(QuickRepliesController.QuickReply quickReply) {
        UItem uItem = new UItem(17, false);
        uItem.object = quickReply;
        return uItem;
    }

    public static UItem asBusinessChatLink(BusinessLinksActivity.BusinessLinkWrapper businessLinkWrapper) {
        UItem uItem = new UItem(29, false);
        uItem.object = businessLinkWrapper;
        return uItem;
    }

    public static UItem asChart(int i, int i2, StatisticActivity.ChartViewData chartViewData) {
        UItem uItem = new UItem(i + 18, false);
        uItem.intValue = i2;
        uItem.object = chartViewData;
        return uItem;
    }

    public static UItem asSpace(int i) {
        UItem uItem = new UItem(28, false);
        uItem.intValue = i;
        return uItem;
    }

    public static UItem asSpace(int i, int i2) {
        UItem uItem = new UItem(28, false);
        uItem.id = i;
        uItem.intValue = i2;
        return uItem;
    }

    public static UItem asRoundCheckbox(int i, CharSequence charSequence) {
        UItem uItem = new UItem(35, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asRoundGroupCheckbox(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(41, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.animatedText = charSequence2;
        return uItem;
    }

    public static UItem asUserGroupCheckbox(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(36, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.animatedText = charSequence2;
        return uItem;
    }

    public static UItem asUserCheckbox(int i, TLObject tLObject) {
        UItem uItem = new UItem(37, false);
        uItem.id = i;
        uItem.object = tLObject;
        return uItem;
    }

    public static UItem asShadowCollapseButton(int i, CharSequence charSequence) {
        UItem uItem = new UItem(38, false);
        uItem.id = i;
        uItem.animatedText = charSequence;
        return uItem;
    }

    public static UItem asSwitch(int i, CharSequence charSequence) {
        UItem uItem = new UItem(39, false);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asExpandableSwitch(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(40, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.animatedText = charSequence2;
        return uItem;
    }

    public static UItem asGraySection(CharSequence charSequence) {
        UItem uItem = new UItem(31, false);
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asGraySection(CharSequence charSequence, CharSequence charSequence2, View.OnClickListener onClickListener) {
        UItem uItem = new UItem(31, false);
        uItem.text = charSequence;
        uItem.subtext = charSequence2;
        uItem.clickCallback = onClickListener;
        return uItem;
    }

    public static UItem asProfileCell(TLObject tLObject) {
        UItem uItem = new UItem(32, false);
        uItem.object = tLObject;
        return uItem;
    }

    public UItem withOpenButton(Utilities.Callback callback) {
        this.locked = true;
        this.object2 = callback;
        return this;
    }

    public static UItem asSearchMessage(MessageObject messageObject) {
        UItem uItem = new UItem(33, false);
        uItem.object = messageObject;
        return uItem;
    }

    public static UItem asSearchMessage(int i, MessageObject messageObject) {
        UItem uItem = new UItem(33, false);
        uItem.id = i;
        uItem.object = messageObject;
        return uItem;
    }

    public static UItem asFlicker(int i) {
        UItem uItem = new UItem(34, false);
        uItem.intValue = i;
        return uItem;
    }

    public static UItem asFlicker(int i, int i2) {
        UItem uItem = new UItem(34, false);
        uItem.id = i;
        uItem.intValue = i2;
        return uItem;
    }

    public static UItem asSettingsCell(int i, int i2, CharSequence charSequence) {
        UItem uItem = new UItem(43, false);
        uItem.id = i;
        uItem.iconResId = i2;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asSettingsCell(int i, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(43, false);
        uItem.id = i;
        uItem.text = charSequence;
        uItem.subtext = charSequence2;
        return uItem;
    }

    public static UItem asSettingsCell(int i, int i2, CharSequence charSequence, CharSequence charSequence2) {
        UItem uItem = new UItem(43, false);
        uItem.id = i;
        uItem.iconResId = i2;
        uItem.text = charSequence;
        uItem.subtext = charSequence2;
        return uItem;
    }

    public UItem withUsername(boolean z) {
        this.withUsername = z;
        return this;
    }

    public UItem setCloseIcon(View.OnClickListener onClickListener) {
        this.clickCallback = onClickListener;
        return this;
    }

    public UItem setClickCallback(View.OnClickListener onClickListener) {
        this.clickCallback = onClickListener;
        return this;
    }

    public UItem setClickCallback2(View.OnClickListener onClickListener) {
        this.clickCallback2 = onClickListener;
        return this;
    }

    public UItem setId(int i) {
        this.id = i;
        return this;
    }

    public UItem setChecked(boolean z) {
        this.checked = z;
        if (this.viewType == 11) {
            this.viewType = 12;
        }
        return this;
    }

    public UItem setCollapsed(boolean z) {
        this.collapsed = z;
        return this;
    }

    public UItem setPad(int i) {
        this.pad = i;
        return this;
    }

    public UItem pad() {
        this.pad = 1;
        return this;
    }

    public UItem setEnabled(boolean z) {
        this.enabled = z;
        return this;
    }

    public UItem setLocked(boolean z) {
        this.locked = z;
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

    public UItem setSpanCount(int i) {
        this.spanCount = i;
        return this;
    }

    public UItem setReordering(boolean z) {
        this.reordering = z;
        return this;
    }

    public UItem onBind(Utilities.Callback callback) {
        this.bind = callback;
        return this;
    }

    public boolean instanceOf(Class cls) {
        HashMap map;
        UItemFactory uItemFactory;
        return this.viewType >= factoryViewTypeStartsWith && (map = factoryInstances) != null && (uItemFactory = (UItemFactory) map.get(cls)) != null && uItemFactory.viewType == this.viewType;
    }

    public boolean equals(Object obj) {
        UItemFactory uItemFactoryFindFactory;
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UItem uItem = (UItem) obj;
        int i = this.viewType;
        if (i != uItem.viewType) {
            return false;
        }
        if (i == 36 || i == 35) {
            return this.id == uItem.id;
        }
        if (i == 28) {
            return this.id == uItem.id;
        }
        if (i == 31) {
            return TextUtils.equals(this.text, uItem.text);
        }
        if (i >= factoryViewTypeStartsWith && (uItemFactoryFindFactory = findFactory(i)) != null) {
            return uItemFactoryFindFactory.equals(this, uItem);
        }
        return itemEquals(uItem);
    }

    @Override
    protected boolean contentsEquals(AdapterWithDiffUtils.Item item) {
        UItemFactory uItemFactoryFindFactory;
        if (this == item) {
            return true;
        }
        if (item == null || getClass() != item.getClass()) {
            return false;
        }
        UItem uItem = (UItem) item;
        int i = this.viewType;
        if (i != uItem.viewType) {
            return false;
        }
        if (i == 31) {
            return TextUtils.equals(this.text, uItem.text) && TextUtils.equals(this.subtext, uItem.subtext);
        }
        if (i == 28) {
            return this.intValue == uItem.intValue;
        }
        if (i == 35 || i == 37) {
            return this.id == uItem.id && TextUtils.equals(this.text, uItem.text) && this.checked == uItem.checked;
        }
        if (i >= factoryViewTypeStartsWith && (uItemFactoryFindFactory = findFactory(i)) != null) {
            return uItemFactoryFindFactory.contentsEquals(this, uItem);
        }
        return itemContentEquals(uItem);
    }

    public boolean itemEquals(UItem uItem) {
        return this.id == uItem.id && this.pad == uItem.pad && this.dialogId == uItem.dialogId && this.iconResId == uItem.iconResId && this.hideDivider == uItem.hideDivider && this.transparent == uItem.transparent && this.red == uItem.red && this.locked == uItem.locked && this.accent == uItem.accent && this.view == uItem.view && TextUtils.equals(this.text, uItem.text) && TextUtils.equals(this.subtext, uItem.subtext) && TextUtils.equals(this.textValue, uItem.textValue) && this.view == uItem.view && this.intValue == uItem.intValue && Math.abs(this.floatValue - uItem.floatValue) < 0.01f && this.longValue == uItem.longValue && this.drawable == uItem.drawable && Objects.equals(this.object, uItem.object) && Objects.equals(this.object2, uItem.object2);
    }

    public boolean itemContentEquals(UItem uItem) {
        int i = this.viewType;
        if (i == uItem.viewType) {
            if (this.id != uItem.id || this.enabled != uItem.enabled) {
                return false;
            }
            if (i != 0 && i != 1) {
                if (i == 3) {
                    return this.object == uItem.object && TextUtils.equals(this.text, uItem.text) && TextUtils.equals(this.textValue, uItem.textValue) && this.iconResId == uItem.iconResId && this.accent == uItem.accent && this.red == uItem.red;
                }
                if (i != 7) {
                    if (i != 26) {
                        if (i == 34) {
                            return this.intValue == uItem.intValue;
                        }
                    }
                } else if (this.text == null && uItem.text == null) {
                    return true;
                }
            }
            return TextUtils.equals(this.text, uItem.text);
        }
        return super.contentsEquals(uItem);
    }

    public static abstract class UItemFactory {
        private ArrayList cache;
        public final int viewType = UItem.access$208();

        public void attachedView(RecyclerListView recyclerListView, View view, UItem uItem) {
        }

        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
        }

        public abstract View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider);

        public boolean isClickable() {
            return true;
        }

        public boolean isShadow() {
            return false;
        }

        public static void setup(UItemFactory uItemFactory) {
            if (UItem.factoryInstances == null) {
                HashMap unused = UItem.factoryInstances = new HashMap();
            }
            if (UItem.factories == null) {
                LongSparseArray unused2 = UItem.factories = new LongSparseArray();
            }
            Class<?> cls = uItemFactory.getClass();
            if (UItem.factoryInstances.containsKey(cls)) {
                return;
            }
            UItem.factoryInstances.put(cls, uItemFactory);
            UItem.factories.put(uItemFactory.viewType, uItemFactory);
        }

        protected View getCached() {
            ArrayList arrayList = this.cache;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            return (View) this.cache.remove(0);
        }

        public boolean equals(UItem uItem, UItem uItem2) {
            return uItem.itemEquals(uItem2);
        }

        public boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.itemContentEquals(uItem2);
        }
    }

    public static UItemFactory findFactory(int i) {
        LongSparseArray longSparseArray = factories;
        if (longSparseArray == null) {
            return null;
        }
        return (UItemFactory) longSparseArray.get(i);
    }

    public static UItem ofFactory(Class cls) {
        return new UItem(getFactory(cls).viewType, false);
    }

    public static UItemFactory getFactory(Class cls) {
        if (factoryInstances == null) {
            factoryInstances = new HashMap();
        }
        if (factories == null) {
            factories = new LongSparseArray();
        }
        UItemFactory uItemFactory = (UItemFactory) factoryInstances.get(cls);
        if (uItemFactory != null) {
            return uItemFactory;
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }
}
