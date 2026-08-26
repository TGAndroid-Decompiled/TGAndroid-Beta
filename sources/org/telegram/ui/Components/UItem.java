package org.telegram.ui.Components;

import android.content.Context;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.StatisticActivity;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda7;

public final class UItem extends AdapterWithDiffUtils.Item {
    public static LongSparseArray factories = null;
    public static HashMap factoryInstances = null;
    public static int factoryViewType = 10000;
    public boolean accent;
    public CharSequence animatedText;
    public VoIPFragment$$ExternalSyntheticLambda7 bind;
    public boolean checked;
    public View.OnClickListener clickCallback;
    public View.OnClickListener clickCallback2;
    public boolean collapsed;
    public long dialogId;
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

    public abstract class UItemFactory {
        private ArrayList<View> cache;
        public final int viewType;

        public UItemFactory() {
            int i = UItem.factoryViewType;
            UItem.factoryViewType = i + 1;
            this.viewType = i;
        }

        public static void setup(UItemFactory uItemFactory) {
            if (UItem.factoryInstances == null) {
                UItem.factoryInstances = new HashMap();
            }
            if (UItem.factories == null) {
                UItem.factories = new LongSparseArray();
            }
            Class<?> cls = uItemFactory.getClass();
            if (UItem.factoryInstances.containsKey(cls)) {
                return;
            }
            UItem.factoryInstances.put(cls, uItemFactory);
            UItem.factories.put(uItemFactory.viewType, uItemFactory);
        }

        public void attachedView(RecyclerListView recyclerListView, View view, UItem uItem) {
        }

        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
        }

