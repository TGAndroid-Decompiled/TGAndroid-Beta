package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.media.Ringtone;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.function.ToDoubleFunction;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.SearchAdapterHelper;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.NotificationsCheckCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextCheckCell;
import org.telegram.ui.Cells.TextColorCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Cells.UserCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatNotificationsPopupWrapper;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ListView.AdapterWithDiffUtils;
import org.telegram.ui.Components.RecyclerListView;

public class NotificationsCustomSettingsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private ListAdapter adapter;
    public int addExceptionRow;
    private AnimatorSet animatorSet;
    private ArrayList autoExceptions;
    private int currentType;
    public int deleteExceptionsRow;
    private EmptyTextProgressView emptyView;
    private ArrayList exceptions;
    private HashMap exceptionsDict;
    private int exceptionsEnd;
    private int exceptionsStart;
    public boolean expanded;
    public int importantRow;
    private final ArrayList items;
    public int lightColorRow;
    private RecyclerListView listView;
    public int messagesRow;
    public int newRow;
    private final ArrayList oldItems;
    private final int[] popupOptions;
    public int popupRow;
    public int previewRow;
    private final int[] priorityOptions;
    public int priorityRow;
    private SearchAdapter searchAdapter;
    private boolean searchWas;
    private boolean searching;
    private int settingsEnd;
    private int settingsStart;
    private boolean showAutoExceptions;
    public int showRow;
    public int showSenderRow;
    public int soundRow;
    private boolean storiesAuto;
    private Boolean storiesEnabled;
    public int storiesRow;
    int topicId;
    private final int[] vibrateLabels;
    public int vibrateRow;

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public void toggleShowAutoExceptions() {
        if (this.listView == null || this.adapter == null) {
            return;
        }
        this.showAutoExceptions = !this.showAutoExceptions;
        updateRows(true);
    }

    public NotificationsCustomSettingsActivity(int i, ArrayList arrayList, ArrayList arrayList2) {
        this(i, arrayList, arrayList2, false);
    }

    public NotificationsCustomSettingsActivity(int i, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.showAutoExceptions = true;
        this.exceptionsDict = new HashMap();
        this.topicId = 0;
        this.vibrateLabels = new int[]{R.string.VibrationDefault, R.string.Short, R.string.VibrationDisabled, R.string.Long, R.string.OnlyIfSilent};
        this.popupOptions = new int[]{R.string.NoPopup, R.string.OnlyWhenScreenOn, R.string.OnlyWhenScreenOff, R.string.AlwaysShowPopup};
        int i2 = R.string.NotificationsPriorityHigh;
        int i3 = R.string.NotificationsPriorityUrgent;
        int i4 = R.string.NotificationsPriorityMedium;
        this.priorityOptions = new int[]{i2, i3, i3, i4, R.string.NotificationsPriorityLow, i4};
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.vibrateRow = -1;
        this.popupRow = -1;
        this.priorityRow = -1;
        this.oldItems = new ArrayList();
        this.items = new ArrayList();
        this.currentType = i;
        this.autoExceptions = arrayList2;
        this.exceptions = arrayList;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i5 = 0; i5 < size; i5++) {
                NotificationsSettingsActivity.NotificationException notificationException = (NotificationsSettingsActivity.NotificationException) this.exceptions.get(i5);
                this.exceptionsDict.put(Long.valueOf(notificationException.did), notificationException);
            }
        }
        ArrayList arrayList3 = this.autoExceptions;
        if (arrayList3 != null) {
            int size2 = arrayList3.size();
            for (int i6 = 0; i6 < size2; i6++) {
                NotificationsSettingsActivity.NotificationException notificationException2 = (NotificationsSettingsActivity.NotificationException) this.autoExceptions.get(i6);
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
                return ((TLRPC.TL_topPeer) obj).rating;
            }
        }));
        int i2 = -1;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(i3)).peer) == j) {
                i2 = i3;
            }
        }
        return i2 >= 0 && i2 >= arrayList.size() + (-5);
    }

    public static boolean areStoriesNotMuted(int i, long j) {
        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(i);
        if (notificationsSettings.contains("stories_" + j)) {
            return notificationsSettings.getBoolean("stories_" + j, true);
        }
        if (notificationsSettings.contains("EnableAllStories")) {
            return notificationsSettings.getBoolean("EnableAllStories", true);
        }
        return isTop5Peer(i, j);
    }

    public void lambda$createView$6(NotificationsSettingsActivity.NotificationException notificationException, View view, int i) {
        String sharedPrefKey = NotificationsController.getSharedPrefKey(notificationException.did, 0L);
        getNotificationsSettings().edit().remove("stories_" + sharedPrefKey).commit();
        ArrayList arrayList = this.autoExceptions;
        if (arrayList != null) {
            arrayList.remove(notificationException);
        }
        ArrayList arrayList2 = this.exceptions;
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
        Boolean bool;
        Boolean bool2;
        String sharedPrefKey = NotificationsController.getSharedPrefKey(notificationException.did, 0L);
        SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
        boolean zIsTop5Peer = isTop5Peer(this.currentAccount, notificationException.did);
        notificationException.notify = z2 ? Integer.MAX_VALUE : 0;
        if (notificationException.auto) {
            notificationException.auto = false;
            editorEdit.putBoolean("stories_" + sharedPrefKey, !z2).commit();
            ArrayList arrayList = this.autoExceptions;
            if (arrayList != null) {
                arrayList.remove(notificationException);
            }
            if (this.exceptions == null) {
                this.exceptions = new ArrayList();
            }
            this.exceptions.add(0, notificationException);
        } else if (zIsTop5Peer) {
            editorEdit.putBoolean("stories_" + sharedPrefKey, !z2).commit();
        } else {
            if (!z2 ? !((bool = this.storiesEnabled) == null || !bool.booleanValue()) : !((bool2 = this.storiesEnabled) != null && bool2.booleanValue())) {
                lambda$createView$6(notificationException, view, i);
                return;
            }
            editorEdit.putBoolean("stories_" + sharedPrefKey, !z2).commit();
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
        } else if (i2 == 4 || i2 == 5) {
            string = notificationsSettings.getString("ReactionSound", string2);
            j = notificationsSettings.getLong("ReactionSoundDocId", 0L);
        } else {
            string = notificationsSettings.getString("ChannelSound", string2);
            j = notificationsSettings.getLong("ChannelDocId", 0L);
        }
        if (j != 0) {
            TLRPC.Document document = getMediaDataController().ringtoneDataStore.getDocument(j);
            if (document == null) {
                return LocaleController.getString("CustomSound", R.string.CustomSound);
            }
            return NotificationsSoundActivity.trimTitle(document, FileLoader.getDocumentFileName(document));
        }
        if (string.equals("NoSound")) {
            return LocaleController.getString("NoSound", R.string.NoSound);
        }
        return string.equals("Default") ? LocaleController.getString("SoundDefault", i) : string;
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
        this.searchWas = false;
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
        ArrayList arrayList = this.exceptions;
        if (arrayList != null && !arrayList.isEmpty()) {
            this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
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
                    String string = editText.getText().toString();
                    if (string.length() != 0) {
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
                    NotificationsCustomSettingsActivity.this.searchAdapter.searchDialogs(string);
                }
            }).setSearchFieldHint(LocaleController.getString("Search", R.string.Search));
        }
        this.searchAdapter = new SearchAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(Theme.key_windowBackgroundGray));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setTextSize(18);
        this.emptyView.setText(LocaleController.getString("NoExceptions", R.string.NoExceptions));
        this.emptyView.showTextView();
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
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
                this.f$0.lambda$createView$17(context, view, i, f, f2);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected void onMoveAnimationUpdate(RecyclerView.ViewHolder viewHolder) {
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

    public void lambda$createView$17(Context context, final View view, final int i, float f, float f2) {
        final NotificationsSettingsActivity.NotificationException notificationException;
        final ArrayList arrayList;
        final boolean z;
        long j;
        NotificationsSettingsActivity.NotificationException notificationException2;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        long j2;
        final NotificationsSettingsActivity.NotificationException notificationException3;
        final boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        final NotificationsSettingsActivity.NotificationException notificationException4;
        if (getParentActivity() == null) {
            return;
        }
        ItemInner itemInner = (this.listView.getAdapter() != this.adapter || i < 0 || i >= this.items.size()) ? null : (ItemInner) this.items.get(i);
        if (itemInner != null && itemInner.viewType == 8) {
            this.expanded = !this.expanded;
            updateRows(true);
            return;
        }
        int i2 = this.currentType;
        if (i2 == 3 && itemInner != null && (notificationException4 = itemInner.exception) != null) {
            ItemOptions.makeOptions(this, view).setGravity(3).addIf(notificationException4.notify <= 0 || notificationException4.auto, R.drawable.msg_mute, (CharSequence) LocaleController.getString(R.string.NotificationsStoryMute), false, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$1(notificationException4, view, i);
                }
            }).addIf(notificationException4.notify > 0 || notificationException4.auto, R.drawable.msg_unmute, (CharSequence) LocaleController.getString(R.string.NotificationsStoryUnmute), false, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$2(notificationException4, view, i);
                }
            }).addIf(!notificationException4.auto, R.drawable.msg_delete, (CharSequence) LocaleController.getString("DeleteException", R.string.DeleteException), true, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$3(notificationException4, view, i);
                }
            }).setScrimViewBackground(this.listView.getClipBackground(view)).show();
            return;
        }
        if (i2 == 3) {
            RecyclerView.Adapter adapter = this.listView.getAdapter();
            SearchAdapter searchAdapter = this.searchAdapter;
            if (adapter == searchAdapter) {
                Object object = searchAdapter.getObject(i);
                if (object instanceof NotificationsSettingsActivity.NotificationException) {
                    notificationException3 = (NotificationsSettingsActivity.NotificationException) object;
                } else {
                    boolean z9 = object instanceof TLRPC.User;
                    if (z9) {
                        j2 = ((TLRPC.User) object).id;
                    } else {
                        j2 = -((TLRPC.Chat) object).id;
                    }
                    if (this.exceptionsDict.containsKey(Long.valueOf(j2))) {
                        notificationException3 = (NotificationsSettingsActivity.NotificationException) this.exceptionsDict.get(Long.valueOf(j2));
                    } else {
                        NotificationsSettingsActivity.NotificationException notificationException5 = new NotificationsSettingsActivity.NotificationException();
                        notificationException5.story = true;
                        notificationException5.did = j2;
                        if (z9) {
                            notificationException5.did = ((TLRPC.User) object).id;
                        } else {
                            notificationException5.did = -((TLRPC.Chat) object).id;
                        }
                        notificationException3 = notificationException5;
                        z5 = true;
                    }
                    if (notificationException3 == null) {
                        return;
                    }
                    ItemOptions gravity = ItemOptions.makeOptions(this, view).setGravity(3);
                    if (notificationException3.notify > 0 || notificationException3.auto) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    ItemOptions itemOptionsAddIf = gravity.addIf(z6, R.drawable.msg_mute, (CharSequence) LocaleController.getString(R.string.NotificationsStoryMute), false, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$createView$4(notificationException3, view, z5);
                        }
                    });
                    if (notificationException3.notify <= 0 || notificationException3.auto) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    ItemOptions itemOptionsAddIf2 = itemOptionsAddIf.addIf(z7, R.drawable.msg_unmute, (CharSequence) LocaleController.getString(R.string.NotificationsStoryUnmute), false, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$createView$5(notificationException3, view, z5);
                        }
                    });
                    if (!z5 || notificationException3.auto) {
                        z8 = false;
                    } else {
                        z8 = true;
                    }
                    itemOptionsAddIf2.addIf(z8, R.drawable.msg_delete, (CharSequence) LocaleController.getString("DeleteException", R.string.DeleteException), true, new Runnable() {
                        @Override
                        public final void run() {
                            this.f$0.lambda$createView$6(notificationException3, view, i);
                        }
                    }).setScrimViewBackground(this.listView.getClipBackground(view)).show();
                    return;
                }
                z5 = false;
                if (notificationException3 == null) {
                    return;
                }
                ItemOptions gravity2 = ItemOptions.makeOptions(this, view).setGravity(3);
                if (notificationException3.notify > 0) {
                    z6 = true;
                } else {
                    z6 = true;
                }
                ItemOptions itemOptionsAddIf3 = gravity2.addIf(z6, R.drawable.msg_mute, (CharSequence) LocaleController.getString(R.string.NotificationsStoryMute), false, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$4(notificationException3, view, z5);
                    }
                });
                if (notificationException3.notify <= 0) {
                    z7 = true;
                } else {
                    z7 = true;
                }
                ItemOptions itemOptionsAddIf4 = itemOptionsAddIf3.addIf(z7, R.drawable.msg_unmute, (CharSequence) LocaleController.getString(R.string.NotificationsStoryUnmute), false, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$5(notificationException3, view, z5);
                    }
                });
                if (z5) {
                    z8 = false;
                } else {
                    z8 = false;
                }
                itemOptionsAddIf4.addIf(z8, R.drawable.msg_delete, (CharSequence) LocaleController.getString("DeleteException", R.string.DeleteException), true, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$6(notificationException3, view, i);
                    }
                }).setScrimViewBackground(this.listView.getClipBackground(view)).show();
                return;
            }
        }
        if (this.listView.getAdapter() == this.searchAdapter || !(itemInner == null || itemInner.exception == null)) {
            RecyclerView.Adapter adapter2 = this.listView.getAdapter();
            SearchAdapter searchAdapter2 = this.searchAdapter;
            if (adapter2 == searchAdapter2) {
                Object object2 = searchAdapter2.getObject(i);
                if (!(object2 instanceof NotificationsSettingsActivity.NotificationException)) {
                    boolean z10 = object2 instanceof TLRPC.User;
                    if (z10) {
                        j = ((TLRPC.User) object2).id;
                    } else {
                        j = -((TLRPC.Chat) object2).id;
                    }
                    if (this.exceptionsDict.containsKey(Long.valueOf(j))) {
                        notificationException2 = (NotificationsSettingsActivity.NotificationException) this.exceptionsDict.get(Long.valueOf(j));
                        z2 = false;
                    } else {
                        NotificationsSettingsActivity.NotificationException notificationException6 = new NotificationsSettingsActivity.NotificationException();
                        notificationException6.did = j;
                        if (z10) {
                            notificationException6.did = ((TLRPC.User) object2).id;
                        } else {
                            notificationException6.did = -((TLRPC.Chat) object2).id;
                        }
                        notificationException2 = notificationException6;
                        z2 = true;
                    }
                    notificationException = notificationException2;
                    z = z2;
                    arrayList = this.exceptions;
                } else {
                    arrayList = this.searchAdapter.searchResult;
                    notificationException = (NotificationsSettingsActivity.NotificationException) object2;
                }
                if (notificationException == null) {
                    return;
                }
                final long j3 = notificationException.did;
                final boolean zIsGlobalNotificationsEnabled = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j3, false, false);
                ChatNotificationsPopupWrapper chatNotificationsPopupWrapper = new ChatNotificationsPopupWrapper(context, this.currentAccount, null, true, true, new ChatNotificationsPopupWrapper.Callback() {
                    @Override
                    public void dismiss() {
                        ChatNotificationsPopupWrapper.Callback.CC.$default$dismiss(this);
                    }

                    @Override
                    public void openExceptions() {
                        ChatNotificationsPopupWrapper.Callback.CC.$default$openExceptions(this);
                    }

                    @Override
                    public void toggleSound() {
                        String sharedPrefKey = NotificationsController.getSharedPrefKey(j3, NotificationsCustomSettingsActivity.this.topicId);
                        SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) NotificationsCustomSettingsActivity.this).currentAccount);
                        boolean z11 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
                        boolean z12 = !z11;
                        notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z12).apply();
                        if (BulletinFactory.canShowBulletin(NotificationsCustomSettingsActivity.this)) {
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                            BulletinFactory.createSoundEnabledBulletin(notificationsCustomSettingsActivity, z11 ? 1 : 0, notificationsCustomSettingsActivity.getResourceProvider()).show();
                        }
                    }

                    @Override
                    public void muteFor(int i3) {
                        if (i3 != 0) {
                            NotificationsCustomSettingsActivity.this.getNotificationsController().muteUntil(j3, NotificationsCustomSettingsActivity.this.topicId, i3);
                            if (BulletinFactory.canShowBulletin(NotificationsCustomSettingsActivity.this)) {
                                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                                BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity, 5, i3, notificationsCustomSettingsActivity.getResourceProvider()).show();
                            }
                        } else {
                            if (NotificationsCustomSettingsActivity.this.getMessagesController().isDialogMuted(j3, NotificationsCustomSettingsActivity.this.topicId)) {
                                toggleMute();
                            }
                            if (BulletinFactory.canShowBulletin(NotificationsCustomSettingsActivity.this)) {
                                NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = NotificationsCustomSettingsActivity.this;
                                BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity2, 4, i3, notificationsCustomSettingsActivity2.getResourceProvider()).show();
                            }
                        }
                        update();
                    }

                    @Override
                    public void showCustomize() {
                        if (j3 != 0) {
                            Bundle bundle = new Bundle();
                            bundle.putLong("dialog_id", j3);
                            ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle);
                            profileNotificationsActivity.setDelegate(new ProfileNotificationsActivity.ProfileNotificationsActivityDelegate() {
                                @Override
                                public void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException7) {
                                }

                                @Override
                                public void didRemoveException(long j4) {
                                    setDefault();
                                }
                            });
                            NotificationsCustomSettingsActivity.this.presentFragment(profileNotificationsActivity);
                        }
                    }

                    @Override
                    public void toggleMute() {
                        NotificationsCustomSettingsActivity.this.getNotificationsController().muteDialog(j3, NotificationsCustomSettingsActivity.this.topicId, !NotificationsCustomSettingsActivity.this.getMessagesController().isDialogMuted(j3, NotificationsCustomSettingsActivity.this.topicId));
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                        BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j3, NotificationsCustomSettingsActivity.this.topicId), null).show();
                        update();
                    }

                    private void update() {
                        if (NotificationsCustomSettingsActivity.this.getMessagesController().isDialogMuted(j3, NotificationsCustomSettingsActivity.this.topicId) != zIsGlobalNotificationsEnabled) {
                            setDefault();
                        } else {
                            setNotDefault();
                        }
                    }

                    private void setNotDefault() {
                        SharedPreferences notificationsSettings = NotificationsCustomSettingsActivity.this.getNotificationsSettings();
                        notificationException.hasCustom = notificationsSettings.getBoolean("custom_" + notificationException.did, false);
                        notificationException.notify = notificationsSettings.getInt("notify2_" + notificationException.did, 0);
                        if (notificationException.notify != 0) {
                            int i3 = notificationsSettings.getInt("notifyuntil_" + notificationException.did, -1);
                            if (i3 != -1) {
                                notificationException.muteUntil = i3;
                            }
                        }
                        if (z) {
                            NotificationsCustomSettingsActivity.this.exceptions.add(notificationException);
                            NotificationsCustomSettingsActivity.this.exceptionsDict.put(Long.valueOf(notificationException.did), notificationException);
                            NotificationsCustomSettingsActivity.this.updateRows(true);
                        } else {
                            NotificationsCustomSettingsActivity.this.listView.getAdapter().notifyItemChanged(i);
                        }
                        ((BaseFragment) NotificationsCustomSettingsActivity.this).actionBar.closeSearchField();
                    }

                    public void setDefault() {
                        int iIndexOf;
                        if (z) {
                            return;
                        }
                        if (arrayList != NotificationsCustomSettingsActivity.this.exceptions && (iIndexOf = NotificationsCustomSettingsActivity.this.exceptions.indexOf(notificationException)) >= 0) {
                            NotificationsCustomSettingsActivity.this.exceptions.remove(iIndexOf);
                            NotificationsCustomSettingsActivity.this.exceptionsDict.remove(Long.valueOf(notificationException.did));
                        }
                        arrayList.remove(notificationException);
                        if (arrayList == NotificationsCustomSettingsActivity.this.exceptions) {
                            NotificationsCustomSettingsActivity.this.updateRows(true);
                            NotificationsCustomSettingsActivity.this.checkRowsEnabled();
                        } else {
                            NotificationsCustomSettingsActivity.this.updateRows(true);
                            NotificationsCustomSettingsActivity.this.searchAdapter.notifyItemChanged(i);
                        }
                        ((BaseFragment) NotificationsCustomSettingsActivity.this).actionBar.closeSearchField();
                    }
                }, getResourceProvider());
                chatNotificationsPopupWrapper.lambda$update$11(j3, this.topicId, null);
                chatNotificationsPopupWrapper.showAsOptions(this, view, f, f2, false);
                return;
            }
            NotificationsSettingsActivity.NotificationException notificationException7 = itemInner.exception;
            if (notificationException7.auto) {
                return;
            }
            notificationException = notificationException7;
            arrayList = this.exceptions;
            z = false;
            if (notificationException == null) {
                return;
            }
            final long j4 = notificationException.did;
            final boolean zIsGlobalNotificationsEnabled2 = NotificationsController.getInstance(this.currentAccount).isGlobalNotificationsEnabled(j4, false, false);
            ChatNotificationsPopupWrapper chatNotificationsPopupWrapper2 = new ChatNotificationsPopupWrapper(context, this.currentAccount, null, true, true, new ChatNotificationsPopupWrapper.Callback() {
                @Override
                public void dismiss() {
                    ChatNotificationsPopupWrapper.Callback.CC.$default$dismiss(this);
                }

                @Override
                public void openExceptions() {
                    ChatNotificationsPopupWrapper.Callback.CC.$default$openExceptions(this);
                }

                @Override
                public void toggleSound() {
                    String sharedPrefKey = NotificationsController.getSharedPrefKey(j4, NotificationsCustomSettingsActivity.this.topicId);
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(((BaseFragment) NotificationsCustomSettingsActivity.this).currentAccount);
                    boolean z11 = notificationsSettings.getBoolean("sound_enabled_" + sharedPrefKey, true);
                    boolean z12 = !z11;
                    notificationsSettings.edit().putBoolean("sound_enabled_" + sharedPrefKey, z12).apply();
                    if (BulletinFactory.canShowBulletin(NotificationsCustomSettingsActivity.this)) {
                        NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                        BulletinFactory.createSoundEnabledBulletin(notificationsCustomSettingsActivity, z11 ? 1 : 0, notificationsCustomSettingsActivity.getResourceProvider()).show();
                    }
                }

                @Override
                public void muteFor(int i3) {
                    if (i3 != 0) {
                        NotificationsCustomSettingsActivity.this.getNotificationsController().muteUntil(j4, NotificationsCustomSettingsActivity.this.topicId, i3);
                        if (BulletinFactory.canShowBulletin(NotificationsCustomSettingsActivity.this)) {
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                            BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity, 5, i3, notificationsCustomSettingsActivity.getResourceProvider()).show();
                        }
                    } else {
                        if (NotificationsCustomSettingsActivity.this.getMessagesController().isDialogMuted(j4, NotificationsCustomSettingsActivity.this.topicId)) {
                            toggleMute();
                        }
                        if (BulletinFactory.canShowBulletin(NotificationsCustomSettingsActivity.this)) {
                            NotificationsCustomSettingsActivity notificationsCustomSettingsActivity2 = NotificationsCustomSettingsActivity.this;
                            BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity2, 4, i3, notificationsCustomSettingsActivity2.getResourceProvider()).show();
                        }
                    }
                    update();
                }

                @Override
                public void showCustomize() {
                    if (j4 != 0) {
                        Bundle bundle = new Bundle();
                        bundle.putLong("dialog_id", j4);
                        ProfileNotificationsActivity profileNotificationsActivity = new ProfileNotificationsActivity(bundle);
                        profileNotificationsActivity.setDelegate(new ProfileNotificationsActivity.ProfileNotificationsActivityDelegate() {
                            @Override
                            public void didCreateNewException(NotificationsSettingsActivity.NotificationException notificationException8) {
                            }

                            @Override
                            public void didRemoveException(long j5) {
                                setDefault();
                            }
                        });
                        NotificationsCustomSettingsActivity.this.presentFragment(profileNotificationsActivity);
                    }
                }

                @Override
                public void toggleMute() {
                    NotificationsCustomSettingsActivity.this.getNotificationsController().muteDialog(j4, NotificationsCustomSettingsActivity.this.topicId, !NotificationsCustomSettingsActivity.this.getMessagesController().isDialogMuted(j4, NotificationsCustomSettingsActivity.this.topicId));
                    NotificationsCustomSettingsActivity notificationsCustomSettingsActivity = NotificationsCustomSettingsActivity.this;
                    BulletinFactory.createMuteBulletin(notificationsCustomSettingsActivity, notificationsCustomSettingsActivity.getMessagesController().isDialogMuted(j4, NotificationsCustomSettingsActivity.this.topicId), null).show();
                    update();
                }

                private void update() {
                    if (NotificationsCustomSettingsActivity.this.getMessagesController().isDialogMuted(j4, NotificationsCustomSettingsActivity.this.topicId) != zIsGlobalNotificationsEnabled2) {
                        setDefault();
                    } else {
                        setNotDefault();
                    }
                }

                private void setNotDefault() {
                    SharedPreferences notificationsSettings = NotificationsCustomSettingsActivity.this.getNotificationsSettings();
                    notificationException.hasCustom = notificationsSettings.getBoolean("custom_" + notificationException.did, false);
                    notificationException.notify = notificationsSettings.getInt("notify2_" + notificationException.did, 0);
                    if (notificationException.notify != 0) {
                        int i3 = notificationsSettings.getInt("notifyuntil_" + notificationException.did, -1);
                        if (i3 != -1) {
                            notificationException.muteUntil = i3;
                        }
                    }
                    if (z) {
                        NotificationsCustomSettingsActivity.this.exceptions.add(notificationException);
                        NotificationsCustomSettingsActivity.this.exceptionsDict.put(Long.valueOf(notificationException.did), notificationException);
                        NotificationsCustomSettingsActivity.this.updateRows(true);
                    } else {
                        NotificationsCustomSettingsActivity.this.listView.getAdapter().notifyItemChanged(i);
                    }
                    ((BaseFragment) NotificationsCustomSettingsActivity.this).actionBar.closeSearchField();
                }

                public void setDefault() {
                    int iIndexOf;
                    if (z) {
                        return;
                    }
                    if (arrayList != NotificationsCustomSettingsActivity.this.exceptions && (iIndexOf = NotificationsCustomSettingsActivity.this.exceptions.indexOf(notificationException)) >= 0) {
                        NotificationsCustomSettingsActivity.this.exceptions.remove(iIndexOf);
                        NotificationsCustomSettingsActivity.this.exceptionsDict.remove(Long.valueOf(notificationException.did));
                    }
                    arrayList.remove(notificationException);
                    if (arrayList == NotificationsCustomSettingsActivity.this.exceptions) {
                        NotificationsCustomSettingsActivity.this.updateRows(true);
                        NotificationsCustomSettingsActivity.this.checkRowsEnabled();
                    } else {
                        NotificationsCustomSettingsActivity.this.updateRows(true);
                        NotificationsCustomSettingsActivity.this.searchAdapter.notifyItemChanged(i);
                    }
                    ((BaseFragment) NotificationsCustomSettingsActivity.this).actionBar.closeSearchField();
                }
            }, getResourceProvider());
            chatNotificationsPopupWrapper2.lambda$update$11(j4, this.topicId, null);
            chatNotificationsPopupWrapper2.showAsOptions(this, view, f, f2, false);
            return;
        }
        if (itemInner == null) {
            return;
        }
        int i3 = itemInner.id;
        if (i3 == 6) {
            Bundle bundle = new Bundle();
            bundle.putBoolean("onlySelect", true);
            bundle.putBoolean("checkCanWrite", false);
            int i4 = this.currentType;
            if (i4 == 0) {
                bundle.putInt("dialogsType", 6);
            } else if (i4 == 2) {
                bundle.putInt("dialogsType", 5);
            } else {
                bundle.putInt("dialogsType", 4);
            }
            DialogsActivity dialogsActivity = new DialogsActivity(bundle);
            dialogsActivity.setDelegate(new DialogsActivity.DialogsActivityDelegate() {
                @Override
                public boolean canSelectStories() {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$canSelectStories(this);
                }

                @Override
                public final boolean didSelectDialogs(DialogsActivity dialogsActivity2, ArrayList arrayList2, CharSequence charSequence, boolean z11, boolean z12, int i5, int i6, TopicsFragment topicsFragment) {
                    return this.f$0.lambda$createView$8(dialogsActivity2, arrayList2, charSequence, z11, z12, i5, i6, topicsFragment);
                }

                @Override
                public boolean didSelectStories(DialogsActivity dialogsActivity2) {
                    return DialogsActivity.DialogsActivityDelegate.CC.$default$didSelectStories(this, dialogsActivity2);
                }
            });
            presentFragment(dialogsActivity);
            return;
        }
        if (i3 == 7) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("NotificationsDeleteAllExceptionTitle", R.string.NotificationsDeleteAllExceptionTitle));
            builder.setMessage(LocaleController.getString("NotificationsDeleteAllExceptionAlert", R.string.NotificationsDeleteAllExceptionAlert));
            builder.setPositiveButton(LocaleController.getString("Delete", R.string.Delete), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i5) {
                    this.f$0.lambda$createView$9(alertDialog, i5);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", R.string.Cancel), null);
            AlertDialog alertDialogCreate = builder.create();
            showDialog(alertDialogCreate);
            TextView textView = (TextView) alertDialogCreate.getButton(-1);
            if (textView != null) {
                textView.setTextColor(Theme.getColor(Theme.key_text_RedBold));
                return;
            }
            return;
        }
        if (i3 == 100 || i3 == 101) {
            boolean zIsGlobalNotificationsEnabled3 = getNotificationsController().isGlobalNotificationsEnabled(this.currentType);
            this.listView.findViewHolderForAdapterPosition(i);
            int i5 = this.currentType;
            if (i5 != 3) {
                if (!zIsGlobalNotificationsEnabled3) {
                    getNotificationsController().setGlobalNotificationsEnabled(this.currentType, 0);
                    updateRows(true);
                    return;
                } else {
                    AlertsCreator.showCustomNotificationsDialog(this, 0L, 0, i5, this.exceptions, this.autoExceptions, this.currentAccount, new MessagesStorage.IntCallback() {
                        @Override
                        public final void run(int i6) {
                            this.f$0.lambda$createView$10(i6);
                        }
                    });
                    return;
                }
            }
            SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
            Boolean bool = this.storiesEnabled;
            boolean z11 = bool != null && bool.booleanValue();
            if (this.storiesAuto && z11) {
                editorEdit.remove("EnableAllStories");
                this.storiesEnabled = null;
            } else {
                boolean z12 = !z11;
                editorEdit.putBoolean("EnableAllStories", z12);
                this.storiesEnabled = Boolean.valueOf(z12);
            }
            editorEdit.apply();
            getNotificationsController().updateServerNotificationsSettings(this.currentType);
            updateRows(true);
            if (this.showAutoExceptions != (this.storiesEnabled == null)) {
                toggleShowAutoExceptions();
            }
            checkRowsEnabled();
            return;
        }
        if (i3 == 3) {
            if (view.isEnabled()) {
                try {
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("type", this.currentType);
                    presentFragment(new NotificationsSoundActivity(bundle2, getResourceProvider()));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (itemInner.viewType == 3) {
            if (view.isEnabled()) {
                showDialog(AlertsCreator.createColorSelectDialog(getParentActivity(), 0L, 0, this.currentType, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$11(view, i);
                    }
                }));
                return;
            }
            return;
        }
        if (i3 == 2) {
            if (view.isEnabled()) {
                showDialog(AlertsCreator.createPopupSelectDialog(getParentActivity(), this.currentType, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$12(view, i);
                    }
                }));
                return;
            }
            return;
        }
        if (i3 == 1) {
            if (view.isEnabled()) {
                int i6 = this.currentType;
                if (i6 == 1) {
                    str = "vibrate_messages";
                } else if (i6 == 0) {
                    str = "vibrate_group";
                } else if (i6 == 3) {
                    str = "vibrate_stories";
                } else if (i6 == 4 || i6 == 5) {
                    str = "vibrate_react";
                } else {
                    str = "vibrate_channel";
                }
                final String str2 = str;
                showDialog(AlertsCreator.createVibrationSelectDialog(getParentActivity(), 0L, 0L, str2, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$13(view, str2, i);
                    }
                }));
                return;
            }
            return;
        }
        if (i3 == 4) {
            if (view.isEnabled()) {
                showDialog(AlertsCreator.createPrioritySelectDialog(getParentActivity(), 0L, 0, this.currentType, new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$14(view, i);
                    }
                }));
                return;
            }
            return;
        }
        if (i3 == 102) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings = getNotificationsSettings();
                if (notificationsSettings.getBoolean("EnableAllStories", false)) {
                    return;
                }
                SharedPreferences.Editor editorEdit2 = notificationsSettings.edit();
                if (this.storiesEnabled != null) {
                    editorEdit2.remove("EnableAllStories");
                    this.storiesEnabled = null;
                    this.storiesAuto = true;
                    itemInner.checked = true;
                } else {
                    editorEdit2.putBoolean("EnableAllStories", false);
                    this.storiesEnabled = Boolean.FALSE;
                    this.storiesAuto = false;
                    itemInner.checked = false;
                }
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(this.storiesAuto);
                }
                editorEdit2.commit();
                if (this.storiesAuto != this.showAutoExceptions) {
                    toggleShowAutoExceptions();
                }
                getNotificationsController().updateServerNotificationsSettings(this.currentType);
                checkRowsEnabled();
                return;
            }
            return;
        }
        if (i3 == 0) {
            if (view.isEnabled()) {
                SharedPreferences notificationsSettings2 = getNotificationsSettings();
                SharedPreferences.Editor editorEdit3 = notificationsSettings2.edit();
                int i7 = this.currentType;
                if (i7 == 1) {
                    z4 = notificationsSettings2.getBoolean("EnablePreviewAll", true);
                    editorEdit3.putBoolean("EnablePreviewAll", !z4);
                } else if (i7 == 0) {
                    z4 = notificationsSettings2.getBoolean("EnablePreviewGroup", true);
                    editorEdit3.putBoolean("EnablePreviewGroup", !z4);
                } else if (i7 == 3) {
                    z4 = !notificationsSettings2.getBoolean("EnableHideStoriesSenders", false);
                    editorEdit3.putBoolean("EnableHideStoriesSenders", z4);
                } else if (i7 == 4 || i7 == 5) {
                    z4 = notificationsSettings2.getBoolean("EnableReactionsPreview", true);
                    editorEdit3.putBoolean("EnableReactionsPreview", !z4);
                } else {
                    z4 = notificationsSettings2.getBoolean("EnablePreviewChannel", true);
                    editorEdit3.putBoolean("EnablePreviewChannel", !z4);
                }
                editorEdit3.commit();
                getNotificationsController().updateServerNotificationsSettings(this.currentType);
                if (view instanceof TextCheckCell) {
                    ((TextCheckCell) view).setChecked(!z4);
                    return;
                }
                return;
            }
            return;
        }
        if (i3 == 103 || i3 == 104) {
            boolean z13 = !LocaleController.isRTL ? f <= ((float) (view.getMeasuredWidth() - AndroidUtilities.dp(76.0f))) : f >= ((float) AndroidUtilities.dp(76.0f));
            final SharedPreferences notificationsSettings3 = getNotificationsSettings();
            if (z13) {
                String str3 = itemInner.id == 103 ? "EnableReactionsMessages" : "EnableReactionsStories";
                SharedPreferences.Editor editorEdit4 = notificationsSettings3.edit();
                editorEdit4.putBoolean(str3, !notificationsSettings3.getBoolean(str3, true));
                editorEdit4.apply();
                updateRows(true);
                getNotificationsController().updateServerNotificationsSettings(this.currentType);
                return;
            }
            final String str4 = itemInner.id == 103 ? "EnableReactionsMessagesContacts" : "EnableReactionsStoriesContacts";
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            final boolean[] zArr = {notificationsSettings3.getBoolean(str4, false)};
            final RadioColorCell[] radioColorCellArr = new RadioColorCell[2];
            final int i8 = 0;
            while (i8 < 2) {
                RadioColorCell radioColorCell = new RadioColorCell(context, getResourceProvider());
                radioColorCellArr[i8] = radioColorCell;
                radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCellArr[i8].setCheckColor(Theme.getColor(Theme.key_radioBackground), Theme.getColor(Theme.key_dialogRadioBackgroundChecked));
                RadioColorCell radioColorCell2 = radioColorCellArr[i8];
                String string = LocaleController.getString(i8 == 0 ? R.string.NotifyAboutReactionsFromEveryone : R.string.NotifyAboutReactionsFromContacts);
                if (i8 == 0) {
                    z3 = !zArr[0];
                } else {
                    z3 = zArr[0];
                }
                radioColorCell2.setTextAndValue(string, z3);
                radioColorCellArr[i8].setBackground(Theme.createSelectorDrawable(Theme.getColor(Theme.key_listSelector), 2));
                linearLayout.addView(radioColorCellArr[i8]);
                radioColorCellArr[i8].setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        NotificationsCustomSettingsActivity.lambda$createView$15(zArr, i8, radioColorCellArr, view2);
                    }
                });
                i8++;
            }
            showDialog(new AlertDialog.Builder(getContext(), this.resourceProvider).setTitle(LocaleController.getString(R.string.NotifyAboutReactionsFrom)).setView(linearLayout).setNegativeButton(LocaleController.getString(R.string.Cancel), null).setPositiveButton(LocaleController.getString(R.string.Save), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i9) {
                    this.f$0.lambda$createView$16(notificationsSettings3, str4, zArr, alertDialog, i9);
                }
            }).create());
        }
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

    public boolean lambda$createView$8(DialogsActivity dialogsActivity, ArrayList arrayList, CharSequence charSequence, boolean z, boolean z2, int i, int i2, TopicsFragment topicsFragment) {
        int i3 = 0;
        long j = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        if (this.currentType == 3) {
            ArrayList arrayList2 = this.autoExceptions;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (((NotificationsSettingsActivity.NotificationException) it.next()).did == j) {
                        it.remove();
                    }
                }
            }
            ArrayList arrayList3 = this.exceptions;
            if (arrayList3 != null) {
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    if (((NotificationsSettingsActivity.NotificationException) it2.next()).did == j) {
                        it2.remove();
                    }
                }
            }
            NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
            notificationException.did = j;
            notificationException.story = true;
            Boolean bool = this.storiesEnabled;
            if (bool != null && bool.booleanValue()) {
                i3 = Integer.MAX_VALUE;
            }
            notificationException.notify = i3;
            if (this.exceptions == null) {
                this.exceptions = new ArrayList();
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
                    this.f$0.lambda$createView$7(notificationException2);
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

    public void lambda$createView$9(AlertDialog alertDialog, int i) {
        SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
        int size = this.exceptions.size();
        for (int i2 = 0; i2 < size; i2++) {
            NotificationsSettingsActivity.NotificationException notificationException = (NotificationsSettingsActivity.NotificationException) this.exceptions.get(i2);
            if (this.currentType == 3) {
                editorEdit.remove("stories_" + notificationException.did);
            } else {
                editorEdit.remove("notify2_" + notificationException.did).remove("custom_" + notificationException.did);
            }
            getMessagesStorage().setDialogFlags(notificationException.did, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.get(notificationException.did);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
        }
        editorEdit.commit();
        int size2 = this.exceptions.size();
        for (int i3 = 0; i3 < size2; i3++) {
            getNotificationsController().updateServerNotificationsSettings(((NotificationsSettingsActivity.NotificationException) this.exceptions.get(i3)).did, this.topicId, false);
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
                ((ItemInner) this.items.get(i)).color = getLedColor();
            }
            ((TextColorCell) view).setTextAndColor(LocaleController.getString("LedColor", R.string.LedColor), getLedColor(), true);
            return;
        }
        updateRows(true);
    }

    public void lambda$createView$12(View view, int i) {
        if (view instanceof TextSettingsCell) {
            if (i >= 0 && i < this.items.size()) {
                ((ItemInner) this.items.get(i)).text2 = getPopupOption();
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
                ((ItemInner) this.items.get(i)).text2 = string;
            }
            ((TextSettingsCell) view).setTextAndValue(LocaleController.getString("Vibrate", R.string.Vibrate), string, true, true);
            return;
        }
        updateRows(true);
    }

    public void lambda$createView$14(View view, int i) {
        if (view instanceof TextSettingsCell) {
            if (i >= 0 && i < this.items.size()) {
                ((ItemInner) this.items.get(i)).text2 = getPriorityOption();
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

    public void lambda$createView$16(SharedPreferences sharedPreferences, String str, boolean[] zArr, AlertDialog alertDialog, int i) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        editorEdit.putBoolean(str, zArr[0]);
        editorEdit.apply();
        updateRows(true);
        getNotificationsController().updateServerNotificationsSettings(this.currentType);
    }

    public void checkRowsEnabled() {
        boolean zIsGlobalNotificationsEnabled;
        int i;
        ArrayList arrayList;
        if (this.exceptions.isEmpty() || this.currentType == 3) {
            int childCount = this.listView.getChildCount();
            ArrayList arrayList2 = new ArrayList();
            if (this.currentType == 3) {
                Boolean bool = this.storiesEnabled;
                zIsGlobalNotificationsEnabled = bool == null || bool.booleanValue() || !((arrayList = this.exceptions) == null || arrayList.isEmpty());
            } else {
                zIsGlobalNotificationsEnabled = getNotificationsController().isGlobalNotificationsEnabled(this.currentType);
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = this.listView.getChildAt(i2);
                RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.getChildViewHolder(childAt);
                int childAdapterPosition = this.listView.getChildAdapterPosition(childAt);
                ItemInner itemInner = (childAdapterPosition < 0 || childAdapterPosition >= this.items.size()) ? null : (ItemInner) this.items.get(childAdapterPosition);
                boolean z = (itemInner == null || !((i = itemInner.id) == 102 || i == 101 || i == 100)) ? zIsGlobalNotificationsEnabled : true;
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
                this.f$0.lambda$loadExceptions$20(arrayList);
            }
        });
    }

    public void lambda$loadExceptions$20(ArrayList arrayList) {
        boolean z;
        final ArrayList<TLRPC.Chat> arrayList2;
        ArrayList<TLRPC.User> arrayList3;
        ArrayList<TLRPC.EncryptedChat> arrayList4;
        int size;
        int i;
        ArrayList arrayList5;
        int size2;
        int i2;
        int size3;
        int i3;
        int size4;
        int i4;
        TLRPC.User user;
        TLRPC.Chat chat;
        ArrayList arrayList6;
        ArrayList arrayList7;
        ArrayList arrayList8;
        final ArrayList arrayList9 = new ArrayList();
        ArrayList arrayList10 = new ArrayList();
        ArrayList arrayList11 = new ArrayList();
        ArrayList arrayList12 = new ArrayList();
        ArrayList arrayList13 = new ArrayList();
        LongSparseArray longSparseArray = new LongSparseArray();
        ArrayList<Long> arrayList14 = new ArrayList<>();
        ArrayList arrayList15 = new ArrayList();
        ArrayList arrayList16 = new ArrayList();
        ArrayList<TLRPC.User> arrayList17 = new ArrayList<>();
        ArrayList<TLRPC.Chat> arrayList18 = new ArrayList<>();
        ArrayList<TLRPC.EncryptedChat> arrayList19 = new ArrayList<>();
        long j = getUserConfig().clientUserId;
        SharedPreferences notificationsSettings = getNotificationsSettings();
        Map<String, ?> all = notificationsSettings.getAll();
        Iterator<Map.Entry<String, ?>> it = all.entrySet().iterator();
        while (true) {
            arrayList17 = arrayList17;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next = it.next();
            String key = next.getKey();
            arrayList19 = arrayList19;
            if (key.startsWith("notify2_")) {
                ArrayList arrayList20 = arrayList12;
                String strReplace = key.replace("notify2_", "");
                Long l = Utilities.parseLong(strReplace);
                ArrayList arrayList21 = arrayList10;
                ArrayList arrayList22 = arrayList11;
                long jLongValue = l.longValue();
                if (jLongValue == 0 || jLongValue == j) {
                    arrayList10 = arrayList21;
                    arrayList12 = arrayList20;
                    arrayList11 = arrayList22;
                } else {
                    NotificationsSettingsActivity.NotificationException notificationException = new NotificationsSettingsActivity.NotificationException();
                    notificationException.did = jLongValue;
                    long j2 = j;
                    notificationException.hasCustom = notificationsSettings.getBoolean("custom_" + jLongValue, false);
                    int iIntValue = ((Integer) next.getValue()).intValue();
                    notificationException.notify = iIntValue;
                    if (iIntValue != 0) {
                        Integer num = (Integer) all.get("notifyuntil_" + strReplace);
                        if (num != null) {
                            notificationException.muteUntil = num.intValue();
                        }
                    }
                    if (DialogObject.isEncryptedDialog(jLongValue)) {
                        int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                        TLRPC.EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChatId));
                        if (encryptedChat == null) {
                            arrayList16.add(Integer.valueOf(encryptedChatId));
                            longSparseArray.put(jLongValue, notificationException);
                        } else {
                            TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                            if (user2 == null) {
                                arrayList14.add(Long.valueOf(encryptedChat.user_id));
                                longSparseArray.put(encryptedChat.user_id, notificationException);
                            } else if (!user2.deleted) {
                            }
                        }
                        arrayList9.add(notificationException);
                    } else if (DialogObject.isUserDialog(jLongValue)) {
                        TLRPC.User user3 = getMessagesController().getUser(l);
                        if (user3 == null) {
                            arrayList14.add(l);
                            longSparseArray.put(jLongValue, notificationException);
                        } else if (!user3.deleted) {
                        }
                        arrayList9.add(notificationException);
                    } else {
                        long j3 = -jLongValue;
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
                        if (chat2 == null) {
                            arrayList15.add(Long.valueOf(j3));
                            longSparseArray.put(jLongValue, notificationException);
                        } else if (!chat2.left && !chat2.kicked && chat2.migrated_to == null) {
                            if (ChatObject.isChannel(chat2) && !chat2.megagroup) {
                                arrayList13.add(notificationException);
                            } else {
                                arrayList21.add(notificationException);
                            }
                        }
                    }
                    arrayList10 = arrayList21;
                    arrayList12 = arrayList20;
                    arrayList11 = arrayList22;
                    j = j2;
                }
            }
        }
        ArrayList arrayList23 = arrayList11;
        ArrayList arrayList24 = arrayList12;
        ArrayList<TLRPC.EncryptedChat> arrayList25 = arrayList19;
        long j4 = j;
        final ArrayList arrayList26 = arrayList10;
        HashSet hashSet = new HashSet();
        Iterator<Map.Entry<String, ?>> it2 = all.entrySet().iterator();
        while (true) {
            z = true;
            if (!it2.hasNext()) {
                break;
            }
            Map.Entry<String, ?> next2 = it2.next();
            String key2 = next2.getKey();
            if (key2.startsWith("stories_")) {
                try {
                    Long l2 = Utilities.parseLong(key2.substring(8));
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 != 0 && jLongValue2 != j4) {
                        NotificationsSettingsActivity.NotificationException notificationException2 = new NotificationsSettingsActivity.NotificationException();
                        notificationException2.did = jLongValue2;
                        notificationException2.story = true;
                        notificationException2.notify = ((Boolean) next2.getValue()).booleanValue() ? 0 : Integer.MAX_VALUE;
                        if (DialogObject.isUserDialog(jLongValue2)) {
                            TLRPC.User user4 = getMessagesController().getUser(l2);
                            if (user4 == null) {
                                try {
                                    arrayList14.add(l2);
                                    longSparseArray.put(jLongValue2, notificationException2);
                                } catch (Exception unused) {
                                    arrayList8 = arrayList23;
                                }
                            } else if (user4.deleted) {
                            }
                            arrayList8 = arrayList23;
                            try {
                                arrayList8.add(notificationException2);
                                hashSet.add(l2);
                            } catch (Exception unused2) {
                            }
                            arrayList23 = arrayList8;
                        }
                    }
                } catch (Exception unused3) {
                    arrayList8 = arrayList23;
                }
            }
        }
        final ArrayList arrayList27 = arrayList23;
        if (arrayList != null) {
            Collections.sort(arrayList, Comparator$CC.comparingDouble(new ToDoubleFunction() {
                @Override
                public final double applyAsDouble(Object obj) {
                    return ((TLRPC.TL_topPeer) obj).rating;
                }
            }));
            int iMax = Math.max(0, arrayList.size() - 6);
            while (iMax < arrayList.size()) {
                long peerDialogId = DialogObject.getPeerDialogId(((TLRPC.TL_topPeer) arrayList.get(iMax)).peer);
                if (hashSet.contains(Long.valueOf(peerDialogId))) {
                    arrayList7 = arrayList24;
                } else {
                    NotificationsSettingsActivity.NotificationException notificationException3 = new NotificationsSettingsActivity.NotificationException();
                    notificationException3.did = peerDialogId;
                    notificationException3.story = z;
                    notificationException3.notify = 0;
                    notificationException3.auto = z;
                    if (DialogObject.isUserDialog(peerDialogId)) {
                        TLRPC.User user5 = getMessagesController().getUser(Long.valueOf(peerDialogId));
                        if (user5 == null) {
                            arrayList14.add(Long.valueOf(peerDialogId));
                            longSparseArray.put(peerDialogId, notificationException3);
                        } else if (user5.deleted) {
                            arrayList7 = arrayList24;
                        }
                        arrayList7 = arrayList24;
                        arrayList7.add(0, notificationException3);
                        hashSet.add(Long.valueOf(peerDialogId));
                    } else {
                        arrayList7 = arrayList24;
                    }
                }
                iMax++;
                arrayList24 = arrayList7;
                z = true;
            }
        }
        final ArrayList arrayList28 = arrayList24;
        if (longSparseArray.size() != 0) {
            try {
                if (arrayList16.isEmpty()) {
                    arrayList4 = arrayList25;
                } else {
                    try {
                        arrayList4 = arrayList25;
                        try {
                            getMessagesStorage().getEncryptedChatsInternal(TextUtils.join(",", arrayList16), arrayList4, arrayList14);
                        } catch (Exception e) {
                            e = e;
                            arrayList2 = arrayList18;
                            arrayList3 = arrayList17;
                            FileLog.e(e);
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                chat = arrayList2.get(i);
                                if (chat.left) {
                                    arrayList6 = arrayList13;
                                } else {
                                    arrayList6 = arrayList13;
                                }
                                i++;
                                arrayList13 = arrayList6;
                            }
                            arrayList5 = arrayList13;
                            size2 = arrayList3.size();
                            for (i2 = 0; i2 < size2; i2++) {
                                user = arrayList3.get(i2);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.id);
                                }
                            }
                            size3 = arrayList4.size();
                            for (i3 = 0; i3 < size3; i3++) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                            }
                            size4 = longSparseArray.size();
                            for (i4 = 0; i4 < size4; i4++) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                    arrayList26.remove(longSparseArray.valueAt(i4));
                                    arrayList5.remove(longSparseArray.valueAt(i4));
                                } else {
                                    arrayList9.remove(longSparseArray.valueAt(i4));
                                }
                            }
                            final ArrayList<TLRPC.User> arrayList29 = arrayList3;
                            final ArrayList<TLRPC.EncryptedChat> arrayList30 = arrayList4;
                            final ArrayList arrayList31 = arrayList5;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$loadExceptions$19(arrayList29, arrayList2, arrayList30, arrayList9, arrayList26, arrayList27, arrayList28, arrayList31);
                                }
                            });
                        }
                    } catch (Exception e2) {
                        e = e2;
                        arrayList4 = arrayList25;
                        arrayList2 = arrayList18;
                        arrayList3 = arrayList17;
                        FileLog.e(e);
                        size = arrayList2.size();
                        i = 0;
                        while (i < size) {
                            chat = arrayList2.get(i);
                            if (chat.left) {
                                arrayList6 = arrayList13;
                            } else {
                                arrayList6 = arrayList13;
                            }
                            i++;
                            arrayList13 = arrayList6;
                        }
                        arrayList5 = arrayList13;
                        size2 = arrayList3.size();
                        while (i2 < size2) {
                            user = arrayList3.get(i2);
                            if (!user.deleted) {
                                longSparseArray.remove(user.id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i3 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                arrayList26.remove(longSparseArray.valueAt(i4));
                                arrayList5.remove(longSparseArray.valueAt(i4));
                            } else {
                                arrayList9.remove(longSparseArray.valueAt(i4));
                            }
                        }
                        final ArrayList arrayList210 = arrayList3;
                        final ArrayList arrayList32 = arrayList4;
                        final ArrayList arrayList33 = arrayList5;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$loadExceptions$19(arrayList210, arrayList2, arrayList32, arrayList9, arrayList26, arrayList27, arrayList28, arrayList33);
                            }
                        });
                    }
                }
                if (arrayList14.isEmpty()) {
                    arrayList3 = arrayList17;
                } else {
                    try {
                        arrayList3 = arrayList17;
                        try {
                            getMessagesStorage().getUsersInternal(arrayList14, arrayList3);
                        } catch (Exception e3) {
                            e = e3;
                            arrayList2 = arrayList18;
                            FileLog.e(e);
                            size = arrayList2.size();
                            i = 0;
                            while (i < size) {
                                chat = arrayList2.get(i);
                                if (chat.left) {
                                    arrayList6 = arrayList13;
                                } else {
                                    arrayList6 = arrayList13;
                                }
                                i++;
                                arrayList13 = arrayList6;
                            }
                            arrayList5 = arrayList13;
                            size2 = arrayList3.size();
                            while (i2 < size2) {
                                user = arrayList3.get(i2);
                                if (!user.deleted) {
                                    longSparseArray.remove(user.id);
                                }
                            }
                            size3 = arrayList4.size();
                            while (i3 < size3) {
                                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                            }
                            size4 = longSparseArray.size();
                            while (i4 < size4) {
                                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                    arrayList26.remove(longSparseArray.valueAt(i4));
                                    arrayList5.remove(longSparseArray.valueAt(i4));
                                } else {
                                    arrayList9.remove(longSparseArray.valueAt(i4));
                                }
                            }
                            final ArrayList arrayList211 = arrayList3;
                            final ArrayList arrayList34 = arrayList4;
                            final ArrayList arrayList35 = arrayList5;
                            AndroidUtilities.runOnUIThread(new Runnable() {
                                @Override
                                public final void run() {
                                    this.f$0.lambda$loadExceptions$19(arrayList211, arrayList2, arrayList34, arrayList9, arrayList26, arrayList27, arrayList28, arrayList35);
                                }
                            });
                        }
                    } catch (Exception e4) {
                        e = e4;
                        arrayList3 = arrayList17;
                        arrayList2 = arrayList18;
                        FileLog.e(e);
                        size = arrayList2.size();
                        i = 0;
                        while (i < size) {
                            chat = arrayList2.get(i);
                            if (chat.left) {
                                arrayList6 = arrayList13;
                            } else {
                                arrayList6 = arrayList13;
                            }
                            i++;
                            arrayList13 = arrayList6;
                        }
                        arrayList5 = arrayList13;
                        size2 = arrayList3.size();
                        while (i2 < size2) {
                            user = arrayList3.get(i2);
                            if (!user.deleted) {
                                longSparseArray.remove(user.id);
                            }
                        }
                        size3 = arrayList4.size();
                        while (i3 < size3) {
                            longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
                        }
                        size4 = longSparseArray.size();
                        while (i4 < size4) {
                            if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                                arrayList26.remove(longSparseArray.valueAt(i4));
                                arrayList5.remove(longSparseArray.valueAt(i4));
                            } else {
                                arrayList9.remove(longSparseArray.valueAt(i4));
                            }
                        }
                        final ArrayList arrayList212 = arrayList3;
                        final ArrayList arrayList36 = arrayList4;
                        final ArrayList arrayList37 = arrayList5;
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$loadExceptions$19(arrayList212, arrayList2, arrayList36, arrayList9, arrayList26, arrayList27, arrayList28, arrayList37);
                            }
                        });
                    }
                }
                if (arrayList15.isEmpty()) {
                    arrayList2 = arrayList18;
                } else {
                    MessagesStorage messagesStorage = getMessagesStorage();
                    String strJoin = TextUtils.join(",", arrayList15);
                    arrayList2 = arrayList18;
                    try {
                        messagesStorage.getChatsInternal(strJoin, arrayList2);
                    } catch (Exception e5) {
                        e = e5;
                        FileLog.e(e);
                    }
                }
            } catch (Exception e6) {
                e = e6;
                arrayList2 = arrayList18;
                arrayList3 = arrayList17;
                arrayList4 = arrayList25;
            }
            size = arrayList2.size();
            i = 0;
            while (i < size) {
                chat = arrayList2.get(i);
                if (chat.left || chat.kicked || chat.migrated_to != null) {
                    arrayList6 = arrayList13;
                } else {
                    arrayList6 = arrayList13;
                    NotificationsSettingsActivity.NotificationException notificationException4 = (NotificationsSettingsActivity.NotificationException) longSparseArray.get(-chat.id);
                    longSparseArray.remove(-chat.id);
                    if (notificationException4 != null) {
                        if (ChatObject.isChannel(chat) && !chat.megagroup) {
                            arrayList6.add(notificationException4);
                        } else {
                            arrayList26.add(notificationException4);
                        }
                    }
                }
                i++;
                arrayList13 = arrayList6;
            }
            arrayList5 = arrayList13;
            size2 = arrayList3.size();
            while (i2 < size2) {
                user = arrayList3.get(i2);
                if (!user.deleted) {
                    longSparseArray.remove(user.id);
                }
            }
            size3 = arrayList4.size();
            while (i3 < size3) {
                longSparseArray.remove(DialogObject.makeEncryptedDialogId(arrayList4.get(i3).id));
            }
            size4 = longSparseArray.size();
            while (i4 < size4) {
                if (DialogObject.isChatDialog(longSparseArray.keyAt(i4))) {
                    arrayList26.remove(longSparseArray.valueAt(i4));
                    arrayList5.remove(longSparseArray.valueAt(i4));
                } else {
                    arrayList9.remove(longSparseArray.valueAt(i4));
                }
            }
        } else {
            arrayList5 = arrayList13;
            arrayList2 = arrayList18;
            arrayList3 = arrayList17;
            arrayList4 = arrayList25;
        }
        final ArrayList arrayList213 = arrayList3;
        final ArrayList arrayList38 = arrayList4;
        final ArrayList arrayList39 = arrayList5;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$loadExceptions$19(arrayList213, arrayList2, arrayList38, arrayList9, arrayList26, arrayList27, arrayList28, arrayList39);
            }
        });
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
        ArrayList arrayList;
        int i;
        int i2;
        int i3;
        boolean z2;
        int i4;
        Boolean bool;
        this.newRow = -1;
        this.showRow = -1;
        this.importantRow = -1;
        this.messagesRow = -1;
        this.storiesRow = -1;
        this.previewRow = -1;
        this.showSenderRow = -1;
        this.soundRow = -1;
        this.addExceptionRow = -1;
        this.deleteExceptionsRow = -1;
        this.lightColorRow = -1;
        this.popupRow = -1;
        this.vibrateRow = -1;
        this.priorityRow = -1;
        this.oldItems.clear();
        this.oldItems.addAll(this.items);
        this.items.clear();
        SharedPreferences notificationsSettings = getNotificationsSettings();
        if (this.currentType != -1) {
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.NotifyMeAbout)));
            int i5 = this.currentType;
            if (i5 == 3) {
                this.newRow = this.items.size();
                this.items.add(ItemInner.asCheck(101, LocaleController.getString(R.string.NotifyMeAboutNewStories), notificationsSettings.getBoolean("EnableAllStories", false)));
                if (!notificationsSettings.getBoolean("EnableAllStories", false)) {
                    this.importantRow = this.items.size();
                    this.items.add(ItemInner.asCheck(102, LocaleController.getString(R.string.NotifyMeAboutImportantStories), this.storiesAuto && ((bool = this.storiesEnabled) == null || !bool.booleanValue())));
                }
                this.items.add(ItemInner.asShadow(-1, LocaleController.getString(R.string.StoryAutoExceptionsInfo)));
            } else if (i5 == 4 || i5 == 5) {
                this.messagesRow = this.items.size();
                ArrayList arrayList2 = this.items;
                int i6 = R.drawable.msg_markunread;
                String string = LocaleController.getString(R.string.NotifyMeAboutMessagesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsMessages", true)) {
                    i = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsMessagesContacts", false)) {
                    i = R.string.NotifyFromContacts;
                } else {
                    i = R.string.NotifyFromEveryone;
                }
                arrayList2.add(ItemInner.asCheck2(103, i6, string, LocaleController.getString(i), notificationsSettings.getBoolean("EnableReactionsMessages", true)));
                this.storiesRow = this.items.size();
                ArrayList arrayList3 = this.items;
                int i7 = R.drawable.msg_stories_saved;
                String string2 = LocaleController.getString(R.string.NotifyMeAboutStoriesReactions);
                if (!notificationsSettings.getBoolean("EnableReactionsStories", true)) {
                    i2 = R.string.NotifyFromNobody;
                } else if (notificationsSettings.getBoolean("EnableReactionsStoriesContacts", false)) {
                    i2 = R.string.NotifyFromContacts;
                } else {
                    i2 = R.string.NotifyFromEveryone;
                }
                arrayList3.add(ItemInner.asCheck2(104, i7, string2, LocaleController.getString(i2), notificationsSettings.getBoolean("EnableReactionsStories", true)));
                this.items.add(ItemInner.asShadow(-1, null));
            } else {
                if (i5 == 1) {
                    i3 = R.string.NotifyMeAboutPrivate;
                } else if (i5 == 0) {
                    i3 = R.string.NotifyMeAboutGroups;
                } else {
                    i3 = R.string.NotifyMeAboutChannels;
                }
                this.showRow = this.items.size();
                this.items.add(ItemInner.asCheck(100, LocaleController.getString(i3), getNotificationsController().isGlobalNotificationsEnabled(this.currentType)));
                this.items.add(ItemInner.asShadow(-1, null));
            }
            this.items.add(ItemInner.asHeader(LocaleController.getString(R.string.SETTINGS)));
            this.settingsStart = this.items.size() - 1;
            int i8 = this.currentType;
            if (i8 == 3) {
                this.showSenderRow = this.items.size();
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.NotificationShowSenderNames), !notificationsSettings.getBoolean("EnableHideStoriesSenders", false)));
            } else if (i8 == 4 || i8 == 5) {
                this.showSenderRow = this.items.size();
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.NotificationShowSenderNames), notificationsSettings.getBoolean("EnableReactionsPreview", true)));
            } else {
                if (i8 == 0) {
                    z2 = notificationsSettings.getBoolean("EnablePreviewGroup", true);
                } else if (i8 == 1) {
                    z2 = notificationsSettings.getBoolean("EnablePreviewAll", true);
                } else {
                    z2 = i8 != 2 ? false : notificationsSettings.getBoolean("EnablePreviewChannel", true);
                }
                this.previewRow = this.items.size();
                this.items.add(ItemInner.asCheck(0, LocaleController.getString(R.string.MessagePreview), z2));
            }
            this.soundRow = this.items.size();
            this.items.add(ItemInner.asSetting(3, LocaleController.getString("Sound", R.string.Sound), getSound()));
            if (this.expanded) {
                this.lightColorRow = this.items.size();
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
                this.vibrateRow = this.items.size();
                ArrayList arrayList4 = this.items;
                String string3 = LocaleController.getString("Vibrate", R.string.Vibrate);
                int[] iArr = this.vibrateLabels;
                arrayList4.add(ItemInner.asSetting(1, string3, LocaleController.getString(iArr[Utilities.clamp(i4, iArr.length - 1, 0)])));
                int i10 = this.currentType;
                if (i10 == 1 || i10 == 0) {
                    this.popupRow = this.items.size();
                    this.items.add(ItemInner.asSetting(2, LocaleController.getString("PopupNotification", R.string.PopupNotification), getPopupOption()));
                }
                this.priorityRow = this.items.size();
                this.items.add(ItemInner.asSetting(4, LocaleController.getString("NotificationsImportance", R.string.NotificationsImportance), getPriorityOption()));
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
                this.addExceptionRow = this.items.size();
                this.items.add(ItemInner.asButton(6, R.drawable.msg_contact_add, LocaleController.getString("NotificationsAddAnException", R.string.NotificationsAddAnException)));
            }
            this.exceptionsStart = this.items.size() - 1;
            if (this.autoExceptions != null && this.showAutoExceptions) {
                for (int i12 = 0; i12 < this.autoExceptions.size(); i12++) {
                    this.items.add(ItemInner.asException((NotificationsSettingsActivity.NotificationException) this.autoExceptions.get(i12)));
                }
            }
            if (this.exceptions != null) {
                for (int i13 = 0; i13 < this.exceptions.size(); i13++) {
                    this.items.add(ItemInner.asException((NotificationsSettingsActivity.NotificationException) this.exceptions.get(i13)));
                }
            }
            this.exceptionsEnd = this.items.size() - 1;
            if (this.currentType != -1 || ((arrayList = this.exceptions) != null && !arrayList.isEmpty())) {
                this.items.add(ItemInner.asShadow(-3, null));
            }
            ArrayList arrayList5 = this.exceptions;
            if (arrayList5 != null && !arrayList5.isEmpty()) {
                this.deleteExceptionsRow = this.items.size();
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
        String title;
        Ringtone ringtone;
        if (i2 == -1) {
            Uri uri = (Uri) intent.getParcelableExtra("android.intent.extra.ringtone.PICKED_URI");
            if (uri == null || (ringtone = RingtoneManager.getRingtone(getParentActivity(), uri)) == null) {
                title = null;
            } else {
                if (uri.equals(Settings.System.DEFAULT_NOTIFICATION_URI)) {
                    title = LocaleController.getString("SoundDefault", R.string.SoundDefault);
                } else {
                    title = ringtone.getTitle(getParentActivity());
                }
                ringtone.stop();
            }
            SharedPreferences.Editor editorEdit = getNotificationsSettings().edit();
            int i3 = this.currentType;
            if (i3 == 1) {
                if (title != null && uri != null) {
                    editorEdit.putString("GlobalSound", title);
                    editorEdit.putString("GlobalSoundPath", uri.toString());
                } else {
                    editorEdit.putString("GlobalSound", "NoSound");
                    editorEdit.putString("GlobalSoundPath", "NoSound");
                }
            } else if (i3 == 0) {
                if (title != null && uri != null) {
                    editorEdit.putString("GroupSound", title);
                    editorEdit.putString("GroupSoundPath", uri.toString());
                } else {
                    editorEdit.putString("GroupSound", "NoSound");
                    editorEdit.putString("GroupSoundPath", "NoSound");
                }
            } else if (i3 == 2) {
                if (title != null && uri != null) {
                    editorEdit.putString("ChannelSound", title);
                    editorEdit.putString("ChannelSoundPath", uri.toString());
                } else {
                    editorEdit.putString("ChannelSound", "NoSound");
                    editorEdit.putString("ChannelSoundPath", "NoSound");
                }
            } else if (i3 == 3) {
                if (title != null && uri != null) {
                    editorEdit.putString("StoriesSound", title);
                    editorEdit.putString("StoriesSoundPath", uri.toString());
                } else {
                    editorEdit.putString("StoriesSound", "NoSound");
                    editorEdit.putString("StoriesSoundPath", "NoSound");
                }
            }
            getNotificationsController().deleteNotificationChannelGlobal(this.currentType);
            editorEdit.commit();
            getNotificationsController().updateServerNotificationsSettings(this.currentType);
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(i);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                this.adapter.onBindViewHolder(viewHolderFindViewHolderForAdapterPosition, i);
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
                return;
            }
            return;
        }
        if (i == NotificationCenter.reloadHints) {
            loadExceptions();
        }
    }

    class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private SearchAdapterHelper searchAdapterHelper;
        private ArrayList searchResult = new ArrayList();
        private ArrayList searchResultNames = new ArrayList();
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
                public androidx.collection.LongSparseArray getExcludeCallParticipants() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeCallParticipants(this);
                }

                @Override
                public androidx.collection.LongSparseArray getExcludeUsers() {
                    return SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$getExcludeUsers(this);
                }

                @Override
                public final void onDataSetChanged(int i) {
                    this.f$0.lambda$new$0(i);
                }

                @Override
                public void onSetHashtags(ArrayList arrayList, HashMap map) {
                    SearchAdapterHelper.SearchAdapterHelperDelegate.CC.$default$onSetHashtags(this, arrayList, map);
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
                    this.f$0.lambda$searchDialogs$1(str);
                }
            };
            this.searchRunnable = runnable;
            dispatchQueue.postRunnable(runnable, 300L);
        }

        public void lambda$searchDialogs$1(final String str) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processSearch$3(str);
                }
            });
        }

        public void lambda$processSearch$3(final String str) {
            this.searchAdapterHelper.queryServerSearch(str, true, (NotificationsCustomSettingsActivity.this.currentType == 1 || NotificationsCustomSettingsActivity.this.currentType == 3) ? false : true, true, false, false, 0L, false, 0, 0);
            final ArrayList arrayList = new ArrayList(NotificationsCustomSettingsActivity.this.exceptions);
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$processSearch$2(str, arrayList);
                }
            });
        }

        public void lambda$processSearch$2(String str, ArrayList arrayList) {
            int i;
            String[] strArr;
            int i2;
            Object obj;
            String str2;
            String translitString;
            String str3;
            int i3;
            int i4;
            char c;
            String str4;
            String str5;
            char c2;
            char c3;
            String str6;
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList(), new ArrayList(), new ArrayList());
                return;
            }
            String translitString2 = LocaleController.getInstance().getTranslitString(lowerCase);
            if (lowerCase.equals(translitString2) || translitString2.length() == 0) {
                translitString2 = null;
            }
            char c4 = 0;
            int i5 = (translitString2 != null ? 1 : 0) + 1;
            String[] strArr2 = new String[i5];
            strArr2[0] = lowerCase;
            if (translitString2 != null) {
                strArr2[1] = translitString2;
            }
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            String[] strArr3 = new String[2];
            int i6 = 0;
            while (i6 < arrayList.size()) {
                NotificationsSettingsActivity.NotificationException notificationException = (NotificationsSettingsActivity.NotificationException) arrayList.get(i6);
                if (DialogObject.isEncryptedDialog(notificationException.did)) {
                    TLRPC.EncryptedChat encryptedChat = NotificationsCustomSettingsActivity.this.getMessagesController().getEncryptedChat(Integer.valueOf(DialogObject.getEncryptedChatId(notificationException.did)));
                    if (encryptedChat != null) {
                        i = i5;
                        TLRPC.User user = NotificationsCustomSettingsActivity.this.getMessagesController().getUser(Long.valueOf(encryptedChat.user_id));
                        if (user != null) {
                            strArr3[0] = ContactsController.formatName(user.first_name, user.last_name);
                            strArr3[1] = UserObject.getPublicUsername(user);
                        }
                    } else {
                        i = i5;
                    }
                    obj = null;
                    str2 = strArr3[c4];
                    strArr3[c4] = str2.toLowerCase();
                    translitString = LocaleController.getInstance().getTranslitString(strArr3[c4]);
                    str3 = strArr3[c4];
                    if (str3 != null && str3.equals(translitString)) {
                        translitString = null;
                    }
                    i3 = i;
                    i4 = 0;
                    c = 0;
                    while (true) {
                        if (i4 >= i3) {
                            strArr = strArr2;
                            i2 = i3;
                            break;
                        }
                        str4 = strArr2[i4];
                        strArr = strArr2;
                        str5 = strArr3[c4];
                        if (str5 != null) {
                            i2 = i3;
                            if (!str5.startsWith(str4)) {
                                if (!strArr3[0].contains(" " + str4)) {
                                }
                                if (c3 != 0) {
                                    if (c3 == c2) {
                                        arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                    } else {
                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                    }
                                    arrayList3.add(notificationException);
                                    if (obj != null) {
                                        break;
                                    }
                                    arrayList2.add(obj);
                                    break;
                                }
                                i4++;
                                c = c3;
                                strArr2 = strArr;
                                i3 = i2;
                                c4 = 0;
                            }
                            c2 = 1;
                            c3 = 1;
                            if (c3 != 0) {
                                if (c3 == c2) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                } else {
                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                }
                                arrayList3.add(notificationException);
                                if (obj != null) {
                                    break;
                                    break;
                                } else {
                                    arrayList2.add(obj);
                                    break;
                                    break;
                                }
                            }
                            i4++;
                            c = c3;
                            strArr2 = strArr;
                            i3 = i2;
                            c4 = 0;
                        } else {
                            i2 = i3;
                        }
                        if (translitString != null) {
                            if (!translitString.startsWith(str4)) {
                                if (translitString.contains(" " + str4)) {
                                }
                                if (c3 != 0) {
                                    if (c3 == c2) {
                                        arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                    } else {
                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                    }
                                    arrayList3.add(notificationException);
                                    if (obj != null) {
                                        break;
                                        break;
                                    } else {
                                        arrayList2.add(obj);
                                        break;
                                        break;
                                    }
                                }
                                i4++;
                                c = c3;
                                strArr2 = strArr;
                                i3 = i2;
                                c4 = 0;
                            }
                            c2 = 1;
                            c3 = 1;
                            if (c3 != 0) {
                                if (c3 == c2) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                } else {
                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                }
                                arrayList3.add(notificationException);
                                if (obj != null) {
                                    break;
                                    break;
                                } else {
                                    arrayList2.add(obj);
                                    break;
                                    break;
                                }
                            }
                            i4++;
                            c = c3;
                            strArr2 = strArr;
                            i3 = i2;
                            c4 = 0;
                        }
                        c2 = 1;
                        str6 = strArr3[1];
                        if (str6 == null && str6.startsWith(str4)) {
                            c3 = 2;
                        } else {
                            c3 = c;
                        }
                        if (c3 != 0) {
                            if (c3 == c2) {
                                arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                            } else {
                                arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                            }
                            arrayList3.add(notificationException);
                            if (obj != null) {
                                break;
                                break;
                            } else {
                                arrayList2.add(obj);
                                break;
                                break;
                            }
                        }
                        i4++;
                        c = c3;
                        strArr2 = strArr;
                        i3 = i2;
                        c4 = 0;
                    }
                    i6++;
                    strArr2 = strArr;
                    i5 = i2;
                    c4 = 0;
                } else {
                    i = i5;
                    if (DialogObject.isUserDialog(notificationException.did)) {
                        TLRPC.User user2 = NotificationsCustomSettingsActivity.this.getMessagesController().getUser(Long.valueOf(notificationException.did));
                        if (user2 == null || user2.deleted) {
                            strArr = strArr2;
                            i2 = i;
                        } else {
                            strArr3[0] = ContactsController.formatName(user2.first_name, user2.last_name);
                            strArr3[1] = UserObject.getPublicUsername(user2);
                            c4 = 0;
                            obj = user2;
                            str2 = strArr3[c4];
                            strArr3[c4] = str2.toLowerCase();
                            translitString = LocaleController.getInstance().getTranslitString(strArr3[c4]);
                            str3 = strArr3[c4];
                            if (str3 != null) {
                                translitString = null;
                            }
                            i3 = i;
                            i4 = 0;
                            c = 0;
                            while (true) {
                                if (i4 >= i3) {
                                    str4 = strArr2[i4];
                                    strArr = strArr2;
                                    str5 = strArr3[c4];
                                    if (str5 != null) {
                                        i2 = i3;
                                        if (!str5.startsWith(str4)) {
                                            if (!strArr3[0].contains(" " + str4)) {
                                            }
                                            if (c3 != 0) {
                                                if (c3 == c2) {
                                                    arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                                } else {
                                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                                }
                                                arrayList3.add(notificationException);
                                                if (obj != null) {
                                                    break;
                                                    break;
                                                } else {
                                                    arrayList2.add(obj);
                                                    break;
                                                    break;
                                                }
                                            }
                                            i4++;
                                            c = c3;
                                            strArr2 = strArr;
                                            i3 = i2;
                                            c4 = 0;
                                        }
                                        c2 = 1;
                                        c3 = 1;
                                        if (c3 != 0) {
                                            if (c3 == c2) {
                                                arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                            } else {
                                                arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                            }
                                            arrayList3.add(notificationException);
                                            if (obj != null) {
                                                break;
                                                break;
                                            } else {
                                                arrayList2.add(obj);
                                                break;
                                                break;
                                            }
                                        }
                                        i4++;
                                        c = c3;
                                        strArr2 = strArr;
                                        i3 = i2;
                                        c4 = 0;
                                    } else {
                                        i2 = i3;
                                    }
                                    if (translitString != null) {
                                        if (!translitString.startsWith(str4)) {
                                            if (translitString.contains(" " + str4)) {
                                            }
                                            if (c3 != 0) {
                                                if (c3 == c2) {
                                                    arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                                } else {
                                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                                }
                                                arrayList3.add(notificationException);
                                                if (obj != null) {
                                                    break;
                                                    break;
                                                } else {
                                                    arrayList2.add(obj);
                                                    break;
                                                    break;
                                                }
                                            }
                                            i4++;
                                            c = c3;
                                            strArr2 = strArr;
                                            i3 = i2;
                                            c4 = 0;
                                        }
                                        c2 = 1;
                                        c3 = 1;
                                        if (c3 != 0) {
                                            if (c3 == c2) {
                                                arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                            } else {
                                                arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                            }
                                            arrayList3.add(notificationException);
                                            if (obj != null) {
                                                break;
                                                break;
                                            } else {
                                                arrayList2.add(obj);
                                                break;
                                                break;
                                            }
                                        }
                                        i4++;
                                        c = c3;
                                        strArr2 = strArr;
                                        i3 = i2;
                                        c4 = 0;
                                    }
                                    c2 = 1;
                                    str6 = strArr3[1];
                                    if (str6 == null) {
                                        c3 = c;
                                    } else {
                                        c3 = c;
                                    }
                                    if (c3 != 0) {
                                        if (c3 == c2) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                        }
                                        arrayList3.add(notificationException);
                                        if (obj != null) {
                                            break;
                                            break;
                                        } else {
                                            arrayList2.add(obj);
                                            break;
                                            break;
                                        }
                                    }
                                    i4++;
                                    c = c3;
                                    strArr2 = strArr;
                                    i3 = i2;
                                    c4 = 0;
                                } else {
                                    strArr = strArr2;
                                    i2 = i3;
                                }
                            }
                        }
                        break;
                        break;
                    } else {
                        TLRPC.Chat chat = NotificationsCustomSettingsActivity.this.getMessagesController().getChat(Long.valueOf(-notificationException.did));
                        if (chat != null) {
                            if (chat.left || chat.kicked || chat.migrated_to != null) {
                                strArr = strArr2;
                                i2 = i;
                            } else {
                                c4 = 0;
                                strArr3[0] = chat.title;
                                strArr3[1] = ChatObject.getPublicUsername(chat);
                                obj = chat;
                            }
                            break;
                            break;
                        }
                        str2 = strArr3[c4];
                        strArr3[c4] = str2.toLowerCase();
                        translitString = LocaleController.getInstance().getTranslitString(strArr3[c4]);
                        str3 = strArr3[c4];
                        if (str3 != null) {
                            translitString = null;
                        }
                        i3 = i;
                        i4 = 0;
                        c = 0;
                        while (true) {
                            if (i4 >= i3) {
                                strArr = strArr2;
                                i2 = i3;
                                break;
                                break;
                            }
                            str4 = strArr2[i4];
                            strArr = strArr2;
                            str5 = strArr3[c4];
                            if (str5 != null) {
                                i2 = i3;
                                if (!str5.startsWith(str4)) {
                                    if (!strArr3[0].contains(" " + str4)) {
                                    }
                                    if (c3 != 0) {
                                        if (c3 == c2) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                        }
                                        arrayList3.add(notificationException);
                                        if (obj != null) {
                                            break;
                                            break;
                                        } else {
                                            arrayList2.add(obj);
                                            break;
                                            break;
                                        }
                                    }
                                    i4++;
                                    c = c3;
                                    strArr2 = strArr;
                                    i3 = i2;
                                    c4 = 0;
                                }
                                c2 = 1;
                                c3 = 1;
                                if (c3 != 0) {
                                    if (c3 == c2) {
                                        arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                    } else {
                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                    }
                                    arrayList3.add(notificationException);
                                    if (obj != null) {
                                        break;
                                        break;
                                    } else {
                                        arrayList2.add(obj);
                                        break;
                                        break;
                                    }
                                }
                                i4++;
                                c = c3;
                                strArr2 = strArr;
                                i3 = i2;
                                c4 = 0;
                            } else {
                                i2 = i3;
                            }
                            if (translitString != null) {
                                if (!translitString.startsWith(str4)) {
                                    if (translitString.contains(" " + str4)) {
                                    }
                                    if (c3 != 0) {
                                        if (c3 == c2) {
                                            arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                        } else {
                                            arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                        }
                                        arrayList3.add(notificationException);
                                        if (obj != null) {
                                            break;
                                            break;
                                        } else {
                                            arrayList2.add(obj);
                                            break;
                                            break;
                                        }
                                    }
                                    i4++;
                                    c = c3;
                                    strArr2 = strArr;
                                    i3 = i2;
                                    c4 = 0;
                                }
                                c2 = 1;
                                c3 = 1;
                                if (c3 != 0) {
                                    if (c3 == c2) {
                                        arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                    } else {
                                        arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                    }
                                    arrayList3.add(notificationException);
                                    if (obj != null) {
                                        break;
                                        break;
                                    } else {
                                        arrayList2.add(obj);
                                        break;
                                        break;
                                    }
                                }
                                i4++;
                                c = c3;
                                strArr2 = strArr;
                                i3 = i2;
                                c4 = 0;
                            }
                            c2 = 1;
                            str6 = strArr3[1];
                            if (str6 == null) {
                                c3 = c;
                            } else {
                                c3 = c;
                            }
                            if (c3 != 0) {
                                if (c3 == c2) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                } else {
                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                }
                                arrayList3.add(notificationException);
                                if (obj != null) {
                                    break;
                                    break;
                                } else {
                                    arrayList2.add(obj);
                                    break;
                                    break;
                                }
                            }
                            i4++;
                            c = c3;
                            strArr2 = strArr;
                            i3 = i2;
                            c4 = 0;
                        }
                    }
                    i6++;
                    strArr2 = strArr;
                    i5 = i2;
                    c4 = 0;
                }
                c4 = 0;
                obj = null;
                str2 = strArr3[c4];
                strArr3[c4] = str2.toLowerCase();
                translitString = LocaleController.getInstance().getTranslitString(strArr3[c4]);
                str3 = strArr3[c4];
                if (str3 != null) {
                    translitString = null;
                }
                i3 = i;
                i4 = 0;
                c = 0;
                while (true) {
                    if (i4 >= i3) {
                        strArr = strArr2;
                        i2 = i3;
                        break;
                        break;
                    }
                    str4 = strArr2[i4];
                    strArr = strArr2;
                    str5 = strArr3[c4];
                    if (str5 != null) {
                        i2 = i3;
                        if (!str5.startsWith(str4)) {
                            if (!strArr3[0].contains(" " + str4)) {
                            }
                            if (c3 != 0) {
                                if (c3 == c2) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                } else {
                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                }
                                arrayList3.add(notificationException);
                                if (obj != null) {
                                    break;
                                    break;
                                } else {
                                    arrayList2.add(obj);
                                    break;
                                    break;
                                }
                            }
                            i4++;
                            c = c3;
                            strArr2 = strArr;
                            i3 = i2;
                            c4 = 0;
                        }
                        c2 = 1;
                        c3 = 1;
                        if (c3 != 0) {
                            if (c3 == c2) {
                                arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                            } else {
                                arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                            }
                            arrayList3.add(notificationException);
                            if (obj != null) {
                                break;
                                break;
                            } else {
                                arrayList2.add(obj);
                                break;
                                break;
                            }
                        }
                        i4++;
                        c = c3;
                        strArr2 = strArr;
                        i3 = i2;
                        c4 = 0;
                    } else {
                        i2 = i3;
                    }
                    if (translitString != null) {
                        if (!translitString.startsWith(str4)) {
                            if (translitString.contains(" " + str4)) {
                            }
                            if (c3 != 0) {
                                if (c3 == c2) {
                                    arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                                } else {
                                    arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                                }
                                arrayList3.add(notificationException);
                                if (obj != null) {
                                    break;
                                    break;
                                } else {
                                    arrayList2.add(obj);
                                    break;
                                    break;
                                }
                            }
                            i4++;
                            c = c3;
                            strArr2 = strArr;
                            i3 = i2;
                            c4 = 0;
                        }
                        c2 = 1;
                        c3 = 1;
                        if (c3 != 0) {
                            if (c3 == c2) {
                                arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                            } else {
                                arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                            }
                            arrayList3.add(notificationException);
                            if (obj != null) {
                                break;
                                break;
                            } else {
                                arrayList2.add(obj);
                                break;
                                break;
                            }
                        }
                        i4++;
                        c = c3;
                        strArr2 = strArr;
                        i3 = i2;
                        c4 = 0;
                    }
                    c2 = 1;
                    str6 = strArr3[1];
                    if (str6 == null) {
                        c3 = c;
                    } else {
                        c3 = c;
                    }
                    if (c3 != 0) {
                        if (c3 == c2) {
                            arrayList4.add(AndroidUtilities.generateSearchName(str2, null, str4));
                        } else {
                            arrayList4.add(AndroidUtilities.generateSearchName("@" + strArr3[c2], null, "@" + str4));
                        }
                        arrayList3.add(notificationException);
                        if (obj != null) {
                            break;
                            break;
                        } else {
                            arrayList2.add(obj);
                            break;
                            break;
                        }
                    }
                    i4++;
                    c = c3;
                    strArr2 = strArr;
                    i3 = i2;
                    c4 = 0;
                }
                i6++;
                strArr2 = strArr;
                i5 = i2;
                c4 = 0;
            }
            updateSearchResults(arrayList2, arrayList3, arrayList4);
        }

        private void updateSearchResults(final ArrayList arrayList, final ArrayList arrayList2, final ArrayList arrayList3) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$updateSearchResults$4(arrayList2, arrayList3, arrayList);
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
            ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
            if (size < 0 || size >= globalSearch.size()) {
                return null;
            }
            return this.searchAdapterHelper.getGlobalSearch().get(size);
        }

        @Override
        public int getItemCount() {
            int size = this.searchResult.size();
            ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
            return !globalSearch.isEmpty() ? size + globalSearch.size() + 1 : size;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View userCell;
            if (i == 0) {
                userCell = new UserCell(this.mContext, 4, 0, false, true);
            } else {
                userCell = new GraySectionCell(this.mContext);
                userCell.setBackgroundColor(0);
                userCell.setTag(-33024);
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
                userCell.setException((NotificationsSettingsActivity.NotificationException) this.searchResult.get(i), (CharSequence) this.searchResultNames.get(i), i != this.searchResult.size() - 1);
                userCell.setAddButtonVisible(false);
            } else {
                int size = i - (this.searchResult.size() + 1);
                ArrayList globalSearch = this.searchAdapterHelper.getGlobalSearch();
                userCell.setData((TLObject) globalSearch.get(size), null, LocaleController.getString("NotificationsOn", R.string.NotificationsOn), 0, size != globalSearch.size() - 1);
                userCell.setAddButtonVisible(true);
            }
        }

        @Override
        public int getItemViewType(int i) {
            return i == this.searchResult.size() ? 1 : 0;
        }
    }

    private static class ItemInner extends AdapterWithDiffUtils.Item {
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
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ItemInner itemInner = (ItemInner) obj;
            return this.id == itemInner.id && this.color == itemInner.color && (this.viewType == 8 || (this.resId == itemInner.resId && Objects.equals(this.text, itemInner.text) && (this.viewType == 6 || Objects.equals(this.text2, itemInner.text2)))) && this.exception == itemInner.exception;
        }

        @Override
        protected boolean contentsEquals(AdapterWithDiffUtils.Item item) {
            if (this == item) {
                return true;
            }
            if (item == null || getClass() != item.getClass()) {
                return false;
            }
            ItemInner itemInner = (ItemInner) item;
            return this.id == itemInner.id && this.resId == itemInner.resId && this.color == itemInner.color && this.checked == itemInner.checked && Objects.equals(this.text, itemInner.text) && Objects.equals(this.text2, itemInner.text2) && this.exception == itemInner.exception;
        }
    }

    private class ListAdapter extends AdapterWithDiffUtils {
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
                    break;
                case 1:
                    headerCell = new TextCheckCell(this.mContext);
                    break;
                case 2:
                    headerCell = new UserCell(this.mContext, 6, 0, false);
                    break;
                case 3:
                    headerCell = new TextColorCell(this.mContext);
                    break;
                case 4:
                    headerCell = new TextInfoPrivacyCell(this.mContext);
                    break;
                case 5:
                    headerCell = new TextSettingsCell(this.mContext);
                    break;
                case 6:
                    headerCell = new NotificationsCheckCell(this.mContext, 21, 64, true, ((BaseFragment) NotificationsCustomSettingsActivity.this).resourceProvider);
                    break;
                case 7:
                default:
                    headerCell = new TextCell(this.mContext);
                    break;
                case 8:
                    headerCell = NotificationsCustomSettingsActivity.this.new ExpandView(this.mContext);
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
                    break;
                case 1:
                    ((TextCheckCell) viewHolder.itemView).setTextAndCheck("" + ((Object) itemInner.text), itemInner.checked, z);
                    break;
                case 2:
                    ((UserCell) viewHolder.itemView).setException(itemInner.exception, null, z);
                    break;
                case 3:
                    ((TextColorCell) viewHolder.itemView).setTextAndColor("" + ((Object) itemInner.text), itemInner.color, z);
                    break;
                case 4:
                    TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                    if (itemInner.text == null) {
                        textInfoPrivacyCell.setFixedSize(12);
                        textInfoPrivacyCell.setText(null);
                    } else {
                        textInfoPrivacyCell.setFixedSize(0);
                        textInfoPrivacyCell.setText(itemInner.text);
                    }
                    break;
                case 5:
                    ((TextSettingsCell) viewHolder.itemView).setTextAndValue(itemInner.text, itemInner.text2, z);
                    break;
                case 6:
                    NotificationsCheckCell notificationsCheckCell = (NotificationsCheckCell) viewHolder.itemView;
                    notificationsCheckCell.setDrawLine(true);
                    notificationsCheckCell.setChecked(itemInner.checked);
                    notificationsCheckCell.setTextAndValueAndIconAndCheck(itemInner.text, itemInner.text2, itemInner.resId, itemInner.checked, 0, false, z, true);
                    break;
                case 7:
                    TextCell textCell = (TextCell) viewHolder.itemView;
                    if (itemInner.resId == 0) {
                        textCell.setColors(-1, Theme.key_text_RedRegular);
                        textCell.setText("" + ((Object) itemInner.text), z);
                    } else {
                        textCell.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                        textCell.setTextAndIcon("" + ((Object) itemInner.text), itemInner.resId, z);
                    }
                    break;
                case 8:
                    ExpandView expandView = (ExpandView) viewHolder.itemView;
                    expandView.setColors(Theme.key_windowBackgroundWhiteBlueIcon, Theme.key_windowBackgroundWhiteBlueButton);
                    expandView.set(itemInner.text, itemInner.resId == 1, z);
                    break;
            }
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            boolean zIsGlobalNotificationsEnabled;
            if (NotificationsCustomSettingsActivity.this.currentType == 3 || (NotificationsCustomSettingsActivity.this.exceptions != null && NotificationsCustomSettingsActivity.this.exceptions.isEmpty())) {
                if (NotificationsCustomSettingsActivity.this.currentType == 3) {
                    zIsGlobalNotificationsEnabled = NotificationsCustomSettingsActivity.this.storiesEnabled == null || NotificationsCustomSettingsActivity.this.storiesEnabled.booleanValue() || !(NotificationsCustomSettingsActivity.this.exceptions == null || NotificationsCustomSettingsActivity.this.exceptions.isEmpty());
                } else {
                    zIsGlobalNotificationsEnabled = NotificationsCustomSettingsActivity.this.getNotificationsController().isGlobalNotificationsEnabled(NotificationsCustomSettingsActivity.this.currentType);
                }
                int adapterPosition = viewHolder.getAdapterPosition();
                ItemInner itemInner = (adapterPosition < 0 || adapterPosition >= NotificationsCustomSettingsActivity.this.items.size()) ? null : (ItemInner) NotificationsCustomSettingsActivity.this.items.get(adapterPosition);
                if (itemInner == null || itemInner.id != 102) {
                    int itemViewType = viewHolder.getItemViewType();
                    if (itemViewType == 0) {
                        ((HeaderCell) viewHolder.itemView).setEnabled(zIsGlobalNotificationsEnabled, (ArrayList) null);
                        return;
                    }
                    if (itemViewType == 1) {
                        ((TextCheckCell) viewHolder.itemView).setEnabled(zIsGlobalNotificationsEnabled, null);
                    } else if (itemViewType == 3) {
                        ((TextColorCell) viewHolder.itemView).setEnabled(zIsGlobalNotificationsEnabled, null);
                    } else {
                        if (itemViewType != 5) {
                            return;
                        }
                        ((TextSettingsCell) viewHolder.itemView).setEnabled(zIsGlobalNotificationsEnabled, null);
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

        public ExpandView(Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.imageView.setColorFilter(new PorterDuffColorFilter(NotificationsCustomSettingsActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlueIcon), PorterDuff.Mode.SRC_IN));
            this.imageView.setImageResource(R.drawable.msg_expand);
            addView(this.imageView, LayoutHelper.createFrame(24, 24.0f, (LocaleController.isRTL ? 3 : 5) | 16, 17.0f, 0.0f, 17.0f, 0.0f));
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            this.imageView.measure(i, i2);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            int iDp = LocaleController.isRTL ? AndroidUtilities.dp(17.0f) : (i3 - i) - AndroidUtilities.dp(41.0f);
            int iDp2 = ((i4 - i2) - AndroidUtilities.dp(24.0f)) / 2;
            this.imageView.layout(iDp, iDp2, AndroidUtilities.dp(24.0f) + iDp, AndroidUtilities.dp(24.0f) + iDp2);
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
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$21();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{HeaderCell.class, TextCheckCell.class, TextColorCell.class, TextSettingsCell.class, UserCell.class, NotificationsCheckCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        int i2 = Theme.key_windowBackgroundWhiteGrayText2;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        int i3 = Theme.key_switchTrack;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        int i4 = Theme.key_switchTrackChecked;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteGrayIcon));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{UserCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
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
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{NotificationsCheckCell.class}, new String[]{"checkBox"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextColorCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_windowBackgroundWhiteValueText));
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

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
    }
}
