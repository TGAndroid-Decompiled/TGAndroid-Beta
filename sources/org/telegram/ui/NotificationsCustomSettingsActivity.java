package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.function.ToDoubleFunction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.NotificationsSettingsFacade;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_peerNotifySettings;
import org.telegram.tgnet.TLRPC$TL_topPeer;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextColorCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.NotificationsCustomSettingsActivity;
import org.telegram.ui.NotificationsSettingsActivity;
import org.telegram.ui.ProfileNotificationsActivity;
public class NotificationsCustomSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ListAdapter adapter;
    private AnimatorSet animatorSet;
    private ArrayList<NotificationsSettingsActivity.NotificationException> autoExceptions;
    private int currentType;
    private EmptyTextProgressView emptyView;
    private ArrayList<NotificationsSettingsActivity.NotificationException> exceptions;
    private HashMap<Long, NotificationsSettingsActivity.NotificationException> exceptionsDict;
    private int exceptionsEnd;
    private int exceptionsStart;
    boolean expanded;
    private final ArrayList<ItemInner> items;
    private RecyclerListView listView;
    private final ArrayList<ItemInner> oldItems;
    private final int[] popupOptions;
    private final int[] priorityOptions;
    private SearchAdapter searchAdapter;
    private boolean searchWas;
    private boolean searching;
    private int settingsEnd;
    private int settingsStart;
    private boolean showAutoExceptions;
    private boolean storiesAuto;
    private Boolean storiesEnabled;
    int topicId;
    private final int[] vibrateLabels;

    public void toggleShowAutoExceptions() {
        if (this.listView == null || this.adapter == null) {
            return;
        }
        this.showAutoExceptions = !this.showAutoExceptions;
        updateRows(true);
    }

    public NotificationsCustomSettingsActivity(int i, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2) {
        this(i, arrayList, arrayList2, false);
    }

    public NotificationsCustomSettingsActivity(int i, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList, ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2, boolean z) {
        this.showAutoExceptions = true;
        this.exceptionsDict = new HashMap<>();
        this.topicId = 0;
        this.vibrateLabels = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.popupOptions = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i2 = R.string.NotificationsPriorityUrgent;
        int i3 = R.string.NotificationsPriorityMedium;
        this.priorityOptions = new int[]{R.string.NotificationsPriorityHigh, i2, i2, i3, R.string.NotificationsPriorityLow, i3};
        this.oldItems = new ArrayList<>();
        this.items = new ArrayList<>();
        this.currentType = i;
        this.autoExceptions = arrayList2;
        this.exceptions = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                NotificationsSettingsActivity.NotificationException notificationException = this.exceptions.get(i4);
                this.exceptionsDict.put(Long.valueOf(notificationException.did), notificationException);
            }
        }
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList3 = this.autoExceptions;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i5 = 0; i5 < size2; i5++) {
                NotificationsSettingsActivity.NotificationException notificationException2 = this.autoExceptions.get(i5);
                this.exceptionsDict.put(Long.valueOf(notificationException2.did), notificationException2);
            }
        }
        if (z) {
            loadExceptions();
        }
    }

    @Override
    public boolean onFragmentCreate() {
        if (this.currentType == 3) {
            if (getNotificationsSettings().contains("EnableAllStories")) {
                this.storiesEnabled = Boolean.valueOf(getNotificationsSettings().getBoolean("EnableAllStories", true));
                this.storiesAuto = false;
                this.showAutoExceptions = false;
            } else {
                this.storiesEnabled = null;
                this.storiesAuto = true;
                this.showAutoExceptions = true;
            }
        }
        updateRows(true);
        return super.onFragmentCreate();
    }

    private static boolean isTop5Peer(int i, long j) {
        ArrayList arrayList = new ArrayList(MediaDataController.getInstance(i).hints);
        Collections.sort(arrayList, Comparator$CC.comparingDouble(new ToDoubleFunction() {
            @Override
            public final double applyAsDouble(Object obj) {
                double d;
                d = ((TLRPC$TL_topPeer) obj).rating;
                return d;
            }
        }));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (DialogObject.getPeerDialogId(((TLRPC$TL_topPeer) arrayList.get(i3)).peer) == j) {
                i2 = i3;
            }
        }
        return i2 >= 0 && i2 >= arrayList.size() + (-5);
    }

    public static boolean areStoriesNotMuted(int i, long j) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i);
        if (notificationsSettings.contains(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + j)) {
            return notificationsSettings.getBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + j, true);
        } else if (notificationsSettings.contains("EnableAllStories")) {
            return notificationsSettings.getBoolean("EnableAllStories", true);
        } else {
            return isTop5Peer(i, j);
        }
    }

    public void lambda$createView$6(NotificationsSettingsActivity.NotificationException notificationException, View view, int i) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(notificationException.did, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey).commit();
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList = this.autoExceptions;
        if (arrayList != null) {
            arrayList.remove(notificationException);
        }
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2 = this.exceptions;
        if (arrayList2 != null) {
            arrayList2.remove(notificationException);
        }
        if (isTop5Peer(this.currentAccount, notificationException.did)) {
            notificationException.auto = true;
            notificationException.notify = 0;
            this.autoExceptions.add(notificationException);
        }
        if (view instanceof UserCell) {
            UserCell userCell = (UserCell) view;
            userCell.setException(notificationException, null, userCell.needDivider);
        }
        getNotificationsController().updateServerNotificationsSettings(notificationException.did, 0L, false);
        updateRows(true);
    }

    private void updateMute(NotificationsSettingsActivity.NotificationException notificationException, View view, int i, boolean z, boolean z2) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(notificationException.did, 0L);
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        boolean isTop5Peer = isTop5Peer(this.currentAccount, notificationException.did);
        notificationException.notify = z2 ? ConnectionsManager.DEFAULT_DATACENTER_ID : 0;
        if (notificationException.auto) {
            notificationException.auto = false;
            edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey, !z2).commit();
            ArrayList<NotificationsSettingsActivity.NotificationException> arrayList = this.autoExceptions;
            if (arrayList != null) {
                arrayList.remove(notificationException);
            }
            if (this.exceptions == null) {
                this.exceptions = new ArrayList<>();
            }
            this.exceptions.add(0, notificationException);
        } else if (isTop5Peer) {
            edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey, !z2).commit();
        } else {
            Boolean bool = this.storiesEnabled;
            if (!z2 ? !(bool == null || !bool.booleanValue()) : !(bool != null && bool.booleanValue())) {
                lambda$createView$6(notificationException, view, i);
                return;
            }
            edit.putBoolean(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + sharedPrefKey, !z2).commit();
        }
        if (view instanceof UserCell) {
            UserCell userCell = (UserCell) view;
            userCell.setException(notificationException, null, userCell.needDivider);
        }
        getNotificationsController().updateServerNotificationsSettings(notificationException.did, 0L, false);
        updateRows(true);
    }

    private int getLedColor() {
        int i = this.currentType;
        int i2 = -16776961;
        if (i == 0) {
            i2 = getNotificationsSettings().getInt("GroupLed", -16776961);
        } else if (i == 1) {
            i2 = getNotificationsSettings().getInt("MessagesLed", -16776961);
        } else if (i == 2) {
            i2 = getNotificationsSettings().getInt("ChannelLed", -16776961);
        } else if (i == 3) {
            i2 = getNotificationsSettings().getInt("StoriesLed", -16776961);
        } else if (i == 4 || i == 5) {
            i2 = getNotificationsSettings().getInt("ReactionsLed", -16776961);
        }
        for (int i3 = 0; i3 < 9; i3++) {
            if (TextColorCell.colorsToSave[i3] == i2) {
                return TextColorCell.colors[i3];
            }
        }
        return i2;
    }

    private String getPopupOption() {
        int i;
        int i2 = this.currentType;
        if (i2 == 0) {
            i = getNotificationsSettings().getInt("popupGroup", 0);
        } else if (i2 == 1) {
            i = getNotificationsSettings().getInt("popupAll", 0);
        } else {
            i = i2 != 2 ? 0 : getNotificationsSettings().getInt("popupChannel", 0);
        }
        int[] iArr = this.popupOptions;
        return LocaleController.getString(iArr[Utilities.clamp(i, iArr.length - 1, 0)]);
    }

    private String getSound() {
        String string;
        long j;
        SharedPreferences notificationsSettings = getNotificationsSettings();
        int i = R.string.SoundDefault;
        String string2 = LocaleController.getString("SoundDefault", i);
        int i2 = this.currentType;
        if (i2 == 0) {
            string = notificationsSettings.getString("GroupSound", string2);
            j = notificationsSettings.getLong("GroupSoundDocId", 0L);
        } else if (i2 == 1) {
            string = notificationsSettings.getString("GlobalSound", string2);
            j = notificationsSettings.getLong("GlobalSoundDocId", 0L);
        } else if (i2 == 3) {
            string = notificationsSettings.getString("StoriesSound", string2);
            j = notificationsSettings.getLong("StoriesSoundDocId", 0L);
        } else {
            string = notificationsSettings.getString("ChannelSound", string2);
            j = notificationsSettings.getLong("ChannelDocId", 0L);
        }
        if (j != 0) {
            TLRPC$Document document = getMediaDataController().ringtoneDataStore.getDocument(j);
            if (document == null) {
                return LocaleController.getString("CustomSound", R.string.CustomSound);
            }
            return NotificationsSoundActivity.trimTitle(document, FileLoader.getDocumentFileName(document));
        } else if (string.equals("NoSound")) {
            return LocaleController.getString("NoSound", R.string.NoSound);
        } else {
            return string.equals("Default") ? LocaleController.getString("SoundDefault", i) : string;
        }
    }

    private String getPriorityOption() {
        int i;
        int i2 = this.currentType;
        if (i2 == 0) {
            i = getNotificationsSettings().getInt("priority_group", 1);
        } else if (i2 == 1) {
            i = getNotificationsSettings().getInt("priority_messages", 1);
        } else if (i2 == 2) {
            i = getNotificationsSettings().getInt("priority_channel", 1);
        } else if (i2 == 3) {
            i = getNotificationsSettings().getInt("priority_stories", 1);
        } else {
            i = (i2 == 4 || i2 == 5) ? getNotificationsSettings().getInt("priority_react", 1) : 1;
        }
        int[] iArr = this.priorityOptions;
        return LocaleController.getString(iArr[Utilities.clamp(i, iArr.length - 1, 0)]);
    }

    @Override
    public View createView(final Context context) {
        this.searching = false;
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.currentType == -1) {
            this.actionBar.setTitle(LocaleController.getString("NotificationsExceptions", R.string.NotificationsExceptions));
        } else {
            this.actionBar.setTitle(LocaleController.getString("Notifications", R.string.Notifications));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    NotificationsCustomSettingsActivity.this.finishFragment();
                }
            }
        });
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList = this.exceptions;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.actionBar.createMenu().addItem(0, R.drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                @Override
                public void onSearchExpand() {
                    NotificationsCustomSettingsActivity.this.searching = true;
                    NotificationsCustomSettingsActivity.this.emptyView.setShowAtCenter(true);
                }

                @Override
                public void onSearchCollapse() {
                    NotificationsCustomSettingsActivity.this.searchAdapter.searchDialogs(null);
                    NotificationsCustomSettingsActivity.this.searching = false;
                    NotificationsCustomSettingsActivity.this.searchWas = false;
                    NotificationsCustomSettingsActivity.this.emptyView.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
                    NotificationsCustomSettingsActivity.this.listView.setAdapter(NotificationsCustomSettingsActivity.this.adapter);
                    NotificationsCustomSettingsActivity.this.adapter.notifyDataSetChanged();
                    NotificationsCustomSettingsActivity.this.listView.setFastScrollVisible(true);
                    NotificationsCustomSettingsActivity.this.listView.setVerticalScrollBarEnabled(false);
                    NotificationsCustomSettingsActivity.this.emptyView.setShowAtCenter(false);
                }

                @Override
                public void onTextChanged(EditText editText) {
                    if (NotificationsCustomSettingsActivity.this.searchAdapter == null) {
                        return;
                    }
                    String obj = editText.getText().toString();
                    if (obj.length() != 0) {
                        NotificationsCustomSettingsActivity.this.searchWas = true;
                        if (NotificationsCustomSettingsActivity.this.listView != null) {
                            NotificationsCustomSettingsActivity.this.emptyView.setText(LocaleController.getString("NoResult", R.string.NoResult));
                            NotificationsCustomSettingsActivity.this.emptyView.showProgress();
                            NotificationsCustomSettingsActivity.this.listView.setAdapter(NotificationsCustomSettingsActivity.this.searchAdapter);
                            NotificationsCustomSettingsActivity.this.searchAdapter.notifyDataSetChanged();
                            NotificationsCustomSettingsActivity.this.listView.setFastScrollVisible(false);
                            NotificationsCustomSettingsActivity.this.listView.setVerticalScrollBarEnabled(true);
                        }
                    }
                    NotificationsCustomSettingsActivity.this.searchAdapter.searchDialogs(obj);
                }
            }).setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setTextSize(18);
        this.emptyView.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.emptyView.showTextView();
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public void dispatchDraw(Canvas canvas) {
                if (NotificationsCustomSettingsActivity.this.currentType != -1) {
                    if (NotificationsCustomSettingsActivity.this.exceptionsStart >= 0) {
                        drawSectionBackground(canvas, NotificationsCustomSettingsActivity.this.exceptionsStart, NotificationsCustomSettingsActivity.this.exceptionsEnd, getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                    if (NotificationsCustomSettingsActivity.this.currentType != 4 && NotificationsCustomSettingsActivity.this.currentType != 5) {
                        drawSectionBackground(canvas, NotificationsCustomSettingsActivity.this.settingsStart, NotificationsCustomSettingsActivity.this.settingsEnd, getThemedColor(Theme.key_windowBackgroundWhite));
                    }
                }
                super.dispatchDraw(canvas);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setEmptyView(this.emptyView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView2 = this.listView;
        ListAdapter listAdapter = new ListAdapter(context);
        this.adapter = listAdapter;
        recyclerListView2.setAdapter(listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
            @Override
            public boolean hasDoubleTap(View view, int i) {
                return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
            }

            @Override
            public void onDoubleTap(View view, int i, float f, float f2) {
                RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
            }

            @Override
            public final void onItemClick(View view, int i, float f, float f2) {
                NotificationsCustomSettingsActivity.this.lambda$createView$17(context, view, i, f, f2);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            public void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
                NotificationsCustomSettingsActivity.this.listView.invalidate();
            }
        };
        defaultItemAnimator.setAddDuration(150L);
        defaultItemAnimator.setMoveDuration(350L);
        defaultItemAnimator.setChangeDuration(0L);
        defaultItemAnimator.setRemoveDuration(0L);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setMoveInterpolator(new OvershootInterpolator(1.1f));
        defaultItemAnimator.setTranslationInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AndroidUtilities.hideKeyboard(NotificationsCustomSettingsActivity.this.getParentActivity().getCurrentFocus());
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$17(android.content.Context r24, final android.view.View r25, final int r26, float r27, float r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.lambda$createView$17(android.content.Context, android.view.View, int, float, float):void");
    }

    public void lambda$createView$1(NotificationsSettingsActivity.NotificationException notificationException, View view, int i) {
        updateMute(notificationException, view, i, false, true);
    }

    public void lambda$createView$2(NotificationsSettingsActivity.NotificationException notificationException, View view, int i) {
        updateMute(notificationException, view, i, false, false);
    }

    public void lambda$createView$4(NotificationsSettingsActivity.NotificationException notificationException, View view, boolean z) {
        this.actionBar.closeSearchField();
        updateMute(notificationException, view, -1, z, true);
    }

    public void lambda$createView$5(NotificationsSettingsActivity.NotificationException notificationException, View view, boolean z) {
        this.actionBar.closeSearchField();
        updateMute(notificationException, view, -1, z, false);
    }

    public boolean lambda$createView$8(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, TopicsFragment topicsFragment) {
        int i = 0;
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (this.currentType == 3) {
            ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2 = this.autoExceptions;
            if (arrayList2 != null) {
                Iterator<NotificationsSettingsActivity.NotificationException> it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (it.next().did == j) {
                        it.remove();
                    }
                }
            }
            ArrayList<NotificationsSettingsActivity.NotificationException> arrayList3 = this.exceptions;
            if (arrayList3 != null) {
                Iterator<NotificationsSettingsActivity.NotificationException> it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (it2.next().did == j) {
                        it2.remove();
                    }
                }
            }
            NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
            notificationException.did = j;
            notificationException.story = true;
            Boolean bool = this.storiesEnabled;
            if (bool != null && bool.booleanValue()) {
                i = ConnectionsManager.DEFAULT_DATACENTER_ID;
            }
            notificationException.notify = i;
            if (this.exceptions == null) {
                this.exceptions = new ArrayList<>();
            }
            this.exceptions.add(notificationException);
            updateRows(true);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("dialog_id", j);
            bundle.putBoolean("exception", true);
            ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle, getResourceProvider());
            profileNotificationsActivity.setDelegate(new ProfileNotificationsActivity.ProfileNotificationsActivityDelegate() {
                @Override
                public final void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException2) {
                    NotificationsCustomSettingsActivity.this.lambda$createView$7(notificationException2);
                }

                @Override
                public void didRemoveException(long j2) {
                    ProfileNotificationsActivity.ProfileNotificationsActivityDelegate.CC.$default$didRemoveException(this, j2);
                }
            });
            presentFragment(profileNotificationsActivity, true);
        }
        return true;
    }

    public void lambda$createView$7(NotificationsSettingsActivity.NotificationException notificationException) {
        this.exceptions.add(0, notificationException);
        updateRows(true);
    }

    public void lambda$createView$9(DialogInterface dialogInterface, int i) {
        SharedPreferences.Editor edit = getNotificationsSettings().edit();
        int size = this.exceptions.size();
        for (int i2 = 0; i2 < size; i2++) {
            NotificationsSettingsActivity.NotificationException notificationException = this.exceptions.get(i2);
            if (this.currentType == 3) {
                edit.remove(NotificationsSettingsFacade.PROPERTY_STORIES_NOTIFY + notificationException.did);
            } else {
                SharedPreferences.Editor remove = edit.remove(NotificationsSettingsFacade.PROPERTY_NOTIFY + notificationException.did);
                remove.remove(NotificationsSettingsFacade.PROPERTY_CUSTOM + notificationException.did);
            }
            getMessagesStorage().setDialogFlags(notificationException.did, 0L);
            TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(notificationException.did);
            if (tLRPC$Dialog != null) {
                tLRPC$Dialog.notify_settings = new TLRPC$TL_peerNotifySettings();
            }
        }
        edit.commit();
        int size2 = this.exceptions.size();
        for (int i3 = 0; i3 < size2; i3++) {
            getNotificationsController().updateServerNotificationsSettings(this.exceptions.get(i3).did, this.topicId, false);
        }
        this.exceptions.clear();
        this.exceptionsDict.clear();
        updateRows(true);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.notificationsSettingsUpdated, new Object[0]);
    }

    public void lambda$createView$10(int i) {
        updateRows(true);
    }

    public void lambda$createView$11(View view, int i) {
        if (view instanceof TextColorCell) {
            if (i >= 0 && i < this.items.size()) {
                this.items.get(i).color = getLedColor();
            }
            ((TextColorCell) view).setTextAndColor(LocaleController.getString("LedColor", R.string.LedColor), getLedColor(), true);
            return;
        }
        updateRows(true);
    }

    public void lambda$createView$12(View view, int i) {
        if (view instanceof TextSettingsCell) {
            if (i >= 0 && i < this.items.size()) {
                this.items.get(i).text2 = getPopupOption();
            }
            TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            textSettingsCell.setTextAndValue(LocaleController.getString("PopupNotification", R.string.PopupNotification), getPopupOption(), true, textSettingsCell.needDivider);
            return;
        }
        updateRows(true);
    }

    public void lambda$createView$13(View view, String str, int i) {
        if (view instanceof TextSettingsCell) {
            String string = LocaleController.getString(this.vibrateLabels[Utilities.clamp(getNotificationsSettings().getInt(str, 0), this.vibrateLabels.length - 1, 0)]);
            if (i >= 0 && i < this.items.size()) {
                this.items.get(i).text2 = string;
            }
            ((TextSettingsCell) view).setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
            return;
        }
        updateRows(true);
    }

    public void lambda$createView$14(View view, int i) {
        if (view instanceof TextSettingsCell) {
            if (i >= 0 && i < this.items.size()) {
                this.items.get(i).text2 = getPriorityOption();
            }
            TextSettingsCell textSettingsCell = (TextSettingsCell) view;
            textSettingsCell.setTextAndValue(LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), getPriorityOption(), true, textSettingsCell.needDivider);
            return;
        }
        updateRows(true);
    }

    public static void lambda$createView$15(boolean[] zArr, int i, RadioColorCell[] radioColorCellArr, View view) {
        zArr[0] = i == 1;
        int i2 = 0;
        while (i2 < radioColorCellArr.length) {
            radioColorCellArr[i2].setChecked(zArr[0] == (i2 == 1), true);
            i2++;
        }
    }

    public void lambda$createView$16(SharedPreferences sharedPreferences, String str, boolean[] zArr, DialogInterface dialogInterface, int i) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putBoolean(str, zArr[0]);
        edit.apply();
        updateRows(true);
        getNotificationsController().updateServerNotificationsSettings(this.currentType);
    }

    public void checkRowsEnabled() {
        boolean isGlobalNotificationsEnabled;
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList;
        if (this.exceptions.isEmpty() || this.currentType == 3) {
            int childCount = this.listView.getChildCount();
            ArrayList<Animator> arrayList2 = new ArrayList<>();
            if (this.currentType == 3) {
                Boolean bool = this.storiesEnabled;
                isGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = this.exceptions) == null || arrayList.isEmpty());
            } else {
                isGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(this.currentType);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.getChildViewHolder(childAt);
                int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
                ItemInner itemInner = null;
                if (childAdapterPosition >= 0 && childAdapterPosition < this.items.size()) {
                    itemInner = this.items.get(childAdapterPosition);
                }
                boolean z = (itemInner == null || itemInner.id != 102) ? isGlobalNotificationsEnabled : true;
                int itemViewType = holder.getItemViewType();
                if (itemViewType == 0) {
                    ((HeaderCell) holder.itemView).setEnabled(z, arrayList2);
                } else if (itemViewType == 1) {
                    ((TextCheckCell) holder.itemView).setEnabled(z, arrayList2);
                } else if (itemViewType == 3) {
                    ((TextColorCell) holder.itemView).setEnabled(z, arrayList2);
                } else if (itemViewType == 5) {
                    ((TextSettingsCell) holder.itemView).setEnabled(z, arrayList2);
                }
            }
            if (arrayList2.isEmpty()) {
                return;
            }
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.playTogether(arrayList2);
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (animator.equals(NotificationsCustomSettingsActivity.this.animatorSet)) {
                        NotificationsCustomSettingsActivity.this.animatorSet = null;
                    }
                }
            });
            this.animatorSet.setDuration(150L);
            this.animatorSet.start();
        }
    }

    private void loadExceptions() {
        final ArrayList arrayList;
        if (this.currentType == 3) {
            MediaDataController.getInstance(this.currentAccount).loadHints(true);
            arrayList = new ArrayList(MediaDataController.getInstance(this.currentAccount).hints);
        } else {
            arrayList = null;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                NotificationsCustomSettingsActivity.this.lambda$loadExceptions$20(arrayList);
            }
        });
    }

    public void lambda$loadExceptions$20(java.util.ArrayList r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.lambda$loadExceptions$20(java.util.ArrayList):void");
    }

    public void lambda$loadExceptions$19(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8) {
        getMessagesController().putUsers(arrayList, true);
        getMessagesController().putChats(arrayList2, true);
        getMessagesController().putEncryptedChats(arrayList3, true);
        int i = this.currentType;
        if (i == 1) {
            this.exceptions = arrayList4;
        } else if (i == 0) {
            this.exceptions = arrayList5;
        } else if (i == 3) {
            this.exceptions = arrayList6;
            this.autoExceptions = arrayList7;
        } else {
            this.exceptions = arrayList8;
        }
        updateRows(true);
    }

    public void updateRows(boolean z) {
        ArrayList<NotificationsSettingsActivity.NotificationException> arrayList;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        Boolean bool;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        if (this.currentType != -1) {
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.NotifyMeAbout)));
            int i5 = this.currentType;
            if (i5 == 3) {
                this.items.add(ItemInner.asCheck(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.items.add(ItemInner.asCheck(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, LocaleController.getString(R.string.NotifyMeAboutImportantStories), this.storiesAuto && ((bool = this.storiesEnabled) == null || !bool.booleanValue())));
                }
                this.items.add(ItemInner.asShadow(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i5 == 4 || i5 == 5) {
                ArrayList<ItemInner> arrayList2 = this.items;
                int i6 = R.drawable.msg_markunread;
                String string = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i = R.string.NotifyFromContacts;
                } else {
                    i = R.string.NotifyFromEveryone;
                }
                arrayList2.add(ItemInner.asCheck2(R.styleable.AppCompatTheme_textAppearanceListItem, i6, string, LocaleController.getString(i), notificationsSettings.getBoolean("EnableReactionsMessages", true)));
                ArrayList<ItemInner> arrayList3 = this.items;
                int i7 = R.drawable.msg_stories_saved;
                String string2 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i2 = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i2 = R.string.NotifyFromContacts;
                } else {
                    i2 = R.string.NotifyFromEveryone;
                }
                arrayList3.add(ItemInner.asCheck2(R.styleable.AppCompatTheme_textAppearanceListItemSecondary, i7, string2, LocaleController.getString(i2), notificationsSettings.getBoolean("EnableReactionsStories", true)));
                this.items.add(ItemInner.asShadow(-1, null));
            } else {
                if (i5 == 1) {
                    i3 = R.string.NotifyMeAboutPrivate;
                } else if (i5 == 0) {
                    i3 = R.string.NotifyMeAboutGroups;
                } else {
                    i3 = R.string.NotifyMeAboutChannels;
                }
                this.items.add(ItemInner.asCheck(100, LocaleController.getString(i3), getNotificationsController().isGlobalNotificationsEnabled(this.currentType)));
                this.items.add(ItemInner.asShadow(-1, null));
            }
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.SETTINGS)));
            this.settingsStart = this.items.size() - 1;
            int i8 = this.currentType;
            if (i8 == 3) {
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i8 == 4 || i8 == 5) {
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                if (i8 == 0) {
                    z2 = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                } else if (i8 == 1) {
                    z2 = notificationsSettings.getBoolean("EnablePreviewAll", true);
                } else {
                    z2 = i8 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true);
                }
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.MessagePreview), z2));
            }
            this.items.add(ItemInner.asSetting(3, LocaleController.getString("Sound", R.string.Sound), getSound()));
            if (this.expanded) {
                this.items.add(ItemInner.asColor(LocaleController.getString("LedColor", R.string.LedColor), getLedColor()));
                int i9 = this.currentType;
                if (i9 == 0) {
                    i4 = notificationsSettings.getInt("vibrate_group", 0);
                } else if (i9 == 1) {
                    i4 = notificationsSettings.getInt("vibrate_messages", 0);
                } else if (i9 == 2) {
                    i4 = notificationsSettings.getInt("vibrate_channel", 0);
                } else if (i9 == 3) {
                    i4 = notificationsSettings.getInt("vibrate_stories", 0);
                } else {
                    i4 = (i9 == 4 || i9 == 5) ? notificationsSettings.getInt("vibrate_react", 0) : 0;
                }
                ArrayList<ItemInner> arrayList4 = this.items;
                String string3 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.vibrateLabels;
                arrayList4.add(ItemInner.asSetting(1, string3, LocaleController.getString(iArr[Utilities.clamp(i4, iArr.length - 1, 0)])));
                int i10 = this.currentType;
                if (i10 == 1 || i10 == 0) {
                    this.items.add(ItemInner.asSetting(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), getPopupOption()));
                }
                if (Build.VERSION.SDK_INT >= 21) {
                    this.items.add(ItemInner.asSetting(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), getPriorityOption()));
                }
                this.items.add(ItemInner.asExpand(LocaleController.getString(R.string.NotifyLessOptions), false));
            } else {
                this.items.add(ItemInner.asExpand(LocaleController.getString(R.string.NotifyMoreOptions), true));
            }
            this.settingsEnd = this.items.size() - 1;
            this.items.add(ItemInner.asShadow(-2, null));
        }
        int i11 = this.currentType;
        if (i11 != 4 && i11 != 5) {
            if (i11 != -1) {
                this.items.add(ItemInner.asButton(6, R.drawable.msg_contact_add, LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException)));
            }
            this.exceptionsStart = this.items.size() - 1;
            if (this.autoExceptions != null && this.showAutoExceptions) {
                for (int i12 = 0; i12 < this.autoExceptions.size(); i12++) {
                    this.items.add(ItemInner.asException(this.autoExceptions.get(i12)));
                }
            }
            if (this.exceptions != null) {
                for (int i13 = 0; i13 < this.exceptions.size(); i13++) {
                    this.items.add(ItemInner.asException(this.exceptions.get(i13)));
                }
            }
            this.exceptionsEnd = this.items.size() - 1;
            if (this.currentType != -1 || ((arrayList = this.exceptions) != null && !arrayList.isEmpty())) {
                this.items.add(ItemInner.asShadow(-3, null));
            }
            ArrayList<NotificationsSettingsActivity.NotificationException> arrayList5 = this.exceptions;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.items.add(ItemInner.asButton(7, 0, LocaleController.getString("NotificationsDeleteAllException", R.string.NotificationsDeleteAllException)));
            }
        } else {
            this.exceptionsStart = -1;
            this.exceptionsEnd = -1;
        }
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            if (z) {
                listAdapter.setItems(this.oldItems, this.items);
            } else {
                listAdapter.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void onBecomeFullyVisible() {
        super.onBecomeFullyVisible();
        updateRows(true);
    }

    @Override
    public void onActivityResultFragment(int i, int i2, Intent intent) {
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            String str = null;
            if (uri != null && (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) != null) {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    str = LocaleController.getString("SoundDefault", R.string.SoundDefault);
                } else {
                    str = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor edit = getNotificationsSettings().edit();
            int i3 = this.currentType;
            if (i3 == 1) {
                if (str != null && uri != null) {
                    edit.putString("GlobalSound", str);
                    edit.putString("GlobalSoundPath", uri.toString());
                } else {
                    edit.putString("GlobalSound", "NoSound");
                    edit.putString("GlobalSoundPath", "NoSound");
                }
            } else if (i3 == 0) {
                if (str != null && uri != null) {
                    edit.putString("GroupSound", str);
                    edit.putString("GroupSoundPath", uri.toString());
                } else {
                    edit.putString("GroupSound", "NoSound");
                    edit.putString("GroupSoundPath", "NoSound");
                }
            } else if (i3 == 2) {
                if (str != null && uri != null) {
                    edit.putString("ChannelSound", str);
                    edit.putString("ChannelSoundPath", uri.toString());
                } else {
                    edit.putString("ChannelSound", "NoSound");
                    edit.putString("ChannelSoundPath", "NoSound");
                }
            } else if (i3 == 3) {
                if (str != null && uri != null) {
                    edit.putString("StoriesSound", str);
                    edit.putString("StoriesSoundPath", uri.toString());
                } else {
                    edit.putString("StoriesSound", "NoSound");
                    edit.putString("StoriesSoundPath", "NoSound");
                }
            }
            getNotificationsController().deleteNotificationChannelGlobal(this.currentType);
            edit.commit();
            getNotificationsController().updateServerNotificationsSettings(this.currentType);
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition != null) {
                this.adapter.onBindViewHolder(findViewHolderForAdapterPosition, i);
            }
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.adapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        getNotificationCenter().addObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().addObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public void onPause() {
        super.onPause();
        getNotificationCenter().removeObserver(this, NotificationCenter.notificationsSettingsUpdated);
        getNotificationCenter().removeObserver(this, NotificationCenter.reloadHints);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.notificationsSettingsUpdated) {
            ListAdapter listAdapter = this.adapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.reloadHints) {
            loadExceptions();
        }
    }

    public class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private ArrayList<NotificationsSettingsActivity.NotificationException> searchResult = new ArrayList<>();
        private ArrayList<CharSequence> searchResultNames = new ArrayList<>();
        private Runnable searchRunnable;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public SearchAdapter(Context context) {
            this.mContext = context;
            SearchAdapterHelper searchAdapterHelper = new SearchAdapterHelper(true);
            this.searchAdapterHelper = searchAdapterHelper;
            searchAdapterHelper.setDelegate(new SearchAdapterHelper.SearchAdapterHelperDelegate() {
                @Override
                public boolean canApplySearchResults(int i) {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$canApplySearchResults(this, i);
                }

                @Override
                public LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public final void onDataSetChanged(int i) {
                    NotificationsCustomSettingsActivity.SearchAdapter.this.lambda$new$0(i);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap hashMap) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, hashMap);
                }
            });
        }

        public void lambda$new$0(int i) {
            if (this.searchRunnable == null && !this.searchAdapterHelper.isSearchInProgress()) {
                NotificationsCustomSettingsActivity.this.emptyView.showTextView();
            }
            notifyDataSetChanged();
        }

        public void searchDialogs(final String str) {
            if (this.searchRunnable != null) {
                Utilities.searchQueue.cancelRunnable(this.searchRunnable);
                this.searchRunnable = null;
            }
            if (str == null) {
                this.searchResult.clear();
                this.searchResultNames.clear();
                this.searchAdapterHelper.mergeResults(null);
                this.searchAdapterHelper.queryServerSearch(null, true, (NotificationsCustomSettingsActivity.this.currentType == 1 || NotificationsCustomSettingsActivity.this.currentType == 3) ? false : true, true, false, false, 0L, false, 0, 0);
                notifyDataSetChanged();
                return;
            }
            DispatchQueue dispatchQueue = Utilities.searchQueue;
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    NotificationsCustomSettingsActivity.SearchAdapter.this.lambda$searchDialogs$1(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        public void lambda$searchDialogs$1(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsCustomSettingsActivity.SearchAdapter.this.lambda$processSearch$3(str);
                }
            });
        }

        public void lambda$processSearch$3(final String str) {
            this.searchAdapterHelper.queryServerSearch(str, true, (NotificationsCustomSettingsActivity.this.currentType == 1 || NotificationsCustomSettingsActivity.this.currentType == 3) ? false : true, true, false, false, 0L, false, 0, 0);
            final ArrayList arrayList = new ArrayList(NotificationsCustomSettingsActivity.this.exceptions);
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    NotificationsCustomSettingsActivity.SearchAdapter.this.lambda$processSearch$2(str, arrayList);
                }
            });
        }

        public void lambda$processSearch$2(java.lang.String r20, java.util.ArrayList r21) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.NotificationsCustomSettingsActivity.SearchAdapter.lambda$processSearch$2(java.lang.String, java.util.ArrayList):void");
        }

        private void updateSearchResults(final ArrayList<Object> arrayList, final ArrayList<NotificationsSettingsActivity.NotificationException> arrayList2, final ArrayList<CharSequence> arrayList3) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    NotificationsCustomSettingsActivity.SearchAdapter.this.lambda$updateSearchResults$4(arrayList2, arrayList3, arrayList);
                }
            });
        }

        public void lambda$updateSearchResults$4(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
            if (NotificationsCustomSettingsActivity.this.searching) {
                this.searchRunnable = null;
                this.searchResult = arrayList;
                this.searchResultNames = arrayList2;
                this.searchAdapterHelper.mergeResults(arrayList3);
                if (NotificationsCustomSettingsActivity.this.searching && !this.searchAdapterHelper.isSearchInProgress()) {
                    NotificationsCustomSettingsActivity.this.emptyView.showTextView();
                }
                notifyDataSetChanged();
            }
        }

        public Object getObject(int i) {
            if (i >= 0 && i < this.searchResult.size()) {
                return this.searchResult.get(i);
            }
            int size = i - (this.searchResult.size() + 1);
            ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
            if (size < 0 || size >= globalSearch.size()) {
                return null;
            }
            return this.searchAdapterHelper.getGlobalSearch().get(size);
        }

        @Override
        public int getItemCount() {
            int size = this.searchResult.size();
            ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
            return !globalSearch.isEmpty() ? size + globalSearch.size() + 1 : size;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            if (i == 0) {
                userCell = new UserCell(this.mContext, 4, 0, false, true);
                userCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
            } else {
                userCell = new GraySectionCell(this.mContext);
            }
            return new RecyclerListView.Holder(userCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType != 0) {
                if (itemViewType != 1) {
                    return;
                }
                ((GraySectionCell) viewHolder.itemView).setText(LocaleController.getString("AddToExceptions", R.string.AddToExceptions));
                return;
            }
            UserCell userCell = (UserCell) viewHolder.itemView;
            if (i < this.searchResult.size()) {
                userCell.setException(this.searchResult.get(i), this.searchResultNames.get(i), i != this.searchResult.size() - 1);
                userCell.setAddButtonVisible(false);
                return;
            }
            int size = i - (this.searchResult.size() + 1);
            ArrayList<TLObject> globalSearch = this.searchAdapterHelper.getGlobalSearch();
            userCell.setData(globalSearch.get(size), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), 0, size != globalSearch.size() - 1);
            userCell.setAddButtonVisible(true);
        }

        @Override
        public int getItemViewType(int i) {
            return i == this.searchResult.size() ? 1 : 0;
        }
    }

    public static class ItemInner extends AdapterWithDiffUtils.Item {
        public boolean checked;
        public int color;
        public NotificationsSettingsActivity.NotificationException exception;
        public int id;
        public int resId;
        public CharSequence text;
        public CharSequence text2;

        private ItemInner(int i) {
            super(i, true);
        }

        public static ItemInner asHeader(CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(0);
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asCheck(int i, CharSequence charSequence, boolean z) {
            ItemInner itemInner = new ItemInner(1);
            itemInner.id = i;
            itemInner.text = charSequence;
            itemInner.checked = z;
            return itemInner;
        }

        public static ItemInner asCheck2(int i, int i2, CharSequence charSequence, CharSequence charSequence2, boolean z) {
            ItemInner itemInner = new ItemInner(6);
            itemInner.id = i;
            itemInner.resId = i2;
            itemInner.text = charSequence;
            itemInner.text2 = charSequence2;
            itemInner.checked = z;
            return itemInner;
        }

        public static ItemInner asException(NotificationsSettingsActivity.NotificationException notificationException) {
            ItemInner itemInner = new ItemInner(2);
            itemInner.exception = notificationException;
            return itemInner;
        }

        public static ItemInner asColor(CharSequence charSequence, int i) {
            ItemInner itemInner = new ItemInner(3);
            itemInner.text = charSequence;
            itemInner.color = i;
            return itemInner;
        }

        public static ItemInner asShadow(int i, CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(4);
            itemInner.id = i;
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asSetting(int i, CharSequence charSequence, CharSequence charSequence2) {
            ItemInner itemInner = new ItemInner(5);
            itemInner.id = i;
            itemInner.text = charSequence;
            itemInner.text2 = charSequence2;
            return itemInner;
        }

        public static ItemInner asButton(int i, int i2, CharSequence charSequence) {
            ItemInner itemInner = new ItemInner(7);
            itemInner.id = i;
            itemInner.resId = i2;
            itemInner.text = charSequence;
            return itemInner;
        }

        public static ItemInner asExpand(CharSequence charSequence, boolean z) {
            ItemInner itemInner = new ItemInner(8);
            itemInner.text = charSequence;
            itemInner.resId = z ? 1 : 0;
            return itemInner;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || ItemInner.class != obj.getClass()) {
                return false;
            }
            ItemInner itemInner = (ItemInner) obj;
            return this.id == itemInner.id && this.color == itemInner.color && (this.viewType == 8 || (this.resId == itemInner.resId && Objects.equals(this.text, itemInner.text) && (this.viewType == 6 || Objects.equals(this.text2, itemInner.text2)))) && this.exception == itemInner.exception;
        }

        @Override
        public boolean contentsEquals(AdapterWithDiffUtils.Item item) {
            if (this == item) {
                return true;
            }
            if (item == null || ItemInner.class != item.getClass()) {
                return false;
            }
            ItemInner itemInner = (ItemInner) item;
            return this.id == itemInner.id && this.resId == itemInner.resId && this.color == itemInner.color && this.checked == itemInner.checked && Objects.equals(this.text, itemInner.text) && Objects.equals(this.text2, itemInner.text2) && this.exception == itemInner.exception;
        }
    }

    public class ListAdapter extends AdapterWithDiffUtils {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return (itemViewType == 0 || itemViewType == 4) ? false : true;
        }

        @Override
        public int getItemCount() {
            return NotificationsCustomSettingsActivity.this.items.size();
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View headerCell;
            switch (i) {
                case 0:
                    headerCell = new HeaderCell(this.mContext);
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    break;
                case 1:
                    headerCell = new TextCheckCell(this.mContext);
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    break;
                case 2:
                    headerCell = new UserCell(this.mContext, 6, 0, false);
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    break;
                case 3:
                    headerCell = new TextColorCell(this.mContext);
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    break;
                case 4:
                    headerCell = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 5:
                    headerCell = new TextSettingsCell(this.mContext);
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    break;
                case 6:
                    headerCell = new NotificationsCheckCell(this.mContext, 21, 64, true, ((BaseFragment) NotificationsCustomSettingsActivity.this).resourceProvider);
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    break;
                case 7:
                default:
                    headerCell = new TextCell(this.mContext);
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    break;
                case 8:
                    headerCell = new ExpandView(NotificationsCustomSettingsActivity.this, this.mContext);
                    headerCell.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundWhite));
                    break;
            }
            return new RecyclerListView.Holder(headerCell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            if (i < 0 || i >= NotificationsCustomSettingsActivity.this.items.size()) {
                return;
            }
            ItemInner itemInner = (ItemInner) NotificationsCustomSettingsActivity.this.items.get(i);
            int i2 = i + 1;
            boolean z = i2 < NotificationsCustomSettingsActivity.this.items.size() && ((ItemInner) NotificationsCustomSettingsActivity.this.items.get(i2)).viewType != 4;
            switch (viewHolder.getItemViewType()) {
                case 0:
                    ((HeaderCell) viewHolder.itemView).setText(itemInner.text);
                    return;
                case 1:
                    ((TextCheckCell) viewHolder.itemView).setTextAndCheck("" + ((Object) itemInner.text), itemInner.checked, z);
                    return;
                case 2:
                    ((UserCell) viewHolder.itemView).setException(itemInner.exception, null, z);
                    return;
                case 3:
                    ((TextColorCell) viewHolder.itemView).setTextAndColor("" + ((Object) itemInner.text), itemInner.color, z);
                    return;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (itemInner.text == null) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText(null);
                    } else {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner.text);
                    }
                    if (!z) {
                        viewHolder.itemView.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider_bottom, Theme.key_windowBackgroundGrayShadow));
                        return;
                    } else {
                        viewHolder.itemView.setBackground(Theme.getThemedDrawableByKey(this.mContext, R.drawable.greydivider, Theme.key_windowBackgroundGrayShadow));
                        return;
                    }
                case 5:
                    ((TextSettingsCell) viewHolder.itemView).setTextAndValue(itemInner.text, itemInner.text2, z);
                    return;
                case 6:
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                    notificationsCheckCell.setDrawLine(true);
                    notificationsCheckCell.setChecked(itemInner.checked);
                    notificationsCheckCell.setTextAndValueAndIconAndCheck(itemInner.text, itemInner.text2, itemInner.resId, itemInner.checked, 0, false, z, true);
                    return;
                case 7:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (itemInner.resId == 0) {
                        textCell.setColors(-1, Theme.key_text_RedRegular);
                        textCell.setText("" + ((Object) itemInner.text), z);
                        return;
                    }
                    textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    textCell.setTextAndIcon("" + ((Object) itemInner.text), itemInner.resId, z);
                    return;
                case 8:
                    ExpandView expandView = (ExpandView) viewHolder.itemView;
                    expandView.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    expandView.set(itemInner.text, itemInner.resId == 1, z);
                    return;
                default:
                    return;
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            if (NotificationsCustomSettingsActivity.this.currentType == 3 || (NotificationsCustomSettingsActivity.this.exceptions != null && NotificationsCustomSettingsActivity.this.exceptions.isEmpty())) {
                boolean isGlobalNotificationsEnabled = NotificationsCustomSettingsActivity.this.currentType == 3 ? NotificationsCustomSettingsActivity.this.storiesEnabled == null || NotificationsCustomSettingsActivity.this.storiesEnabled.booleanValue() || !(NotificationsCustomSettingsActivity.this.exceptions == null || NotificationsCustomSettingsActivity.this.exceptions.isEmpty()) : NotificationsCustomSettingsActivity.this.getNotificationsController().isGlobalNotificationsEnabled(NotificationsCustomSettingsActivity.this.currentType);
                int adapterPosition = viewHolder.getAdapterPosition();
                ItemInner itemInner = (adapterPosition < 0 || adapterPosition >= NotificationsCustomSettingsActivity.this.items.size()) ? null : (ItemInner) NotificationsCustomSettingsActivity.this.items.get(adapterPosition);
                if (itemInner == null || itemInner.id != 102) {
                    int itemViewType = viewHolder.getItemViewType();
                    if (itemViewType == 0) {
                        ((HeaderCell) viewHolder.itemView).setEnabled(isGlobalNotificationsEnabled, null);
                    } else if (itemViewType == 1) {
                        ((TextCheckCell) viewHolder.itemView).setEnabled(isGlobalNotificationsEnabled, null);
                    } else if (itemViewType == 3) {
                        ((TextColorCell) viewHolder.itemView).setEnabled(isGlobalNotificationsEnabled, null);
                    } else if (itemViewType != 5) {
                    } else {
                        ((TextSettingsCell) viewHolder.itemView).setEnabled(isGlobalNotificationsEnabled, null);
                    }
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i < 0 || i >= NotificationsCustomSettingsActivity.this.items.size()) {
                return 5;
            }
            return ((ItemInner) NotificationsCustomSettingsActivity.this.items.get(i)).viewType;
        }
    }

    public class ExpandView extends TextCell {
        public ImageView imageView;

        public ExpandView(NotificationsCustomSettingsActivity notificationsCustomSettingsActivity, Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(notificationsCustomSettingsActivity.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
            this.imageView.setImageResource(R.drawable.msg_expand);
            addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.imageView.measure(i, i2);
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int dp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i3 - i) - AndroidUtilities.dp(41.0f);
            int dp2 = ((i4 - i2) - AndroidUtilities.dp(24.0f)) / 2;
            this.imageView.layout(dp, dp2, AndroidUtilities.dp(24.0f) + dp, AndroidUtilities.dp(24.0f) + dp2);
        }

        public void set(CharSequence charSequence, boolean z, boolean z2) {
            setArrow(z, true);
            setText(charSequence, z2);
        }

        public void setArrow(boolean z, boolean z2) {
            if (z2) {
                this.imageView.animate().rotation(z ? 0.0f : 180.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(340L).start();
            } else {
                this.imageView.setRotation(z ? 0.0f : 180.0f);
            }
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                NotificationsCustomSettingsActivity.this.lambda$getThemeDescriptions$21();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, TextCheckCell.class, TextColorCell.class, TextSettingsCell.class, UserCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        ActionBar actionBar = this.actionBar;
        int i = ThemeDescription.FLAG_BACKGROUND;
        int i2 = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, i, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i3 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        int i5 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        int i6 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteGrayText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"statusOnlineColor"}, (Paint[]) null, (Drawable[]) null, themeDescriptionDelegate, Theme.key_windowBackgroundWhiteBlueText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, null, Theme.avatarDrawables, null, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{GraySectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_graySectionText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{GraySectionCell.class}, null, null, null, Theme.key_graySection));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i6));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextColorCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_text_RedRegular));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{TextCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueIcon));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$21() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView != null) {
            int childCount = recyclerListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.listView.getChildAt(i);
                if (childAt instanceof UserCell) {
                    ((UserCell) childAt).update(0);
                }
            }
        }
    }
}
