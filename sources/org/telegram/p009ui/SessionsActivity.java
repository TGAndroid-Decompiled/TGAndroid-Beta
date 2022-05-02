package org.telegram.p009ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.CameraScanActivity;
import org.telegram.p009ui.Cells.CheckBoxCell;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.RadioColorCell;
import org.telegram.p009ui.Cells.SessionCell;
import org.telegram.p009ui.Cells.TextCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.ColoredImageSpan;
import org.telegram.p009ui.Components.EmptyTextProgressView;
import org.telegram.p009ui.Components.FlickerLoadingView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerItemsEnterAnimator;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.URLSpanNoUnderline;
import org.telegram.p009ui.Components.UndoView;
import org.telegram.p009ui.SessionBottomSheet;
import org.telegram.p009ui.SessionsActivity;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$TL_account_authorizations;
import org.telegram.tgnet.TLRPC$TL_account_resetAuthorization;
import org.telegram.tgnet.TLRPC$TL_account_resetWebAuthorization;
import org.telegram.tgnet.TLRPC$TL_account_setAuthorizationTTL;
import org.telegram.tgnet.TLRPC$TL_account_webAuthorizations;
import org.telegram.tgnet.TLRPC$TL_auth_acceptLoginToken;
import org.telegram.tgnet.TLRPC$TL_authorization;
import org.telegram.tgnet.TLRPC$TL_boolTrue;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_messages_stickerSet;
import org.telegram.tgnet.TLRPC$TL_webAuthorization;
import org.telegram.tgnet.TLRPC$User;