        public boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.itemContentEquals(uItem2);
        }

        public abstract View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider);

        public boolean equals(UItem uItem, UItem uItem2) {
            return uItem.itemEquals(uItem2);
        }

        public View getCached() {
            ArrayList<View> arrayList = this.cache;
            if (arrayList == null || arrayList.isEmpty()) {
                return null;
            }
            return this.cache.remove(0);
        }

        public boolean isClickable() {
            return !(this instanceof ChatAttachAlertAudioLayout.EmptyView.Factory);
        }

        public boolean isShadow() {
            return false;
        }

        public void precache(BaseFragment baseFragment, int i) {
            precache(baseFragment.getContext(), baseFragment.getCurrentAccount(), baseFragment.getClassGuid(), baseFragment.getResourceProvider(), i);
        }

        public void precache(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider, int i3) {
            if (context == null) {
                return;
            }
            if (this.cache == null) {
                this.cache = new ArrayList<>();
            }
            int i4 = 0;
            while (i4 < this.cache.size() - i3) {
                Context context2 = context;
                this.cache.add(createView(context2, null, i, i2, resourcesProvider));
                i4++;
                context = context2;
            }
        }
    }

    public UItem(int i) {
        super(i, false);
        this.enabled = true;
        this.spanCount = -1;
        this.withUsername = true;
    }

    public static UItem asButton(int i, String str) {
        UItem uItem = new UItem(3);
        uItem.id = i;
        uItem.text = str;
        return uItem;
    }

    public static UItem asCenterShadow(CharSequence charSequence) {
        UItem uItem = new UItem(7);
        uItem.text = charSequence;
        uItem.accent = true;
        return uItem;
    }

    public static UItem asChart(int i, int i2, StatisticActivity.ChartViewData chartViewData) {
        UItem uItem = new UItem(i + 18);
        uItem.intValue = i2;
        uItem.object = chartViewData;
        return uItem;
    }

    public static UItem asCheck(int i, CharSequence charSequence) {
        UItem uItem = new UItem(4);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asCustom(int i, View view) {
        UItem uItem = new UItem(-1);
        uItem.id = i;
        uItem.view = view;
        uItem.intValue = -1;
        return uItem;
    }

    public static UItem asCustomShadow(View view) {
        UItem uItem = new UItem(-4);
        uItem.view = view;
        uItem.intValue = -1;
        return uItem;
    }

    public static UItem asFlicker(int i, int i2) {
        UItem uItem = new UItem(34);
        uItem.id = i;
        uItem.intValue = i2;
        return uItem;
    }

    public static UItem asHeader(int i, String str) {
        UItem uItem = new UItem(0);
        uItem.id = i;
        uItem.text = str;
        return uItem;
    }

    public static UItem asRadio(int i, String str) {
        UItem uItem = new UItem(10);
        uItem.id = i;
        uItem.text = str;
        return uItem;
    }

    public static UItem asRoundCheckbox(int i, CharSequence charSequence) {
        UItem uItem = new UItem(35);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asShadow(int i, CharSequence charSequence) {
        UItem uItem = new UItem(7);
        uItem.id = i;
        uItem.text = charSequence;
        return uItem;
    }

    public static UItem asSpace(int i, int i2) {
        UItem uItem = new UItem(28);
        uItem.id = i;
        uItem.intValue = i2;
        return uItem;
    }

    public static UItemFactory findFactory(int i) {
        LongSparseArray longSparseArray = factories;
        if (longSparseArray == null) {
            return null;
        }
        return (UItemFactory) longSparseArray.get(i);
    }

    public static UItem ofFactory(Class cls) {
        if (factoryInstances == null) {
            factoryInstances = new HashMap();
        }
        if (factories == null) {
            factories = new LongSparseArray();
        }
        UItemFactory uItemFactory = (UItemFactory) factoryInstances.get(cls);
        if (uItemFactory != null) {
            return new UItem(uItemFactory.viewType);
        }
        throw new RuntimeException("UItemFactory was not setuped: " + cls);
    }

    @Override
    public final boolean contentsEquals(AdapterWithDiffUtils.Item item) {
        UItemFactory uItemFactoryFindFactory;
        if (this == item) {
            return true;
        }
        if (UItem.class != item.getClass()) {
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
        return (i < 10000 || (uItemFactoryFindFactory = findFactory(i)) == null) ? itemContentEquals(uItem) : uItemFactoryFindFactory.contentsEquals(this, uItem);
    }

    public final boolean equals(Object obj) {
        UItemFactory uItemFactoryFindFactory;
        if (this == obj) {
            return true;
        }
        if (obj == null || UItem.class != obj.getClass()) {
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
        return (i < 10000 || (uItemFactoryFindFactory = findFactory(i)) == null) ? itemEquals(uItem) : uItemFactoryFindFactory.equals(this, uItem);
    }

    public final boolean instanceOf(Class cls) {
        HashMap map;
        UItemFactory uItemFactory;
        return this.viewType >= 10000 && (map = factoryInstances) != null && (uItemFactory = (UItemFactory) map.get(cls)) != null && uItemFactory.viewType == this.viewType;
    }

    public final boolean itemContentEquals(org.telegram.ui.Components.UItem r4) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.UItem.itemContentEquals(org.telegram.ui.Components.UItem):boolean");
    }

    public final boolean itemEquals(UItem uItem) {
        return this.id == uItem.id && this.pad == uItem.pad && this.dialogId == uItem.dialogId && this.iconResId == uItem.iconResId && this.hideDivider == uItem.hideDivider && this.transparent == uItem.transparent && this.red == uItem.red && this.locked == uItem.locked && this.accent == uItem.accent && this.view == uItem.view && TextUtils.equals(this.text, uItem.text) && TextUtils.equals(this.subtext, uItem.subtext) && TextUtils.equals(this.textValue, uItem.textValue) && this.view == uItem.view && this.intValue == uItem.intValue && Math.abs(this.floatValue - uItem.floatValue) < 0.01f && this.longValue == uItem.longValue && Objects.equals(this.object, uItem.object) && Objects.equals(this.object2, uItem.object2);
    }

    public final void setChecked(boolean z) {
        this.checked = z;
        if (this.viewType == 11) {
            this.viewType = 12;
        }
    }

    public static UItem asButton(int i, int i2, String str) {
        UItem uItem = new UItem(3);
        uItem.id = i;
        uItem.iconResId = i2;
        uItem.text = str;
        return uItem;
    }

    public static UItem asCustom(View view) {
        UItem uItem = new UItem(-1);
        uItem.view = view;
        uItem.intValue = -1;
        return uItem;
    }

    public static UItem asButton(String str, CharSequence charSequence, int i) {
        UItem uItem = new UItem(3);
        uItem.id = i;
        uItem.text = str;
        uItem.textValue = charSequence;
        return uItem;
    }

    public static UItem asButton(int i, int i2, String str, String str2) {
        UItem uItem = new UItem(3);
        uItem.id = i;
        uItem.iconResId = i2;
        uItem.text = str;
        uItem.textValue = str2;
        return uItem;
    }
}