public class SessionsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private TLRPC$TL_authorization currentSession;
    private int currentSessionRow;
    private int currentSessionSectionRow;
    private int currentType;
    private LinearLayout emptyLayout;
    private EmptyTextProgressView emptyView;
    private FlickerLoadingView globalFlickerLoadingView;
    private ImageView imageView;
    private RecyclerItemsEnterAnimator itemsEnterAnimator;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean loading;
    private int noOtherSessionsRow;
    private int otherSessionsEndRow;
    private int otherSessionsSectionRow;
    private int otherSessionsStartRow;
    private int otherSessionsTerminateDetail;
    private int passwordSessionsDetailRow;
    private int passwordSessionsEndRow;
    private int passwordSessionsSectionRow;
    private int passwordSessionsStartRow;
    private int qrCodeDividerRow;
    private int qrCodeRow;
    private int rowCount;
    private int terminateAllSessionsDetailRow;
    private int terminateAllSessionsRow;
    private TextView textView1;
    private TextView textView2;
    private int ttlDays;
    private int ttlDivideRow;
    private int ttlHeaderRow;
    private int ttlRow;
    private UndoView undoView;
    private ArrayList<TLObject> sessions = new ArrayList<>();
    private ArrayList<TLObject> passwordSessions = new ArrayList<>();

    public static void lambda$createView$0(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
    }

    public SessionsActivity(int i) {
        this.currentType = i;
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows();
        loadSessions(false);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSessionReceived);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newSessionReceived);
    }

    @Override
    public View createView(Context context) {
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.globalFlickerLoadingView = flickerLoadingView;
        flickerLoadingView.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.currentType == 0) {
            this.actionBar.setTitle(LocaleController.getString("Devices", C0952R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString("WebSessionsTitle", C0952R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    SessionsActivity.this.finishFragment();
                }
            }
        });
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout2.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyLayout = linearLayout;
        linearLayout.setOrientation(1);
        this.emptyLayout.setGravity(17);
        this.emptyLayout.setBackgroundDrawable(Theme.getThemedDrawable(context, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
        this.emptyLayout.setLayoutParams(new AbsListView.LayoutParams(-1, AndroidUtilities.displaySize.y - C1006ActionBar.getCurrentActionBarHeight()));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        if (this.currentType == 0) {
            imageView.setImageResource(C0952R.C0953drawable.devices);
        } else {
            imageView.setImageResource(C0952R.C0953drawable.no_apps);
        }
        this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("sessions_devicesImage"), PorterDuff.Mode.MULTIPLY));
        this.emptyLayout.addView(this.imageView, LayoutHelper.createLinear(-2, -2));
        TextView textView = new TextView(context);
        this.textView1 = textView;
        textView.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
        this.textView1.setGravity(17);
        this.textView1.setTextSize(1, 17.0f);
        this.textView1.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        if (this.currentType == 0) {
            this.textView1.setText(LocaleController.getString("NoOtherSessions", C0952R.string.NoOtherSessions));
        } else {
            this.textView1.setText(LocaleController.getString("NoOtherWebSessions", C0952R.string.NoOtherWebSessions));
        }
        this.emptyLayout.addView(this.textView1, LayoutHelper.createLinear(-2, -2, 17, 0, 16, 0, 0));
        TextView textView2 = new TextView(context);
        this.textView2 = textView2;
        textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText2"));
        this.textView2.setGravity(17);
        this.textView2.setTextSize(1, 17.0f);
        this.textView2.setPadding(AndroidUtilities.m34dp(20.0f), 0, AndroidUtilities.m34dp(20.0f), 0);
        if (this.currentType == 0) {
            this.textView2.setText(LocaleController.getString("NoOtherSessionsInfo", C0952R.string.NoOtherSessionsInfo));
        } else {
            this.textView2.setText(LocaleController.getString("NoOtherWebSessionsInfo", C0952R.string.NoOtherWebSessionsInfo));
        }
        this.emptyLayout.addView(this.textView2, LayoutHelper.createLinear(-2, -2, 17, 0, 14, 0, 0));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1, 17));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAnimateEmptyView(true, 0);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                SessionsActivity.this.lambda$createView$13(view, i);
            }
        });
        if (this.currentType == 0) {
            C34952 r4 = new C34952(context);
            this.undoView = r4;
            frameLayout2.addView(r4, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        RecyclerItemsEnterAnimator recyclerItemsEnterAnimator = new RecyclerItemsEnterAnimator(this.listView, true) {
            @Override
            public View getProgressView() {
                View view = null;
                for (int i = 0; i < SessionsActivity.this.listView.getChildCount(); i++) {
                    View childAt = SessionsActivity.this.listView.getChildAt(i);
                    if (SessionsActivity.this.listView.getChildAdapterPosition(childAt) >= 0 && (childAt instanceof SessionCell) && ((SessionCell) childAt).isStub()) {
                        view = childAt;
                    }
                }
                return view;
            }
        };
        this.itemsEnterAnimator = recyclerItemsEnterAnimator;
        recyclerItemsEnterAnimator.animateAlphaProgressView = false;
        updateRows();
        return this.fragmentView;
    }

    public void lambda$createView$13(View view, final int i) {
        CharSequence charSequence;
        TLRPC$TL_authorization tLRPC$TL_authorization;
        String str;
        boolean z = true;
        if (i == this.ttlRow) {
            if (getParentActivity() != null) {
                int i2 = this.ttlDays;
                int i3 = i2 <= 7 ? 0 : i2 <= 93 ? 1 : i2 <= 183 ? 2 : 3;
                final AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("SessionsSelfDestruct", C0952R.string.SessionsSelfDestruct));
                String[] strArr = {LocaleController.formatPluralString("Weeks", 1), LocaleController.formatPluralString("Months", 3), LocaleController.formatPluralString("Months", 6), LocaleController.formatPluralString("Years", 1)};
                LinearLayout linearLayout = new LinearLayout(getParentActivity());
                linearLayout.setOrientation(1);
                builder.setView(linearLayout);
                int i4 = 0;
                while (i4 < 4) {
                    RadioColorCell radioColorCell = new RadioColorCell(getParentActivity());
                    radioColorCell.setPadding(AndroidUtilities.m34dp(4.0f), 0, AndroidUtilities.m34dp(4.0f), 0);
                    radioColorCell.setTag(Integer.valueOf(i4));
                    radioColorCell.setCheckColor(Theme.getColor("radioBackground"), Theme.getColor("dialogRadioBackgroundChecked"));
                    radioColorCell.setTextAndValue(strArr[i4], i3 == i4);
                    linearLayout.addView(radioColorCell);
                    radioColorCell.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view2) {
                            SessionsActivity.this.lambda$createView$1(builder, view2);
                        }
                    });
                    i4++;
                }
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                showDialog(builder.create());
            }
        } else if (i == this.terminateAllSessionsRow) {
            if (getParentActivity() != null) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity());
                if (this.currentType == 0) {
                    builder2.setMessage(LocaleController.getString("AreYouSureSessions", C0952R.string.AreYouSureSessions));
                    builder2.setTitle(LocaleController.getString("AreYouSureSessionsTitle", C0952R.string.AreYouSureSessionsTitle));
                    str = LocaleController.getString("Terminate", C0952R.string.Terminate);
                } else {
                    builder2.setMessage(LocaleController.getString("AreYouSureWebSessions", C0952R.string.AreYouSureWebSessions));
                    builder2.setTitle(LocaleController.getString("TerminateWebSessionsTitle", C0952R.string.TerminateWebSessionsTitle));
                    str = LocaleController.getString("Disconnect", C0952R.string.Disconnect);
                }
                builder2.setPositiveButton(str, new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i5) {
                        SessionsActivity.this.lambda$createView$6(dialogInterface, i5);
                    }
                });
                builder2.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                AlertDialog create = builder2.create();
                showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
            }
        } else if (((i >= this.otherSessionsStartRow && i < this.otherSessionsEndRow) || ((i >= this.passwordSessionsStartRow && i < this.passwordSessionsEndRow) || i == this.currentSessionRow)) && getParentActivity() != null) {
            if (this.currentType == 0) {
                if (i == this.currentSessionRow) {
                    tLRPC$TL_authorization = this.currentSession;
                } else {
                    int i5 = this.otherSessionsStartRow;
                    if (i < i5 || i >= this.otherSessionsEndRow) {
                        tLRPC$TL_authorization = (TLRPC$TL_authorization) this.passwordSessions.get(i - this.passwordSessionsStartRow);
                    } else {
                        tLRPC$TL_authorization = (TLRPC$TL_authorization) this.sessions.get(i - i5);
                    }
                    z = false;
                }
                showSessionBottomSheet(tLRPC$TL_authorization, z);
                return;
            }
            AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity());
            final boolean[] zArr = new boolean[1];
            if (this.currentType == 0) {
                builder3.setMessage(LocaleController.getString("TerminateSessionText", C0952R.string.TerminateSessionText));
                builder3.setTitle(LocaleController.getString("AreYouSureSessionTitle", C0952R.string.AreYouSureSessionTitle));
                charSequence = LocaleController.getString("Terminate", C0952R.string.Terminate);
            } else {
                TLRPC$TL_webAuthorization tLRPC$TL_webAuthorization = (TLRPC$TL_webAuthorization) this.sessions.get(i - this.otherSessionsStartRow);
                builder3.setMessage(LocaleController.formatString("TerminateWebSessionText", C0952R.string.TerminateWebSessionText, tLRPC$TL_webAuthorization.domain));
                builder3.setTitle(LocaleController.getString("TerminateWebSessionTitle", C0952R.string.TerminateWebSessionTitle));
                CharSequence string = LocaleController.getString("Disconnect", C0952R.string.Disconnect);
                FrameLayout frameLayout = new FrameLayout(getParentActivity());
                TLRPC$User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tLRPC$TL_webAuthorization.bot_id));
                String firstName = user != null ? UserObject.getFirstName(user) : "";
                CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
                checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
                checkBoxCell.setText(LocaleController.formatString("TerminateWebSessionStop", C0952R.string.TerminateWebSessionStop, firstName), "", false, false);
                checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.m34dp(16.0f) : AndroidUtilities.m34dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.m34dp(8.0f) : AndroidUtilities.m34dp(16.0f), 0);
                frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
                checkBoxCell.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        SessionsActivity.lambda$createView$7(zArr, view2);
                    }
                });
                builder3.setCustomViewOffset(16);
                builder3.setView(frameLayout);
                charSequence = string;
            }
            builder3.setPositiveButton(charSequence, new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i6) {
                    SessionsActivity.this.lambda$createView$12(i, zArr, dialogInterface, i6);
                }
            });
            builder3.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
            AlertDialog create2 = builder3.create();
            showDialog(create2);
            TextView textView2 = (TextView) create2.getButton(-1);
            if (textView2 != null) {
                textView2.setTextColor(Theme.getColor("dialogTextRed2"));
            }
        }
    }

    public void lambda$createView$1(AlertDialog.Builder builder, View view) {
        int i;
        builder.getDismissRunnable().run();
        Integer num = (Integer) view.getTag();
        if (num.intValue() == 0) {
            i = 7;
        } else if (num.intValue() == 1) {
            i = 90;
        } else if (num.intValue() == 2) {
            i = 183;
        } else {
            i = num.intValue() == 3 ? 365 : 0;
        }
        TLRPC$TL_account_setAuthorizationTTL tLRPC$TL_account_setAuthorizationTTL = new TLRPC$TL_account_setAuthorizationTTL();
        tLRPC$TL_account_setAuthorizationTTL.authorization_ttl_days = i;
        this.ttlDays = i;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        getConnectionsManager().sendRequest(tLRPC$TL_account_setAuthorizationTTL, SessionsActivity$$ExternalSyntheticLambda17.INSTANCE);
    }

    public void lambda$createView$6(DialogInterface dialogInterface, int i) {
        if (this.currentType == 0) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                public static int constructor = -1616179942;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z) {
                    return TLRPC$Bool.TLdeserialize(abstractSerializedData, i2, z);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SessionsActivity.this.lambda$createView$3(tLObject, tLRPC$TL_error);
                }
            });
            return;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
            public static int constructor = 1747789204;

            @Override
            public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i2, boolean z) {
                return TLRPC$Bool.TLdeserialize(abstractSerializedData, i2, z);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                abstractSerializedData.writeInt32(constructor);
            }
        }, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SessionsActivity.this.lambda$createView$5(tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$createView$3(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SessionsActivity.this.lambda$createView$2(tLRPC$TL_error, tLObject);
            }
        });
        for (int i = 0; i < 3; i++) {
            UserConfig userConfig = UserConfig.getInstance(i);
            if (userConfig.isClientActivated()) {
                userConfig.registeredForPush = false;
                userConfig.saveConfig(false);
                MessagesController.getInstance(i).registerForPush(SharedConfig.pushString);
                ConnectionsManager.getInstance(i).setUserId(userConfig.getClientUserId());
            }
        }
    }

    public void lambda$createView$2(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (getParentActivity() != null && tLRPC$TL_error == null && (tLObject instanceof TLRPC$TL_boolTrue)) {
            Toast.makeText(getParentActivity(), LocaleController.getString("TerminateAllSessions", C0952R.string.TerminateAllSessions), 0).show();
            finishFragment();
        }
    }

    public void lambda$createView$5(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SessionsActivity.this.lambda$createView$4(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$createView$4(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        if (getParentActivity() != null) {
            if (tLRPC$TL_error != null || !(tLObject instanceof TLRPC$TL_boolTrue)) {
                Toast.makeText(getParentActivity(), LocaleController.getString("UnknownError", C0952R.string.UnknownError), 0).show();
            } else {
                Toast.makeText(getParentActivity(), LocaleController.getString("TerminateAllWebSessions", C0952R.string.TerminateAllWebSessions), 0).show();
            }
            finishFragment();
        }
    }

    public static void lambda$createView$7(boolean[] zArr, View view) {
        if (view.isEnabled()) {
            zArr[0] = !zArr[0];
            ((CheckBoxCell) view).setChecked(zArr[0], true);
        }
    }

    public void lambda$createView$12(int i, boolean[] zArr, DialogInterface dialogInterface, int i2) {
        final TLRPC$TL_authorization tLRPC$TL_authorization;
        if (getParentActivity() != null) {
            final AlertDialog alertDialog = new AlertDialog(getParentActivity(), 3);
            alertDialog.setCanCancel(false);
            alertDialog.show();
            if (this.currentType == 0) {
                int i3 = this.otherSessionsStartRow;
                if (i < i3 || i >= this.otherSessionsEndRow) {
                    tLRPC$TL_authorization = (TLRPC$TL_authorization) this.passwordSessions.get(i - this.passwordSessionsStartRow);
                } else {
                    tLRPC$TL_authorization = (TLRPC$TL_authorization) this.sessions.get(i - i3);
                }
                TLRPC$TL_account_resetAuthorization tLRPC$TL_account_resetAuthorization = new TLRPC$TL_account_resetAuthorization();
                tLRPC$TL_account_resetAuthorization.hash = tLRPC$TL_authorization.hash;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_resetAuthorization, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        SessionsActivity.this.lambda$createView$9(alertDialog, tLRPC$TL_authorization, tLObject, tLRPC$TL_error);
                    }
                });
                return;
            }
            final TLRPC$TL_webAuthorization tLRPC$TL_webAuthorization = (TLRPC$TL_webAuthorization) this.sessions.get(i - this.otherSessionsStartRow);
            TLRPC$TL_account_resetWebAuthorization tLRPC$TL_account_resetWebAuthorization = new TLRPC$TL_account_resetWebAuthorization();
            tLRPC$TL_account_resetWebAuthorization.hash = tLRPC$TL_webAuthorization.hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_account_resetWebAuthorization, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SessionsActivity.this.lambda$createView$11(alertDialog, tLRPC$TL_webAuthorization, tLObject, tLRPC$TL_error);
                }
            });
            if (zArr[0]) {
                MessagesController.getInstance(this.currentAccount).blockPeer(tLRPC$TL_webAuthorization.bot_id);
            }
        }
    }

    public void lambda$createView$9(final AlertDialog alertDialog, final TLRPC$TL_authorization tLRPC$TL_authorization, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SessionsActivity.this.lambda$createView$8(alertDialog, tLRPC$TL_error, tLRPC$TL_authorization);
            }
        });
    }

    public void lambda$createView$8(AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_authorization tLRPC$TL_authorization) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        if (tLRPC$TL_error == null) {
            this.sessions.remove(tLRPC$TL_authorization);
            this.passwordSessions.remove(tLRPC$TL_authorization);
            updateRows();
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
        }
    }

    public void lambda$createView$11(final AlertDialog alertDialog, final TLRPC$TL_webAuthorization tLRPC$TL_webAuthorization, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SessionsActivity.this.lambda$createView$10(alertDialog, tLRPC$TL_error, tLRPC$TL_webAuthorization);
            }
        });
    }

    public void lambda$createView$10(AlertDialog alertDialog, TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_webAuthorization tLRPC$TL_webAuthorization) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        if (tLRPC$TL_error == null) {
            this.sessions.remove(tLRPC$TL_webAuthorization);
            updateRows();
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
        }
    }

    public class C34952 extends UndoView {
        C34952(Context context) {
            super(context);
        }

        @Override
        public void hide(boolean z, int i) {
            if (!z) {
                final TLRPC$TL_authorization tLRPC$TL_authorization = (TLRPC$TL_authorization) getCurrentInfoObject();
                TLRPC$TL_account_resetAuthorization tLRPC$TL_account_resetAuthorization = new TLRPC$TL_account_resetAuthorization();
                tLRPC$TL_account_resetAuthorization.hash = tLRPC$TL_authorization.hash;
                ConnectionsManager.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).sendRequest(tLRPC$TL_account_resetAuthorization, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        SessionsActivity.C34952.this.lambda$hide$1(tLRPC$TL_authorization, tLObject, tLRPC$TL_error);
                    }
                });
            }
            super.hide(z, i);
        }

        public void lambda$hide$1(final TLRPC$TL_authorization tLRPC$TL_authorization, TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SessionsActivity.C34952.this.lambda$hide$0(tLRPC$TL_error, tLRPC$TL_authorization);
                }
            });
        }

        public void lambda$hide$0(TLRPC$TL_error tLRPC$TL_error, TLRPC$TL_authorization tLRPC$TL_authorization) {
            if (tLRPC$TL_error == null) {
                SessionsActivity.this.sessions.remove(tLRPC$TL_authorization);
                SessionsActivity.this.passwordSessions.remove(tLRPC$TL_authorization);
                SessionsActivity.this.updateRows();
                if (SessionsActivity.this.listAdapter != null) {
                    SessionsActivity.this.listAdapter.notifyDataSetChanged();
                }
                SessionsActivity.this.loadSessions(true);
            }
        }
    }

    public class C34974 implements SessionBottomSheet.Callback {
        public static void lambda$onSessionTerminated$0() {
        }

        C34974() {
        }

        @Override
        public void onSessionTerminated(TLRPC$TL_authorization tLRPC$TL_authorization) {
            SessionsActivity.this.sessions.remove(tLRPC$TL_authorization);
            SessionsActivity.this.passwordSessions.remove(tLRPC$TL_authorization);
            SessionsActivity.this.updateRows();
            if (SessionsActivity.this.listAdapter != null) {
                SessionsActivity.this.listAdapter.notifyDataSetChanged();
            }
            TLRPC$TL_account_resetAuthorization tLRPC$TL_account_resetAuthorization = new TLRPC$TL_account_resetAuthorization();
            tLRPC$TL_account_resetAuthorization.hash = tLRPC$TL_authorization.hash;
            ConnectionsManager.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).sendRequest(tLRPC$TL_account_resetAuthorization, SessionsActivity$4$$ExternalSyntheticLambda1.INSTANCE);
        }

        public static void lambda$onSessionTerminated$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(SessionsActivity$4$$ExternalSyntheticLambda0.INSTANCE);
        }
    }

    private void showSessionBottomSheet(TLRPC$TL_authorization tLRPC$TL_authorization, boolean z) {
        if (tLRPC$TL_authorization != null) {
            new SessionBottomSheet(this, tLRPC$TL_authorization, z, new C34974()).show();
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.newSessionReceived) {
            loadSessions(true);
        }
    }

    public void loadSessions(boolean z) {
        if (!this.loading) {
            if (!z) {
                this.loading = true;
            }
            if (this.currentType == 0) {
                ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                    public static int constructor = -484392616;

                    @Override
                    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                        return TLRPC$TL_account_authorizations.TLdeserialize(abstractSerializedData, i, z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                        abstractSerializedData.writeInt32(constructor);
                    }
                }, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        SessionsActivity.this.lambda$loadSessions$15(tLObject, tLRPC$TL_error);
                    }
                }), this.classGuid);
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLObject() {
                public static int constructor = 405695855;

                @Override
                public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z2) {
                    return TLRPC$TL_account_webAuthorizations.TLdeserialize(abstractSerializedData, i, z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData) {
                    abstractSerializedData.writeInt32(constructor);
                }
            }, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SessionsActivity.this.lambda$loadSessions$17(tLObject, tLRPC$TL_error);
                }
            }), this.classGuid);
        }
    }

    public void lambda$loadSessions$15(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SessionsActivity.this.lambda$loadSessions$14(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadSessions$14(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        this.loading = false;
        int itemCount = this.listAdapter.getItemCount();
        if (tLRPC$TL_error == null) {
            this.sessions.clear();
            this.passwordSessions.clear();
            TLRPC$TL_account_authorizations tLRPC$TL_account_authorizations = (TLRPC$TL_account_authorizations) tLObject;
            int size = tLRPC$TL_account_authorizations.authorizations.size();
            for (int i = 0; i < size; i++) {
                TLRPC$TL_authorization tLRPC$TL_authorization = tLRPC$TL_account_authorizations.authorizations.get(i);
                if ((tLRPC$TL_authorization.flags & 1) != 0) {
                    this.currentSession = tLRPC$TL_authorization;
                } else if (tLRPC$TL_authorization.password_pending) {
                    this.passwordSessions.add(tLRPC$TL_authorization);
                } else {
                    this.sessions.add(tLRPC$TL_authorization);
                }
            }
            this.ttlDays = tLRPC$TL_account_authorizations.authorization_ttl_days;
            updateRows();
        }
        this.itemsEnterAnimator.showItemsAnimated(itemCount + 1);
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$loadSessions$17(final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SessionsActivity.this.lambda$loadSessions$16(tLRPC$TL_error, tLObject);
            }
        });
    }

    public void lambda$loadSessions$16(TLRPC$TL_error tLRPC$TL_error, TLObject tLObject) {
        this.loading = false;
        if (tLRPC$TL_error == null) {
            this.sessions.clear();
            TLRPC$TL_account_webAuthorizations tLRPC$TL_account_webAuthorizations = (TLRPC$TL_account_webAuthorizations) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_account_webAuthorizations.users, false);
            this.sessions.addAll(tLRPC$TL_account_webAuthorizations.authorizations);
            updateRows();
        }
        this.itemsEnterAnimator.showItemsAnimated(0);
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void updateRows() {
        this.rowCount = 0;
        this.currentSessionSectionRow = -1;
        this.currentSessionRow = -1;
        this.terminateAllSessionsRow = -1;
        this.terminateAllSessionsDetailRow = -1;
        this.passwordSessionsSectionRow = -1;
        this.passwordSessionsStartRow = -1;
        this.passwordSessionsEndRow = -1;
        this.passwordSessionsDetailRow = -1;
        this.otherSessionsSectionRow = -1;
        this.otherSessionsStartRow = -1;
        this.otherSessionsEndRow = -1;
        this.otherSessionsTerminateDetail = -1;
        this.noOtherSessionsRow = -1;
        this.qrCodeRow = -1;
        this.qrCodeDividerRow = -1;
        this.ttlHeaderRow = -1;
        this.ttlRow = -1;
        this.ttlDivideRow = -1;
        if (this.currentType == 0) {
            boolean z = getMessagesController().qrLoginCamera;
        }
        int i = this.rowCount;
        int i2 = i + 1;
        this.rowCount = i2;
        this.qrCodeRow = i;
        int i3 = i2 + 1;
        this.rowCount = i3;
        this.qrCodeDividerRow = i2;
        if (!this.loading) {
            if (this.currentSession != null) {
                int i4 = i3 + 1;
                this.rowCount = i4;
                this.currentSessionSectionRow = i3;
                this.rowCount = i4 + 1;
                this.currentSessionRow = i4;
            }
            if (!this.passwordSessions.isEmpty() || !this.sessions.isEmpty()) {
                int i5 = this.rowCount;
                int i6 = i5 + 1;
                this.rowCount = i6;
                this.terminateAllSessionsRow = i5;
                this.rowCount = i6 + 1;
                this.terminateAllSessionsDetailRow = i6;
                this.noOtherSessionsRow = -1;
            } else {
                this.terminateAllSessionsRow = -1;
                this.terminateAllSessionsDetailRow = -1;
                if (this.currentType == 1 || this.currentSession != null) {
                    int i7 = this.rowCount;
                    this.rowCount = i7 + 1;
                    this.noOtherSessionsRow = i7;
                } else {
                    this.noOtherSessionsRow = -1;
                }
            }
            if (!this.passwordSessions.isEmpty()) {
                int i8 = this.rowCount;
                int i9 = i8 + 1;
                this.rowCount = i9;
                this.passwordSessionsSectionRow = i8;
                this.passwordSessionsStartRow = i9;
                int size = i9 + this.passwordSessions.size();
                this.rowCount = size;
                this.passwordSessionsEndRow = size;
                this.rowCount = size + 1;
                this.passwordSessionsDetailRow = size;
            }
            if (!this.sessions.isEmpty()) {
                int i10 = this.rowCount;
                int i11 = i10 + 1;
                this.rowCount = i11;
                this.otherSessionsSectionRow = i10;
                this.otherSessionsStartRow = i11;
                this.otherSessionsEndRow = i11 + this.sessions.size();
                int size2 = this.rowCount + this.sessions.size();
                this.rowCount = size2;
                this.rowCount = size2 + 1;
                this.otherSessionsTerminateDetail = size2;
            }
            if (this.ttlDays > 0) {
                int i12 = this.rowCount;
                int i13 = i12 + 1;
                this.rowCount = i13;
                this.ttlHeaderRow = i12;
                int i14 = i13 + 1;
                this.rowCount = i14;
                this.ttlRow = i13;
                this.rowCount = i14 + 1;
                this.ttlDivideRow = i14;
            }
        } else if (this.currentType == 0) {
            int i15 = i3 + 1;
            this.rowCount = i15;
            this.currentSessionSectionRow = i3;
            this.rowCount = i15 + 1;
            this.currentSessionRow = i15;
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            return adapterPosition == SessionsActivity.this.terminateAllSessionsRow || (adapterPosition >= SessionsActivity.this.otherSessionsStartRow && adapterPosition < SessionsActivity.this.otherSessionsEndRow) || ((adapterPosition >= SessionsActivity.this.passwordSessionsStartRow && adapterPosition < SessionsActivity.this.passwordSessionsEndRow) || adapterPosition == SessionsActivity.this.currentSessionRow || adapterPosition == SessionsActivity.this.ttlRow);
        }

        @Override
        public int getItemCount() {
            return SessionsActivity.this.rowCount;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            if (i == 0) {
                view = new TextCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 1) {
                view = new TextInfoPrivacyCell(this.mContext);
            } else if (i == 2) {
                view = new HeaderCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else if (i == 3) {
                view = SessionsActivity.this.emptyLayout;
            } else if (i == 5) {
                view = new ScanQRCodeView(this.mContext);
            } else if (i != 6) {
                view = new SessionCell(this.mContext, SessionsActivity.this.currentType);
                view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            } else {
                view = new TextSettingsCell(this.mContext);
                view.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            }
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            boolean z = true;
            int i2 = 0;
            if (itemViewType == 0) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (i == SessionsActivity.this.terminateAllSessionsRow) {
                    textCell.setColors("windowBackgroundWhiteRedText2", "windowBackgroundWhiteRedText2");
                    textCell.setTag("windowBackgroundWhiteRedText2");
                    if (SessionsActivity.this.currentType == 0) {
                        textCell.setTextAndIcon(LocaleController.getString("TerminateAllSessions", C0952R.string.TerminateAllSessions), C0952R.C0953drawable.msg_block2, false);
                    } else {
                        textCell.setTextAndIcon(LocaleController.getString("TerminateAllWebSessions", C0952R.string.TerminateAllWebSessions), C0952R.C0953drawable.msg_block2, false);
                    }
                } else if (i == SessionsActivity.this.qrCodeRow) {
                    textCell.setColors("windowBackgroundWhiteBlueText4", "windowBackgroundWhiteBlueText4");
                    textCell.setTag("windowBackgroundWhiteBlueText4");
                    textCell.setTextAndIcon(LocaleController.getString("AuthAnotherClient", C0952R.string.AuthAnotherClient), C0952R.C0953drawable.msg_qrcode, true ^ SessionsActivity.this.sessions.isEmpty());
                }
            } else if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setFixedSize(0);
                if (i == SessionsActivity.this.terminateAllSessionsDetailRow) {
                    if (SessionsActivity.this.currentType == 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString("ClearOtherSessionsHelp", C0952R.string.ClearOtherSessionsHelp));
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString("ClearOtherWebSessionsHelp", C0952R.string.ClearOtherWebSessionsHelp));
                    }
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                } else if (i == SessionsActivity.this.otherSessionsTerminateDetail) {
                    if (SessionsActivity.this.currentType != 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString("TerminateWebSessionInfo", C0952R.string.TerminateWebSessionInfo));
                    } else if (SessionsActivity.this.sessions.isEmpty()) {
                        textInfoPrivacyCell.setText("");
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString("SessionsListInfo", C0952R.string.SessionsListInfo));
                    }
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                } else if (i == SessionsActivity.this.passwordSessionsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString("LoginAttemptsInfo", C0952R.string.LoginAttemptsInfo));
                    if (SessionsActivity.this.otherSessionsTerminateDetail == -1) {
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0952R.C0953drawable.greydivider_bottom, "windowBackgroundGrayShadow"));
                    } else {
                        textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                    }
                } else if (i == SessionsActivity.this.qrCodeDividerRow || i == SessionsActivity.this.ttlDivideRow || i == SessionsActivity.this.noOtherSessionsRow) {
                    textInfoPrivacyCell.setBackgroundDrawable(Theme.getThemedDrawable(this.mContext, (int) C0952R.C0953drawable.greydivider, "windowBackgroundGrayShadow"));
                    textInfoPrivacyCell.setText("");
                    textInfoPrivacyCell.setFixedSize(12);
                }
            } else if (itemViewType != 2) {
                int i3 = 30;
                if (itemViewType == 3) {
                    ViewGroup.LayoutParams layoutParams = SessionsActivity.this.emptyLayout.getLayoutParams();
                    if (layoutParams != null) {
                        int dp = AndroidUtilities.m34dp(220.0f);
                        int currentActionBarHeight = AndroidUtilities.displaySize.y - C1006ActionBar.getCurrentActionBarHeight();
                        if (SessionsActivity.this.qrCodeRow == -1) {
                            i3 = 0;
                        }
                        int dp2 = currentActionBarHeight - AndroidUtilities.m34dp(i3 + ConnectionsManager.RequestFlagNeedQuickAck);
                        if (Build.VERSION.SDK_INT >= 21) {
                            i2 = AndroidUtilities.statusBarHeight;
                        }
                        layoutParams.height = Math.max(dp, dp2 - i2);
                        SessionsActivity.this.emptyLayout.setLayoutParams(layoutParams);
                    }
                } else if (itemViewType == 5) {
                } else {
                    if (itemViewType != 6) {
                        SessionCell sessionCell = (SessionCell) viewHolder.itemView;
                        if (i == SessionsActivity.this.currentSessionRow) {
                            if (SessionsActivity.this.currentSession == null) {
                                sessionCell.showStub(SessionsActivity.this.globalFlickerLoadingView);
                                return;
                            }
                            TLRPC$TL_authorization tLRPC$TL_authorization = SessionsActivity.this.currentSession;
                            if (SessionsActivity.this.sessions.isEmpty() && SessionsActivity.this.passwordSessions.isEmpty() && SessionsActivity.this.qrCodeRow == -1) {
                                z = false;
                            }
                            sessionCell.setSession(tLRPC$TL_authorization, z);
                        } else if (i >= SessionsActivity.this.otherSessionsStartRow && i < SessionsActivity.this.otherSessionsEndRow) {
                            TLObject tLObject = (TLObject) SessionsActivity.this.sessions.get(i - SessionsActivity.this.otherSessionsStartRow);
                            if (i == SessionsActivity.this.otherSessionsEndRow - 1) {
                                z = false;
                            }
                            sessionCell.setSession(tLObject, z);
                        } else if (i >= SessionsActivity.this.passwordSessionsStartRow && i < SessionsActivity.this.passwordSessionsEndRow) {
                            TLObject tLObject2 = (TLObject) SessionsActivity.this.passwordSessions.get(i - SessionsActivity.this.passwordSessionsStartRow);
                            if (i == SessionsActivity.this.passwordSessionsEndRow - 1) {
                                z = false;
                            }
                            sessionCell.setSession(tLObject2, z);
                        }
                    } else {
                        ((TextSettingsCell) viewHolder.itemView).setTextAndValue(LocaleController.getString("IfInactiveFor", C0952R.string.IfInactiveFor), (SessionsActivity.this.ttlDays <= 30 || SessionsActivity.this.ttlDays > 183) ? SessionsActivity.this.ttlDays == 365 ? LocaleController.formatPluralString("Years", SessionsActivity.this.ttlDays / 365) : LocaleController.formatPluralString("Weeks", SessionsActivity.this.ttlDays / 7) : LocaleController.formatPluralString("Months", SessionsActivity.this.ttlDays / 30), false);
                    }
                }
            } else {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == SessionsActivity.this.currentSessionSectionRow) {
                    headerCell.setText(LocaleController.getString("CurrentSession", C0952R.string.CurrentSession));
                } else if (i == SessionsActivity.this.otherSessionsSectionRow) {
                    if (SessionsActivity.this.currentType == 0) {
                        headerCell.setText(LocaleController.getString("OtherSessions", C0952R.string.OtherSessions));
                    } else {
                        headerCell.setText(LocaleController.getString("OtherWebSessions", C0952R.string.OtherWebSessions));
                    }
                } else if (i == SessionsActivity.this.passwordSessionsSectionRow) {
                    headerCell.setText(LocaleController.getString("LoginAttempts", C0952R.string.LoginAttempts));
                } else if (i == SessionsActivity.this.ttlHeaderRow) {
                    headerCell.setText(LocaleController.getString("TerminateOldSessionHeader", C0952R.string.TerminateOldSessionHeader));
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == SessionsActivity.this.terminateAllSessionsRow) {
                return 0;
            }
            if (i == SessionsActivity.this.terminateAllSessionsDetailRow || i == SessionsActivity.this.otherSessionsTerminateDetail || i == SessionsActivity.this.passwordSessionsDetailRow || i == SessionsActivity.this.qrCodeDividerRow || i == SessionsActivity.this.ttlDivideRow || i == SessionsActivity.this.noOtherSessionsRow) {
                return 1;
            }
            if (i == SessionsActivity.this.currentSessionSectionRow || i == SessionsActivity.this.otherSessionsSectionRow || i == SessionsActivity.this.passwordSessionsSectionRow || i == SessionsActivity.this.ttlHeaderRow) {
                return 2;
            }
            if (i == SessionsActivity.this.currentSessionRow) {
                return 4;
            }
            if (i >= SessionsActivity.this.otherSessionsStartRow && i < SessionsActivity.this.otherSessionsEndRow) {
                return 4;
            }
            if (i >= SessionsActivity.this.passwordSessionsStartRow && i < SessionsActivity.this.passwordSessionsEndRow) {
                return 4;
            }
            if (i == SessionsActivity.this.qrCodeRow) {
                return 5;
            }
            return i == SessionsActivity.this.ttlRow ? 6 : 0;
        }
    }

    public class ScanQRCodeView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        BackupImageView imageView;
        TextView textView;

        public ScanQRCodeView(Context context) {
            super(context);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
            this.imageView.setOnClickListener(new View.OnClickListener(SessionsActivity.this) {
                @Override
                public void onClick(View view) {
                    if (ScanQRCodeView.this.imageView.getImageReceiver().getLottieAnimation() != null && !ScanQRCodeView.this.imageView.getImageReceiver().getLottieAnimation().isRunning()) {
                        ScanQRCodeView.this.imageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                        ScanQRCodeView.this.imageView.getImageReceiver().getLottieAnimation().restart();
                    }
                }
            });
            Theme.getColor("windowBackgroundWhiteBlackText");
            Theme.getColor("windowBackgroundWhite");
            Theme.getColor("featuredStickers_addButton");
            Theme.getColor("windowBackgroundWhite");
            TextView textView = new TextView(context);
            this.textView = textView;
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
            this.textView.setGravity(1);
            this.textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
            this.textView.setTextSize(1, 15.0f);
            this.textView.setLinkTextColor(Theme.getColor("windowBackgroundWhiteLinkText"));
            this.textView.setHighlightColor(Theme.getColor("windowBackgroundWhiteLinkSelection"));
            setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            String string = LocaleController.getString("AuthAnotherClientInfo4", C0952R.string.AuthAnotherClientInfo4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int indexOf = string.indexOf(42);
            int i = indexOf + 1;
            int indexOf2 = string.indexOf(42, i);
            if (!(indexOf == -1 || indexOf2 == -1 || indexOf == indexOf2)) {
                this.textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                spannableStringBuilder.replace(indexOf2, indexOf2 + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf, i, (CharSequence) "");
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString("AuthAnotherClientDownloadClientUrl", C0952R.string.AuthAnotherClientDownloadClientUrl)), indexOf, indexOf2 - 1, 33);
            }
            String spannableStringBuilder2 = spannableStringBuilder.toString();
            int indexOf3 = spannableStringBuilder2.indexOf(42);
            int i2 = indexOf3 + 1;
            int indexOf4 = spannableStringBuilder2.indexOf(42, i2);
            if (!(indexOf3 == -1 || indexOf4 == -1 || indexOf3 == indexOf4)) {
                this.textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                spannableStringBuilder.replace(indexOf4, indexOf4 + 1, (CharSequence) "");
                spannableStringBuilder.replace(indexOf3, i2, (CharSequence) "");
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString("AuthAnotherWebClientUrl", C0952R.string.AuthAnotherWebClientUrl)), indexOf3, indexOf4 - 1, 33);
            }
            this.textView.setText(spannableStringBuilder);
            TextView textView2 = new TextView(context);
            textView2.setPadding(AndroidUtilities.m34dp(34.0f), 0, AndroidUtilities.m34dp(34.0f), 0);
            textView2.setGravity(17);
            textView2.setTextSize(1, 14.0f);
            textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder();
            spannableStringBuilder3.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString("LinkDesktopDevice", C0952R.string.LinkDesktopDevice));
            spannableStringBuilder3.setSpan(new ColoredImageSpan(ContextCompat.getDrawable(getContext(), C0952R.C0953drawable.msg_mini_qr)), 0, 1, 0);
            textView2.setText(spannableStringBuilder3);
            textView2.setTextColor(Theme.getColor("featuredStickers_buttonText"));
            textView2.setBackgroundDrawable(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(6.0f), Theme.getColor("featuredStickers_addButton"), Theme.getColor("featuredStickers_addButtonPressed")));
            textView2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    SessionsActivity.ScanQRCodeView.this.lambda$new$0(view);
                }
            });
            addView(textView2, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
            setSticker();
        }

        public void lambda$new$0(View view) {
            if (SessionsActivity.this.getParentActivity() != null) {
                if (Build.VERSION.SDK_INT < 23 || SessionsActivity.this.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                    SessionsActivity.this.openCameraScanActivity();
                } else {
                    SessionsActivity.this.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
                }
            }
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(276.0f), 1073741824));
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker();
            NotificationCenter.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME.equals((String) objArr[0])) {
                setSticker();
            }
        }

        private void setSticker() {
            TLRPC$TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).getStickerSetByName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
            if (stickerSetByName == null) {
                stickerSetByName = MediaDataController.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).getStickerSetByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME);
            }
            TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = stickerSetByName;
            SvgHelper.SvgDrawable svgDrawable = null;
            TLRPC$Document tLRPC$Document = (tLRPC$TL_messages_stickerSet == null || tLRPC$TL_messages_stickerSet.documents.size() <= 6) ? null : tLRPC$TL_messages_stickerSet.documents.get(6);
            if (tLRPC$Document != null) {
                svgDrawable = DocumentObject.getSvgThumb(tLRPC$Document.thumbs, "emptyListPlaceholder", 0.2f);
            }
            SvgHelper.SvgDrawable svgDrawable2 = svgDrawable;
            if (svgDrawable2 != null) {
                svgDrawable2.overrideWidthAndHeight(512, 512);
            }
            if (tLRPC$Document != null) {
                this.imageView.setImage(ImageLocation.getForDocument(tLRPC$Document), "130_130", "tgs", svgDrawable2, tLRPC$TL_messages_stickerSet);
                this.imageView.getImageReceiver().setAutoRepeat(2);
                return;
            }
            MediaDataController.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).loadStickersByEmojiOrName(AndroidUtilities.STICKERS_PLACEHOLDER_PACK_NAME, false, tLRPC$TL_messages_stickerSet == null);
        }
    }

    public class C34985 implements CameraScanActivity.CameraScanActivityDelegate {
        private TLObject response = null;
        private TLRPC$TL_error error = null;

        @Override
        public void didFindMrzInfo(MrzRecognizer.Result result) {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
        }

        C34985() {
        }

        @Override
        public void didFindQr(String str) {
            TLObject tLObject = this.response;
            if (tLObject instanceof TLRPC$TL_authorization) {
                SessionsActivity.this.sessions.add(0, (TLRPC$TL_authorization) tLObject);
                SessionsActivity.this.updateRows();
                SessionsActivity.this.listAdapter.notifyDataSetChanged();
                SessionsActivity.this.undoView.showWithAction(0L, 11, this.response);
            } else if (this.error != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SessionsActivity.C34985.this.lambda$didFindQr$0();
                    }
                });
            }
        }

        public void lambda$didFindQr$0() {
            String str;
            String str2 = this.error.text;
            if (str2 == null || !str2.equals("AUTH_TOKEN_EXCEPTION")) {
                str = LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred) + "\n" + this.error.text;
            } else {
                str = LocaleController.getString("AccountAlreadyLoggedIn", C0952R.string.AccountAlreadyLoggedIn);
            }
            AlertsCreator.showSimpleAlert(SessionsActivity.this, LocaleController.getString("AuthAnotherClient", C0952R.string.AuthAnotherClient), str);
        }

        @Override
        public boolean processQr(final String str, final Runnable runnable) {
            this.response = null;
            this.error = null;
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SessionsActivity.C34985.this.lambda$processQr$4(str, runnable);
                }
            }, 750L);
            return true;
        }

        public void lambda$processQr$4(String str, final Runnable runnable) {
            try {
                byte[] decode = Base64.decode(str.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                TLRPC$TL_auth_acceptLoginToken tLRPC$TL_auth_acceptLoginToken = new TLRPC$TL_auth_acceptLoginToken();
                tLRPC$TL_auth_acceptLoginToken.token = decode;
                SessionsActivity.this.getConnectionsManager().sendRequest(tLRPC$TL_auth_acceptLoginToken, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        SessionsActivity.C34985.this.lambda$processQr$2(runnable, tLObject, tLRPC$TL_error);
                    }
                });
            } catch (Exception e) {
                FileLog.m31e("Failed to pass qr code auth", e);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SessionsActivity.C34985.this.lambda$processQr$3();
                    }
                });
                runnable.run();
            }
        }

        public void lambda$processQr$2(final Runnable runnable, final TLObject tLObject, final TLRPC$TL_error tLRPC$TL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SessionsActivity.C34985.this.lambda$processQr$1(tLObject, tLRPC$TL_error, runnable);
                }
            });
        }

        public void lambda$processQr$1(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error, Runnable runnable) {
            this.response = tLObject;
            this.error = tLRPC$TL_error;
            runnable.run();
        }

        public void lambda$processQr$3() {
            AlertsCreator.showSimpleAlert(SessionsActivity.this, LocaleController.getString("AuthAnotherClient", C0952R.string.AuthAnotherClient), LocaleController.getString("ErrorOccurred", C0952R.string.ErrorOccurred));
        }
    }

    public void openCameraScanActivity() {
        CameraScanActivity.showAsSheet(this, false, 2, new C34985());
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{TextSettingsCell.class, HeaderCell.class, SessionCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.imageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "sessions_devicesImage"));
        arrayList.add(new ThemeDescription(this.textView1, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.textView2, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "windowBackgroundWhiteGrayText2"));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_PROGRESSBAR, null, null, null, null, "progressCircle"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText2"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_TEXTCOLOR | ThemeDescription.FLAG_CHECKTAG, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueText4"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{TextInfoPrivacyCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlueHeader"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SessionCell.class}, new String[]{"onlineTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SessionCell.class}, new String[]{"onlineTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"detailTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"detailExTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "undo_background"));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText2"));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteRedText2"));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
        arrayList.add(new ThemeDescription(this.undoView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{UndoView.class}, new String[]{"leftImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
        return arrayList;
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() == null || i != 34) {
            return;
        }
        if (iArr.length <= 0 || iArr[0] != 0) {
            new AlertDialog.Builder(getParentActivity()).setMessage(AndroidUtilities.replaceTags(LocaleController.getString("QRCodePermissionNoCameraWithHint", C0952R.string.QRCodePermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString("PermissionOpenSettings", C0952R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    SessionsActivity.this.lambda$onRequestPermissionsResultFragment$18(dialogInterface, i2);
                }
            }).setNegativeButton(LocaleController.getString("ContactsPermissionAlertNotNow", C0952R.string.ContactsPermissionAlertNotNow), null).setTopAnimation(C0952R.raw.permission_request_camera, 72, false, Theme.getColor("dialogTopBackground")).show();
        } else {
            openCameraScanActivity();
        }
    }

    public void lambda$onRequestPermissionsResultFragment$18(DialogInterface dialogInterface, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }
}
