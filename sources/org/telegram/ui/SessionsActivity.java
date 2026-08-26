package org.telegram.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MrzRecognizer;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Business.BusinessChatbotController;
import org.telegram.ui.Business.ChatbotSheet;
import org.telegram.ui.Cells.CheckBoxCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.RadioColorCell;
import org.telegram.ui.Cells.SessionCell;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Cells.TextInfoPrivacyCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CombinedDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.URLSpanNoUnderline;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.voip.CellFlickerDrawable;

public class SessionsActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public static final int TYPE_DEVICES = 0;
    public static final int TYPE_WEB_SESSIONS = 1;
    private final int VIEW_TYPE_HEADER;
    private final int VIEW_TYPE_INFO;
    private final int VIEW_TYPE_SCANQR;
    private final int VIEW_TYPE_SESSION;
    private final int VIEW_TYPE_SETTINGS;
    private final int VIEW_TYPE_TEXT;
    private int botSessionsEndRow;
    private int botSessionsStartRow;
    private ArrayList<TL_account.TL_connectedBot> bots;
    private TLRPC.TL_authorization currentSession;
    private int currentSessionRow;
    private int currentSessionSectionRow;
    private int currentType;
    private Delegate delegate;
    private EmptyTextProgressView emptyView;
    private boolean fragmentOpened;
    private FlickerLoadingView globalFlickerLoadingView;
    private boolean highlightLinkDesktopDevice;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private boolean loading;
    private int noOtherSessionsRow;
    private int otherSessionsEndRow;
    private int otherSessionsSectionRow;
    private int otherSessionsStartRow;
    private int otherSessionsTerminateDetail;
    private ArrayList<TLObject> passwordSessions;
    private int passwordSessionsDetailRow;
    private int passwordSessionsEndRow;
    private int passwordSessionsSectionRow;
    private int passwordSessionsStartRow;
    private int qrCodeDividerRow;
    private int qrCodeRow;
    private int repeatLoad;
    private int rowCount;
    private ArrayList<TLObject> sessions;
    private int terminateAllSessionsDetailRow;
    private int terminateAllSessionsRow;
    private int ttlDays;
    private int ttlDivideRow;
    private int ttlHeaderRow;
    private int ttlRow;
    private UndoView undoView;

    public class AnonymousClass4 extends UndoView {
        public AnonymousClass4(Context context) {
            super(context);
        }

        public void lambda$hide$0(TLRPC.TL_error tL_error, TLRPC.TL_authorization tL_authorization) {
            if (tL_error == null) {
                SessionsActivity.this.sessions.remove(tL_authorization);
                SessionsActivity.this.passwordSessions.remove(tL_authorization);
                SessionsActivity.this.updateRows();
                if (SessionsActivity.this.listAdapter != null) {
                    SessionsActivity.this.listAdapter.notifyDataSetChanged();
                }
                SessionsActivity.this.lambda$loadSessions$24(true);
            }
        }

        public void lambda$hide$1(TLRPC.TL_authorization tL_authorization, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, tL_error, tL_authorization, 19));
        }

        @Override
        public void hide(boolean z, int i) {
            if (!z && getCurrentInfoObject() != null) {
                TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) getCurrentInfoObject();
                TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
                resetauthorization.hash = tL_authorization.hash;
                ConnectionsManager.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).sendRequest(resetauthorization, new IntroActivity$$ExternalSyntheticLambda6(10, this, tL_authorization));
            }
            super.hide(z, i);
        }
    }

    public class AnonymousClass5 implements SessionBottomSheet.Callback {
        public AnonymousClass5() {
        }

        public void lambda$onSessionTerminated$0(TLRPC.TL_error tL_error, TLRPC.TL_authorization tL_authorization) {
            if (tL_error == null) {
                SessionsActivity.this.sessions.remove(tL_authorization);
                SessionsActivity.this.passwordSessions.remove(tL_authorization);
                SessionsActivity.this.updateRows();
                if (SessionsActivity.this.listAdapter != null) {
                    SessionsActivity.this.listAdapter.notifyDataSetChanged();
                }
            }
        }

        public void lambda$onSessionTerminated$1(TLRPC.TL_authorization tL_authorization, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0(this, tL_error, tL_authorization, 20));
        }

        @Override
        public void onSessionTerminated(TLRPC.TL_authorization tL_authorization) {
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).sendRequest(resetauthorization, new IntroActivity$$ExternalSyntheticLambda6(11, this, tL_authorization));
        }
    }

    public class AnonymousClass6 implements CameraScanActivity.CameraScanActivityDelegate {
        private TLObject response = null;
        private TLRPC.TL_error error = null;

        public AnonymousClass6() {
        }

        public void lambda$didFindQr$0() {
            String string;
            String str = this.error.text;
            if (str == null || !str.equals("AUTH_TOKEN_EXCEPTION")) {
                StringBuilder sb = new StringBuilder();
                zzko.m(R.string.ErrorOccurred, "\n", sb);
                sb.append(this.error.text);
                string = sb.toString();
            } else {
                string = LocaleController.getString(R.string.AccountAlreadyLoggedIn);
            }
            AlertsCreator.showSimpleAlert(SessionsActivity.this, LocaleController.getString(R.string.AuthAnotherClient), string);
        }

        public void lambda$processQr$1(TLObject tLObject, TLRPC.TL_error tL_error, Runnable runnable) {
            this.response = tLObject;
            this.error = tL_error;
            runnable.run();
        }

        public void lambda$processQr$2(Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda5(12, this, tLObject, tL_error, runnable));
        }

        public void lambda$processQr$3() {
            AlertsCreator.showSimpleAlert(SessionsActivity.this, LocaleController.getString(R.string.AuthAnotherClient), LocaleController.getString(R.string.ErrorOccurred));
        }

        public void lambda$processQr$4(String str, Runnable runnable) {
            try {
                byte[] bArrDecode = Base64.decode(str.substring(17).replaceAll("\\/", "_").replaceAll("\\+", "-"), 8);
                TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
                tL_auth_acceptLoginToken.token = bArrDecode;
                SessionsActivity.this.getConnectionsManager().sendRequest(tL_auth_acceptLoginToken, new IntroActivity$$ExternalSyntheticLambda6(12, this, runnable));
            } catch (Exception e) {
                FileLog.e("Failed to pass qr code auth", e);
                AndroidUtilities.runOnUIThread(new SessionsActivity$6$$ExternalSyntheticLambda1(this, 0));
                runnable.run();
            }
        }

        @Override
        public final void didFindMrzInfo(MrzRecognizer.Result result) {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$didFindMrzInfo(this, result);
        }

        @Override
        public void didFindQr(String str) {
            TLObject tLObject = this.response;
            if (!(tLObject instanceof TLRPC.TL_authorization)) {
                if (this.error != null) {
                    AndroidUtilities.runOnUIThread(new SessionsActivity$6$$ExternalSyntheticLambda1(this, 1));
                    return;
                }
                return;
            }
            TLRPC.TL_authorization tL_authorization = (TLRPC.TL_authorization) tLObject;
            if (tL_authorization.password_pending) {
                SessionsActivity.this.passwordSessions.add(0, tL_authorization);
                SessionsActivity.this.repeatLoad = 4;
                SessionsActivity.this.lambda$loadSessions$24(false);
            } else {
                SessionsActivity.this.sessions.add(0, tL_authorization);
            }
            SessionsActivity.this.updateRows();
            SessionsActivity.this.listAdapter.notifyDataSetChanged();
            SessionsActivity.this.undoView.showWithAction(0L, 11, this.response);
        }

        @Override
        public final String getSubtitleText() {
            return CameraScanActivity.CameraScanActivityDelegate.CC.$default$getSubtitleText(this);
        }

        @Override
        public final void onDismiss() {
            CameraScanActivity.CameraScanActivityDelegate.CC.$default$onDismiss(this);
        }

        @Override
        public boolean processQr(String str, Runnable runnable) {
            this.response = null;
            this.error = null;
            AndroidUtilities.runOnUIThread(new PhotoViewer$86$$ExternalSyntheticLambda0((Object) this, (Object) str, runnable, 21), 750L);
            return true;
        }
    }

    public interface Delegate {
        void sessionsLoaded();
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;

        public ListAdapter(Context context) {
            this.mContext = context;
            setHasStableIds(true);
        }

        @Override
        public int getItemCount() {
            return SessionsActivity.this.rowCount;
        }

        @Override
        public long getItemId(int i) {
            int iHash;
            if (i == SessionsActivity.this.terminateAllSessionsRow) {
                iHash = Objects.hash(0, 0);
            } else if (i == SessionsActivity.this.terminateAllSessionsDetailRow) {
                iHash = Objects.hash(0, 1);
            } else if (i == SessionsActivity.this.otherSessionsTerminateDetail) {
                iHash = Objects.hash(0, 2);
            } else if (i == SessionsActivity.this.passwordSessionsDetailRow) {
                iHash = Objects.hash(0, 3);
            } else if (i == SessionsActivity.this.qrCodeDividerRow) {
                iHash = Objects.hash(0, 4);
            } else if (i == SessionsActivity.this.ttlDivideRow) {
                iHash = Objects.hash(0, 5);
            } else if (i == SessionsActivity.this.noOtherSessionsRow) {
                iHash = Objects.hash(0, 6);
            } else if (i == SessionsActivity.this.currentSessionSectionRow) {
                iHash = Objects.hash(0, 7);
            } else if (i == SessionsActivity.this.otherSessionsSectionRow) {
                iHash = Objects.hash(0, 8);
            } else if (i == SessionsActivity.this.passwordSessionsSectionRow) {
                iHash = Objects.hash(0, 9);
            } else if (i == SessionsActivity.this.ttlHeaderRow) {
                iHash = Objects.hash(0, 10);
            } else if (i == SessionsActivity.this.currentSessionRow) {
                iHash = Objects.hash(0, 11);
            } else if (i >= SessionsActivity.this.otherSessionsStartRow && i < SessionsActivity.this.otherSessionsEndRow) {
                TLObject tLObject = (TLObject) SessionsActivity.this.sessions.get(i - SessionsActivity.this.otherSessionsStartRow);
                if (tLObject instanceof TLRPC.TL_authorization) {
                    iHash = Objects.hash(1, Long.valueOf(((TLRPC.TL_authorization) tLObject).hash));
                } else if (tLObject instanceof TLRPC.TL_webAuthorization) {
                    iHash = Objects.hash(1, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject).hash));
                } else {
                    iHash = Objects.hash(0, -1);
                }
            } else if (i >= SessionsActivity.this.botSessionsStartRow && i < SessionsActivity.this.botSessionsEndRow) {
                iHash = Objects.hash(3, Long.valueOf(((TL_account.TL_connectedBot) SessionsActivity.this.bots.get(i - SessionsActivity.this.botSessionsStartRow)).bot_id));
            } else if (i >= SessionsActivity.this.passwordSessionsStartRow && i < SessionsActivity.this.passwordSessionsEndRow) {
                TLObject tLObject2 = (TLObject) SessionsActivity.this.passwordSessions.get(i - SessionsActivity.this.passwordSessionsStartRow);
                if (tLObject2 instanceof TLRPC.TL_authorization) {
                    iHash = Objects.hash(2, Long.valueOf(((TLRPC.TL_authorization) tLObject2).hash));
                } else if (tLObject2 instanceof TLRPC.TL_webAuthorization) {
                    iHash = Objects.hash(2, Long.valueOf(((TLRPC.TL_webAuthorization) tLObject2).hash));
                } else {
                    iHash = Objects.hash(0, -1);
                }
            } else if (i == SessionsActivity.this.qrCodeRow) {
                iHash = Objects.hash(0, 12);
            } else if (i == SessionsActivity.this.ttlRow) {
                iHash = Objects.hash(0, 13);
            } else {
                iHash = Objects.hash(0, -1);
            }
            return iHash;
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
            if (i >= SessionsActivity.this.botSessionsStartRow && i < SessionsActivity.this.botSessionsEndRow) {
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

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int adapterPosition = viewHolder.getAdapterPosition();
            if (adapterPosition == SessionsActivity.this.terminateAllSessionsRow) {
                return true;
            }
            if (adapterPosition >= SessionsActivity.this.otherSessionsStartRow && adapterPosition < SessionsActivity.this.otherSessionsEndRow) {
                return true;
            }
            if (adapterPosition < SessionsActivity.this.botSessionsStartRow || adapterPosition >= SessionsActivity.this.botSessionsEndRow) {
                return (adapterPosition >= SessionsActivity.this.passwordSessionsStartRow && adapterPosition < SessionsActivity.this.passwordSessionsEndRow) || adapterPosition == SessionsActivity.this.currentSessionRow || adapterPosition == SessionsActivity.this.ttlRow;
            }
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String pluralString;
            int itemViewType = viewHolder.getItemViewType();
            boolean z = false;
            if (itemViewType == 0) {
                TextCell textCell = (TextCell) viewHolder.itemView;
                if (i != SessionsActivity.this.terminateAllSessionsRow) {
                    if (i == SessionsActivity.this.qrCodeRow) {
                        int i2 = Theme.key_windowBackgroundWhiteBlueText4;
                        textCell.setColors(i2, i2);
                        textCell.setTag(Integer.valueOf(i2));
                        textCell.setTextAndIcon(LocaleController.getString(R.string.AuthAnotherClient), R.drawable.msg_qrcode, !SessionsActivity.this.sessions.isEmpty());
                        return;
                    }
                    return;
                }
                int i3 = Theme.key_text_RedRegular;
                textCell.setColors(i3, i3);
                textCell.setTag(Integer.valueOf(i3));
                if (SessionsActivity.this.currentType == 0) {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.TerminateAllSessions), R.drawable.msg_block2, false);
                    return;
                } else {
                    textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.TerminateAllWebSessions), R.drawable.msg_block2, false);
                    return;
                }
            }
            if (itemViewType == 1) {
                TextInfoPrivacyCell textInfoPrivacyCell = (TextInfoPrivacyCell) viewHolder.itemView;
                textInfoPrivacyCell.setFixedSize(0);
                if (i == SessionsActivity.this.terminateAllSessionsDetailRow) {
                    if (SessionsActivity.this.currentType == 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ClearOtherSessionsHelp));
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.ClearOtherWebSessionsHelp));
                        return;
                    }
                }
                if (i == SessionsActivity.this.otherSessionsTerminateDetail) {
                    if (SessionsActivity.this.currentType != 0) {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.TerminateWebSessionInfo));
                        return;
                    } else if (SessionsActivity.this.sessions.isEmpty()) {
                        textInfoPrivacyCell.setText("");
                        return;
                    } else {
                        textInfoPrivacyCell.setText(LocaleController.getString(R.string.SessionsListInfo));
                        return;
                    }
                }
                if (i == SessionsActivity.this.passwordSessionsDetailRow) {
                    textInfoPrivacyCell.setText(LocaleController.getString(R.string.LoginAttemptsInfo));
                    return;
                } else {
                    if (i == SessionsActivity.this.qrCodeDividerRow || i == SessionsActivity.this.ttlDivideRow || i == SessionsActivity.this.noOtherSessionsRow) {
                        textInfoPrivacyCell.setText("");
                        textInfoPrivacyCell.setFixedSize(12);
                        return;
                    }
                    return;
                }
            }
            if (itemViewType == 2) {
                HeaderCell headerCell = (HeaderCell) viewHolder.itemView;
                if (i == SessionsActivity.this.currentSessionSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.CurrentSession));
                    return;
                }
                if (i == SessionsActivity.this.otherSessionsSectionRow) {
                    if (SessionsActivity.this.currentType == 0) {
                        headerCell.setText(LocaleController.getString(R.string.OtherSessions));
                        return;
                    } else {
                        headerCell.setText(LocaleController.getString(R.string.OtherWebSessions));
                        return;
                    }
                }
                if (i == SessionsActivity.this.passwordSessionsSectionRow) {
                    headerCell.setText(LocaleController.getString(R.string.LoginAttempts));
                    return;
                } else {
                    if (i == SessionsActivity.this.ttlHeaderRow) {
                        headerCell.setText(LocaleController.getString(R.string.TerminateOldSessionHeader));
                        return;
                    }
                    return;
                }
            }
            if (itemViewType != 5) {
                if (itemViewType == 6) {
                    TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                    if (SessionsActivity.this.ttlDays <= 30 || SessionsActivity.this.ttlDays > 183) {
                        pluralString = SessionsActivity.this.ttlDays == 365 ? LocaleController.formatPluralString("Years", SessionsActivity.this.ttlDays / 365, new Object[0]) : LocaleController.formatPluralString("Weeks", SessionsActivity.this.ttlDays / 7, new Object[0]);
                    } else {
                        pluralString = LocaleController.formatPluralString("Months", SessionsActivity.this.ttlDays / 30, new Object[0]);
                    }
                    textSettingsCell.setTextAndValue(LocaleController.getString(R.string.IfInactiveFor), pluralString, true, false);
                    return;
                }
                SessionCell sessionCell = (SessionCell) viewHolder.itemView;
                if (i == SessionsActivity.this.currentSessionRow) {
                    if (SessionsActivity.this.currentSession != null) {
                        sessionCell.setSession(SessionsActivity.this.currentSession, (SessionsActivity.this.sessions.isEmpty() && SessionsActivity.this.passwordSessions.isEmpty() && SessionsActivity.this.qrCodeRow == -1) ? false : true);
                        return;
                    }
                    sessionCell.globalGradient = SessionsActivity.this.globalFlickerLoadingView;
                    sessionCell.showStub = true;
                    Drawable drawableMutate = ApplicationLoader.applicationContext.getDrawable(AndroidUtilities.isTablet() ? R.drawable.device_tablet_android : R.drawable.device_phone_android).mutate();
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_avatar_text, false), PorterDuff.Mode.SRC_IN));
                    CombinedDrawable combinedDrawable = new CombinedDrawable(Theme.createCircleDrawable(AndroidUtilities.dp(42.0f), Theme.getColor(null, Theme.key_avatar_backgroundGreen, false)), drawableMutate);
                    BackupImageView backupImageView = sessionCell.placeholderImageView;
                    if (backupImageView != null) {
                        backupImageView.setImageDrawable(combinedDrawable);
                    } else {
                        sessionCell.imageView.setImageDrawable(combinedDrawable);
                    }
                    sessionCell.invalidate();
                    return;
                }
                if (i >= SessionsActivity.this.otherSessionsStartRow && i < SessionsActivity.this.otherSessionsEndRow) {
                    sessionCell.setSession((TLObject) SessionsActivity.this.sessions.get(i - SessionsActivity.this.otherSessionsStartRow), i != SessionsActivity.this.otherSessionsEndRow - 1);
                    return;
                }
                if (i < SessionsActivity.this.botSessionsStartRow || i >= SessionsActivity.this.botSessionsEndRow) {
                    if (i < SessionsActivity.this.passwordSessionsStartRow || i >= SessionsActivity.this.passwordSessionsEndRow) {
                        return;
                    }
                    sessionCell.setSession((TLObject) SessionsActivity.this.passwordSessions.get(i - SessionsActivity.this.passwordSessionsStartRow), i != SessionsActivity.this.passwordSessionsEndRow - 1);
                    return;
                }
                int i4 = i - SessionsActivity.this.botSessionsStartRow;
                if (SessionsActivity.this.bots == null || i4 < 0 || i4 >= SessionsActivity.this.bots.size()) {
                    return;
                }
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) SessionsActivity.this.bots.get(i4);
                if (i != SessionsActivity.this.botSessionsEndRow - 1 && i != SessionsActivity.this.otherSessionsEndRow - 1) {
                    z = true;
                }
                sessionCell.setSession(tL_connectedBot, z);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View textCell;
            if (i == 0) {
                textCell = new TextCell(this.mContext);
            } else if (i == 1) {
                textCell = new TextInfoPrivacyCell(this.mContext, 24, null);
            } else if (i == 2) {
                textCell = new HeaderCell(this.mContext);
            } else if (i != 5) {
                textCell = i != 6 ? new SessionCell(this.mContext, SessionsActivity.this.currentType) : new TextSettingsCell(this.mContext, null, 0);
            } else {
                textCell = SessionsActivity.this.new ScanQRCodeView(this.mContext);
            }
            return new RecyclerListView.Holder(textCell);
        }
    }

    public class ScanQRCodeView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
        TextView buttonTextView;
        CellFlickerDrawable flickerDrawable;
        BackupImageView imageView;
        TextView textView;

        public ScanQRCodeView(Context context) {
            super(context);
            this.flickerDrawable = new CellFlickerDrawable(64, 204, 160);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            addView(backupImageView, LayoutHelper.createFrame(120, 120.0f, 1, 0.0f, 16.0f, 0.0f, 0.0f));
            CellFlickerDrawable cellFlickerDrawable = this.flickerDrawable;
            cellFlickerDrawable.repeatEnabled = false;
            cellFlickerDrawable.animationSpeedScale = 1.2f;
            this.imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (ScanQRCodeView.this.imageView.getImageReceiver().getLottieAnimation() == null || ScanQRCodeView.this.imageView.getImageReceiver().getLottieAnimation().isRunning()) {
                        return;
                    }
                    ScanQRCodeView.this.imageView.getImageReceiver().getLottieAnimation().setCurrentFrame(0, false);
                    ScanQRCodeView.this.imageView.getImageReceiver().getLottieAnimation().restart();
                }
            });
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.getColor(null, i, false);
            int i2 = Theme.key_windowBackgroundWhite;
            Theme.getColor(null, i2, false);
            int i3 = Theme.key_featuredStickers_addButton;
            Theme.getColor(null, i3, false);
            Theme.getColor(null, i2, false);
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.textView = linksTextView;
            addView(linksTextView, LayoutHelper.createFrame(-1, -2.0f, 0, 36.0f, 152.0f, 36.0f, 0.0f));
            this.textView.setGravity(1);
            this.textView.setTextColor(Theme.getColor(null, i, false));
            this.textView.setTextSize(1, 15.0f);
            this.textView.setLinkTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkText, false));
            this.textView.setHighlightColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteLinkSelection, false));
            String string = LocaleController.getString(R.string.AuthAnotherClientInfo4);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            int iIndexOf = string.indexOf(42);
            int i4 = iIndexOf + 1;
            int iIndexOf2 = string.indexOf(42, i4);
            if (iIndexOf != -1 && iIndexOf2 != -1 && iIndexOf != iIndexOf2) {
                this.textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                spannableStringBuilder.replace(iIndexOf2, iIndexOf2 + 1, (CharSequence) "");
                spannableStringBuilder.replace(iIndexOf, i4, (CharSequence) "");
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.AuthAnotherClientDownloadClientUrl)), iIndexOf, iIndexOf2 - 1, 33);
            }
            String string2 = spannableStringBuilder.toString();
            int iIndexOf3 = string2.indexOf(42);
            int i5 = iIndexOf3 + 1;
            int iIndexOf4 = string2.indexOf(42, i5);
            if (iIndexOf3 != -1 && iIndexOf4 != -1 && iIndexOf3 != iIndexOf4) {
                this.textView.setMovementMethod(new AndroidUtilities.LinkMovementMethodMy());
                spannableStringBuilder.replace(iIndexOf4, iIndexOf4 + 1, (CharSequence) "");
                spannableStringBuilder.replace(iIndexOf3, i5, (CharSequence) "");
                spannableStringBuilder.setSpan(new URLSpanNoUnderline(LocaleController.getString(R.string.AuthAnotherWebClientUrl)), iIndexOf3, iIndexOf4 - 1, 33);
            }
            this.textView.setText(spannableStringBuilder);
            TextView textView = new TextView(context) {
                @Override
                public void draw(Canvas canvas) {
                    super.draw(canvas);
                    ScanQRCodeView scanQRCodeView = ScanQRCodeView.this;
                    if (scanQRCodeView.flickerDrawable.progress <= 1.0f && SessionsActivity.this.highlightLinkDesktopDevice && SessionsActivity.this.fragmentOpened) {
                        RectF rectF = AndroidUtilities.rectTmp;
                        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                        ScanQRCodeView.this.flickerDrawable.parentWidth = getMeasuredWidth();
                        ScanQRCodeView.this.flickerDrawable.draw(null, canvas, rectF, AndroidUtilities.dp(8.0f));
                        invalidate();
                    }
                }
            };
            this.buttonTextView = textView;
            textView.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            this.buttonTextView.setGravity(17);
            this.buttonTextView.setTextSize(1, 14.0f);
            this.buttonTextView.setTypeface(AndroidUtilities.bold());
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) ".  ").append((CharSequence) LocaleController.getString(R.string.LinkDesktopDevice));
            spannableStringBuilder2.setSpan(new ColoredImageSpan(getContext().getDrawable(R.drawable.msg_mini_qr)), 0, 1, 0);
            this.buttonTextView.setText(spannableStringBuilder2);
            this.buttonTextView.setTextColor(Theme.getColor(null, Theme.key_featuredStickers_buttonText, false));
            TextView textView2 = this.buttonTextView;
            int iDp = AndroidUtilities.dp(24.0f);
            int color = Theme.getColor(null, i3, false);
            int color2 = Theme.getColor(null, Theme.key_featuredStickers_addButtonPressed, false);
            textView2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2));
            this.buttonTextView.setOnClickListener(new PollItemMenu$4$$ExternalSyntheticLambda0(this, 25));
            addView(this.buttonTextView, LayoutHelper.createFrame(-1, 48.0f, 80, 16.0f, 15.0f, 16.0f, 16.0f));
            setSticker();
        }

        public void lambda$new$0(View view) {
            if (SessionsActivity.this.getParentActivity() == null) {
                return;
            }
            if (Build.VERSION.SDK_INT < 23 || SessionsActivity.this.getParentActivity().checkSelfPermission("android.permission.CAMERA") == 0) {
                SessionsActivity.this.openCameraScanActivity();
            } else {
                SessionsActivity.this.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 34);
            }
        }

        private void setSticker() {
            TLRPC.TL_messages_stickerSet stickerSetByName = MediaDataController.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).getStickerSetByName("tg_placeholders_android");
            if (stickerSetByName == null) {
                stickerSetByName = MediaDataController.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).getStickerSetByEmojiOrName("tg_placeholders_android");
            }
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSetByName;
            TLRPC.Document document = (tL_messages_stickerSet == null || tL_messages_stickerSet.documents.size() <= 6) ? null : tL_messages_stickerSet.documents.get(6);
            SvgHelper.SvgDrawable svgThumb = document != null ? DocumentObject.getSvgThumb(document.thumbs, Theme.key_emptyListPlaceholder, 0.2f) : null;
            if (svgThumb != null) {
                svgThumb.overrideWidthAndHeight(512, 512);
            }
            if (document == null) {
                MediaDataController.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).loadStickersByEmojiOrName("tg_placeholders_android", false, tL_messages_stickerSet == null);
            } else {
                this.imageView.setImage(ImageLocation.getForDocument(document), "130_130", "tgs", svgThumb, tL_messages_stickerSet);
                this.imageView.getImageReceiver().setAutoRepeat(2);
            }
        }

        @Override
        public void didReceivedNotification(int i, int i2, Object... objArr) {
            if (i == NotificationCenter.diceStickersDidLoad && "tg_placeholders_android".equals((String) objArr[0])) {
                setSticker();
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            setSticker();
            NotificationCenter.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).addObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            NotificationCenter.getInstance(((BaseFragment) SessionsActivity.this).currentAccount).removeObserver(this, NotificationCenter.diceStickersDidLoad);
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(276.0f), 1073741824));
        }
    }

    public SessionsActivity(int i) {
        super(null);
        this.sessions = new ArrayList<>();
        this.passwordSessions = new ArrayList<>();
        this.bots = new ArrayList<>();
        this.repeatLoad = 0;
        this.VIEW_TYPE_TEXT = 0;
        this.VIEW_TYPE_INFO = 1;
        this.VIEW_TYPE_HEADER = 2;
        this.VIEW_TYPE_SESSION = 4;
        this.VIEW_TYPE_SCANQR = 5;
        this.VIEW_TYPE_SETTINGS = 6;
        this.currentType = i;
    }

    public static void lambda$createView$1(TLObject tLObject, TLRPC.TL_error tL_error) {
    }

    public void lambda$createView$10(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (getParentActivity() == null) {
            return;
        }
        if (tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.AllWebSessionsTerminated, BulletinFactory.of(this), R.raw.contact_check);
        } else {
            FactCheckController$$ExternalSyntheticOutline0.m(R.string.UnknownError, BulletinFactory.of(this), R.raw.error);
        }
        lambda$loadSessions$24(false);
    }

    public void lambda$createView$11(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda1(this, tL_error, tLObject, 0));
    }

    public void lambda$createView$12(AlertDialog alertDialog, int i) {
        if (this.currentType == 0) {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new SessionsActivity$$ExternalSyntheticLambda13(this, 2));
        } else {
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.resetWebAuthorizations(), new SessionsActivity$$ExternalSyntheticLambda13(this, 3));
        }
    }

    public void lambda$createView$13(int i) {
        this.bots.remove(i);
        updateRows();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public static void lambda$createView$14(boolean[] zArr, View view) {
        if (view.isEnabled()) {
            boolean z = !zArr[0];
            zArr[0] = z;
            ((CheckBoxCell) view).setChecked(z, true);
        }
    }

    public void lambda$createView$15(AlertDialog alertDialog, TLRPC.TL_error tL_error, TLRPC.TL_authorization tL_authorization) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tL_error == null) {
            this.sessions.remove(tL_authorization);
            this.passwordSessions.remove(tL_authorization);
            updateRows();
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
        }
    }

    public void lambda$createView$16(AlertDialog alertDialog, TLRPC.TL_authorization tL_authorization, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(24, this, alertDialog, tL_error, tL_authorization));
    }

    public void lambda$createView$17(AlertDialog alertDialog, TLRPC.TL_error tL_error, TLRPC.TL_webAuthorization tL_webAuthorization) {
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tL_error == null) {
            this.sessions.remove(tL_webAuthorization);
            updateRows();
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
        }
    }

    public void lambda$createView$18(AlertDialog alertDialog, TLRPC.TL_webAuthorization tL_webAuthorization, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new LinkManager$$ExternalSyntheticLambda23(23, this, alertDialog, tL_error, tL_webAuthorization));
    }

    public void lambda$createView$19(int i, boolean[] zArr, AlertDialog alertDialog, int i2) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog alertDialog2 = new AlertDialog(getParentActivity(), 3, null);
        alertDialog2.canCacnel = false;
        alertDialog2.show();
        if (this.currentType == 0) {
            int i3 = this.otherSessionsStartRow;
            TLRPC.TL_authorization tL_authorization = (i < i3 || i >= this.otherSessionsEndRow) ? (TLRPC.TL_authorization) this.passwordSessions.get(i - this.passwordSessionsStartRow) : (TLRPC.TL_authorization) this.sessions.get(i - i3);
            TL_account.resetAuthorization resetauthorization = new TL_account.resetAuthorization();
            resetauthorization.hash = tL_authorization.hash;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetauthorization, new ProfileActivity$$ExternalSyntheticLambda2(this, alertDialog2, tL_authorization, 9));
            return;
        }
        TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.sessions.get(i - this.otherSessionsStartRow);
        TL_account.resetWebAuthorization resetwebauthorization = new TL_account.resetWebAuthorization();
        resetwebauthorization.hash = tL_webAuthorization.hash;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(resetwebauthorization, new ProfileActivity$$ExternalSyntheticLambda2(this, alertDialog2, tL_webAuthorization, 10));
        if (zArr[0]) {
            MessagesController.getInstance(this.currentAccount).blockPeer(tL_webAuthorization.bot_id);
        }
    }

    public void lambda$createView$2(AlertDialog.Builder builder, View view) {
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
        TL_account.setAuthorizationTTL setauthorizationttl = new TL_account.setAuthorizationTTL();
        setauthorizationttl.authorization_ttl_days = i;
        this.ttlDays = i;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        getConnectionsManager().sendRequest(setauthorizationttl, new PassportActivity$$ExternalSyntheticLambda3(25));
    }

    public void lambda$createView$20(View view, int i) {
        CharSequence string;
        TLRPC.TL_authorization tL_authorization;
        ArrayList<TL_account.TL_connectedBot> arrayList;
        String string2;
        int i2;
        int i3 = 6;
        int i4 = 7;
        boolean z = true;
        int i5 = 0;
        if (i == this.ttlRow) {
            if (getParentActivity() == null) {
                return;
            }
            int i6 = this.ttlDays;
            if (i6 <= 7) {
                i2 = 0;
            } else if (i6 <= 93) {
                i2 = 1;
            } else {
                i2 = i6 <= 183 ? 2 : 3;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTitle(LocaleController.getString(R.string.SessionsSelfDestruct));
            String[] strArr = {LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 3, new Object[0]), LocaleController.formatPluralString("Months", 6, new Object[0]), LocaleController.formatPluralString("Years", 1, new Object[0])};
            LinearLayout linearLayout = new LinearLayout(getParentActivity());
            linearLayout.setOrientation(1);
            builder.setView(linearLayout);
            int i7 = 0;
            while (i7 < 4) {
                RadioColorCell radioColorCell = new RadioColorCell(getParentActivity(), null);
                radioColorCell.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
                radioColorCell.setTag(Integer.valueOf(i7));
                radioColorCell.radioButton.setColor(Theme.getColor(null, Theme.key_radioBackground, false), Theme.getColor(null, Theme.key_dialogRadioBackgroundChecked, false));
                radioColorCell.setTextAndValue(strArr[i7], i2 == i7);
                linearLayout.addView(radioColorCell);
                radioColorCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
                radioColorCell.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda91(25, this, builder));
                i7++;
            }
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.create());
            return;
        }
        if (i == this.terminateAllSessionsRow) {
            if (getParentActivity() == null) {
                return;
            }
            ArrayList<TL_account.TL_connectedBot> arrayList2 = this.bots;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                AlertDialog.Builder builder2 = new AlertDialog.Builder(getParentActivity(), 0, null);
                if (this.currentType == 0) {
                    builder2.setMessage(LocaleController.getString(R.string.AreYouSureSessions));
                    builder2.setTitle(LocaleController.getString(R.string.AreYouSureSessionsTitle));
                    string2 = LocaleController.getString(R.string.Terminate);
                } else {
                    builder2.setMessage(LocaleController.getString(R.string.AreYouSureWebSessions));
                    builder2.setTitle(LocaleController.getString(R.string.TerminateWebSessionsTitle));
                    string2 = LocaleController.getString(R.string.Disconnect);
                }
                builder2.setPositiveButton(string2, new SessionsActivity$$ExternalSyntheticLambda4(this, i5));
                builder2.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                AlertDialog alertDialogCreate = builder2.create();
                showDialog(alertDialogCreate);
                TextView textView = (TextView) alertDialogCreate.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
                    return;
                }
                return;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ArrayList<TL_account.TL_connectedBot> arrayList3 = this.bots;
            int size = arrayList3.size();
            int i8 = 0;
            while (i8 < size) {
                TL_account.TL_connectedBot tL_connectedBot = arrayList3.get(i8);
                i8++;
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_connectedBot.bot_id));
                if (user != null) {
                    String publicUsername = UserObject.getPublicUsername(user);
                    if (TextUtils.isEmpty(publicUsername)) {
                        spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                    } else {
                        if (spannableStringBuilder.length() > 0) {
                            spannableStringBuilder.append((CharSequence) ", ");
                        }
                        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder("@").append((CharSequence) publicUsername);
                        spannableStringBuilderAppend.setSpan(new URLSpanNoUnderline(zzii.m("https://t.me/", publicUsername)), 0, spannableStringBuilderAppend.length(), 33);
                        spannableStringBuilder.append((CharSequence) spannableStringBuilderAppend);
                    }
                }
            }
            AlertsCreator.showAlertWithCheckbox(getContext(), LocaleController.getString(R.string.AreYouSureSessionsTitle), LocaleController.getString(R.string.AreYouSureSessions), LocaleController.formatSpannable(R.string.AlsoTerminateChatbot, spannableStringBuilder), LocaleController.getString(R.string.Terminate), new SessionsActivity$$ExternalSyntheticLambda3(this, i5), this.resourceProvider);
            return;
        }
        if (i >= this.botSessionsStartRow && i < this.botSessionsEndRow) {
            if (getParentActivity() == null || (arrayList = this.bots) == null || arrayList.isEmpty()) {
                return;
            }
            int i9 = i - this.botSessionsStartRow;
            new ChatbotSheet(getContext(), this.bots.get(i9), new OAuthSheet$$ExternalSyntheticLambda6(this, i9, 24), this.resourceProvider).show();
            return;
        }
        if (((i < this.otherSessionsStartRow || i >= this.otherSessionsEndRow) && ((i < this.passwordSessionsStartRow || i >= this.passwordSessionsEndRow) && i != this.currentSessionRow)) || getParentActivity() == null) {
            return;
        }
        if (this.currentType == 0) {
            if (i == this.currentSessionRow) {
                tL_authorization = this.currentSession;
            } else {
                int i10 = this.otherSessionsStartRow;
                tL_authorization = (i < i10 || i >= this.otherSessionsEndRow) ? (TLRPC.TL_authorization) this.passwordSessions.get(i - this.passwordSessionsStartRow) : (TLRPC.TL_authorization) this.sessions.get(i - i10);
                z = false;
            }
            showSessionBottomSheet(tL_authorization, z);
            return;
        }
        AlertDialog.Builder builder3 = new AlertDialog.Builder(getParentActivity(), 0, null);
        boolean[] zArr = new boolean[1];
        if (this.currentType == 0) {
            builder3.setMessage(LocaleController.getString(R.string.TerminateSessionText));
            builder3.setTitle(LocaleController.getString(R.string.AreYouSureSessionTitle));
            string = LocaleController.getString(R.string.Terminate);
        } else {
            TLRPC.TL_webAuthorization tL_webAuthorization = (TLRPC.TL_webAuthorization) this.sessions.get(i - this.otherSessionsStartRow);
            builder3.setMessage(LocaleController.formatString("TerminateWebSessionText", R.string.TerminateWebSessionText, tL_webAuthorization.domain));
            builder3.setTitle(LocaleController.getString(R.string.TerminateWebSessionTitle));
            CharSequence string3 = LocaleController.getString(R.string.Disconnect);
            FrameLayout frameLayout = new FrameLayout(getParentActivity());
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(tL_webAuthorization.bot_id));
            String firstName = user2 != null ? UserObject.getFirstName(user2) : "";
            CheckBoxCell checkBoxCell = new CheckBoxCell(getParentActivity(), 1);
            checkBoxCell.setBackgroundDrawable(Theme.getSelectorDrawable(false));
            checkBoxCell.setText(LocaleController.formatString("TerminateWebSessionStop", R.string.TerminateWebSessionStop, firstName), "", false, false, false);
            checkBoxCell.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(8.0f), 0, LocaleController.isRTL ? AndroidUtilities.dp(8.0f) : AndroidUtilities.dp(16.0f), 0);
            frameLayout.addView(checkBoxCell, LayoutHelper.createFrame(-1, 48.0f, 51, 0.0f, 0.0f, 0.0f, 0.0f));
            checkBoxCell.setOnClickListener(new PhotoViewer$16$$ExternalSyntheticLambda5(zArr, i3));
            builder3.setCustomViewOffset(16);
            builder3.setView(frameLayout);
            string = string3;
        }
        builder3.setPositiveButton(string, new ChatActivity$$ExternalSyntheticLambda437(this, i, zArr, i4));
        builder3.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
        AlertDialog alertDialogCreate2 = builder3.create();
        showDialog(alertDialogCreate2);
        TextView textView2 = (TextView) alertDialogCreate2.getButton(-1);
        if (textView2 != null) {
            textView2.setTextColor(Theme.getColor(null, Theme.key_text_RedBold, false));
        }
    }

    public void lambda$createView$3() {
        BusinessChatbotController businessChatbotController = BusinessChatbotController.getInstance(this.currentAccount);
        businessChatbotController.loaded = false;
        businessChatbotController.load(null);
    }

    public void lambda$createView$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new MainTabsLayout$$ExternalSyntheticLambda0(this, 27));
    }

    public void lambda$createView$5(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.AllSessionsTerminated)).show();
            lambda$loadSessions$24(false);
        }
    }

    public void lambda$createView$6(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda1(this, tL_error, tLObject, 2));
        for (int i = 0; i < 4; i++) {
            UserConfig userConfig = UserConfig.getInstance(i);
            if (userConfig.isClientActivated()) {
                userConfig.registeredForPush = false;
                userConfig.saveConfig(false);
                MessagesController.getInstance(i).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                ConnectionsManager.getInstance(i).setUserId(userConfig.getClientUserId());
            }
        }
    }

    public void lambda$createView$7(Boolean bool) {
        ArrayList<TL_account.TL_connectedBot> arrayList;
        if (bool != null && bool.booleanValue() && (arrayList = this.bots) != null && !arrayList.isEmpty()) {
            TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
            updateconnectedbot.bot = MessagesController.getInstance(this.currentAccount).getInputUser(this.bots.get(0).bot_id);
            updateconnectedbot.deleted = true;
            updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(updateconnectedbot, new SessionsActivity$$ExternalSyntheticLambda13(this, 0));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TLRPC.TL_auth_resetAuthorizations(), new SessionsActivity$$ExternalSyntheticLambda13(this, 1));
    }

    public void lambda$createView$8(TLRPC.TL_error tL_error, TLObject tLObject) {
        if (getParentActivity() != null && tL_error == null && (tLObject instanceof TLRPC.TL_boolTrue)) {
            BulletinFactory.of(this).createSimpleBulletin(R.raw.contact_check, LocaleController.getString(R.string.AllSessionsTerminated)).show();
            lambda$loadSessions$24(false);
        }
    }

    public void lambda$createView$9(TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda1(this, tL_error, tLObject, 1));
        for (int i = 0; i < 4; i++) {
            UserConfig userConfig = UserConfig.getInstance(i);
            if (userConfig.isClientActivated()) {
                userConfig.registeredForPush = false;
                userConfig.saveConfig(false);
                MessagesController.getInstance(i).registerForPush(SharedConfig.pushType, SharedConfig.pushString);
                ConnectionsManager.getInstance(i).setUserId(userConfig.getClientUserId());
            }
        }
    }

    public void lambda$loadSessions$22(TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.loading = false;
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.getItemCount();
        }
        if (tL_error == null) {
            this.sessions.clear();
            this.passwordSessions.clear();
            TL_account.authorizations authorizationsVar = (TL_account.authorizations) tLObject;
            int size = authorizationsVar.authorizations.size();
            for (int i = 0; i < size; i++) {
                TLRPC.TL_authorization tL_authorization = authorizationsVar.authorizations.get(i);
                if ((tL_authorization.flags & 1) != 0) {
                    this.currentSession = tL_authorization;
                } else if (tL_authorization.password_pending) {
                    this.passwordSessions.add(tL_authorization);
                } else {
                    this.sessions.add(tL_authorization);
                }
            }
            this.ttlDays = authorizationsVar.authorization_ttl_days;
            updateRows();
            Delegate delegate = this.delegate;
            if (delegate != null) {
                delegate.sessionsLoaded();
            }
        }
        ListAdapter listAdapter2 = this.listAdapter;
        if (listAdapter2 != null) {
            listAdapter2.notifyDataSetChanged();
        }
        Delegate delegate2 = this.delegate;
        if (delegate2 != null) {
            delegate2.sessionsLoaded();
        }
        int i2 = this.repeatLoad;
        if (i2 > 0) {
            int i3 = i2 - 1;
            this.repeatLoad = i3;
            if (i3 > 0) {
                AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda20(this, z, 1), 2500L);
            }
        }
    }

    public void lambda$loadSessions$23(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda17(this, tL_error, tLObject, z, 0));
    }

    public void lambda$loadSessions$25(TLRPC.TL_error tL_error, TLObject tLObject, boolean z) {
        this.loading = false;
        if (tL_error == null) {
            this.sessions.clear();
            TL_account.webAuthorizations webauthorizations = (TL_account.webAuthorizations) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(webauthorizations.users, false);
            this.sessions.addAll(webauthorizations.authorizations);
            updateRows();
        }
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
        Delegate delegate = this.delegate;
        if (delegate != null) {
            delegate.sessionsLoaded();
        }
        int i = this.repeatLoad;
        if (i > 0) {
            int i2 = i - 1;
            this.repeatLoad = i2;
            if (i2 > 0) {
                AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda20(this, z, 0), 2500L);
            }
        }
    }

    public void lambda$loadSessions$26(boolean z, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new SessionsActivity$$ExternalSyntheticLambda17(this, tL_error, tLObject, z, 1));
    }

    public void lambda$onFragmentCreate$0(TL_account.connectedBots connectedbots) {
        if (connectedbots == null) {
            return;
        }
        this.bots = connectedbots.connected_bots;
        if (this.listAdapter != null) {
            updateRows();
            this.listAdapter.notifyDataSetChanged();
        }
    }

    public void lambda$onRequestPermissionsResultFragment$27(AlertDialog alertDialog, int i) {
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void openCameraScanActivity() {
        CameraScanActivity.showAsSheet((BaseFragment) this, false, 2, (CameraScanActivity.CameraScanActivityDelegate) new AnonymousClass6());
    }

    private void showSessionBottomSheet(TLRPC.TL_authorization tL_authorization, boolean z) {
        if (tL_authorization == null) {
            return;
        }
        new SessionBottomSheet(this, tL_authorization, z, new AnonymousClass5()).show();
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
        this.botSessionsStartRow = -1;
        this.botSessionsEndRow = -1;
        this.otherSessionsTerminateDetail = -1;
        this.noOtherSessionsRow = -1;
        this.qrCodeRow = -1;
        this.qrCodeDividerRow = -1;
        this.ttlHeaderRow = -1;
        this.ttlRow = -1;
        this.ttlDivideRow = -1;
        if (this.currentType == 0 && getMessagesController().qrLoginCamera) {
            int i = this.rowCount;
            this.qrCodeRow = i;
            this.rowCount = i + 2;
            this.qrCodeDividerRow = i + 1;
        }
        if (this.loading) {
            if (this.currentType == 0) {
                int i2 = this.rowCount;
                this.currentSessionSectionRow = i2;
                this.rowCount = i2 + 2;
                this.currentSessionRow = i2 + 1;
                return;
            }
            return;
        }
        if (this.currentSession != null) {
            int i3 = this.rowCount;
            this.currentSessionSectionRow = i3;
            this.rowCount = i3 + 2;
            this.currentSessionRow = i3 + 1;
        }
        if (this.passwordSessions.isEmpty() && this.sessions.isEmpty()) {
            this.terminateAllSessionsRow = -1;
            this.terminateAllSessionsDetailRow = -1;
            if (this.currentType == 1 || this.currentSession != null) {
                int i4 = this.rowCount;
                this.rowCount = i4 + 1;
                this.noOtherSessionsRow = i4;
            } else {
                this.noOtherSessionsRow = -1;
            }
        } else {
            int i5 = this.rowCount;
            this.terminateAllSessionsRow = i5;
            this.rowCount = i5 + 2;
            this.terminateAllSessionsDetailRow = i5 + 1;
            this.noOtherSessionsRow = -1;
        }
        if (!this.passwordSessions.isEmpty()) {
            int i6 = this.rowCount;
            int i7 = i6 + 1;
            this.rowCount = i7;
            this.passwordSessionsSectionRow = i6;
            this.passwordSessionsStartRow = i7;
            int size = this.passwordSessions.size() + i7;
            this.passwordSessionsEndRow = size;
            this.rowCount = size + 1;
            this.passwordSessionsDetailRow = size;
        }
        if (this.sessions.isEmpty()) {
            ArrayList<TL_account.TL_connectedBot> arrayList = this.bots;
            if (arrayList != null && !arrayList.isEmpty()) {
                int i8 = this.rowCount;
                int i9 = i8 + 1;
                this.rowCount = i9;
                this.otherSessionsSectionRow = i8;
                this.botSessionsStartRow = i9;
                int size2 = this.bots.size() + i9;
                this.botSessionsEndRow = size2;
                this.rowCount = size2 + 1;
                this.otherSessionsTerminateDetail = size2;
            }
        } else {
            int i10 = this.rowCount;
            this.rowCount = i10 + 1;
            this.otherSessionsSectionRow = i10;
            ArrayList<TL_account.TL_connectedBot> arrayList2 = this.bots;
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                int i11 = this.rowCount;
                this.botSessionsStartRow = i11;
                int size3 = this.bots.size() + i11;
                this.rowCount = size3;
                this.botSessionsEndRow = size3;
            }
            int i12 = this.rowCount;
            this.otherSessionsStartRow = i12;
            this.otherSessionsEndRow = this.sessions.size() + i12;
            int size4 = this.sessions.size() + this.rowCount;
            this.rowCount = size4 + 1;
            this.otherSessionsTerminateDetail = size4;
        }
        if (this.ttlDays > 0) {
            int i13 = this.rowCount;
            this.ttlHeaderRow = i13;
            this.ttlRow = i13 + 1;
            this.rowCount = i13 + 3;
            this.ttlDivideRow = i13 + 2;
        }
    }

    @Override
    public View createView(Context context) {
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context);
        this.globalFlickerLoadingView = flickerLoadingView;
        int i = 1;
        flickerLoadingView.setIsSingleCell(true);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (this.currentType == 0) {
            this.actionBar.setTitle(LocaleController.getString(R.string.Devices));
        } else {
            this.actionBar.setTitle(LocaleController.getString(R.string.WebSessionsTitle));
        }
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    SessionsActivity.this.finishFragment();
                }
            }
        });
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isRightLayout) {
            this.actionBar.setBackButtonImage(R.drawable.ic_ab_close);
        }
        this.listAdapter = new ListAdapter(context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundGray, false));
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showProgress();
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1, 17));
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            @Override
            public Integer getSelectorColor(int i2) {
                return i2 == SessionsActivity.this.terminateAllSessionsRow ? Integer.valueOf(Theme.multAlpha(0.1f, getThemedColor(Theme.key_text_RedRegular))) : Integer.valueOf(getThemedColor(Theme.key_listSelector));
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setSections();
        this.actionBar.setAdaptiveBackground(this.listView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, i, false) {
            {
                super(i, z);
            }

            @Override
            public boolean supportsPredictiveItemAnimations() {
                return true;
            }
        });
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setAnimateEmptyView(true, 0);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setAdapter(this.listAdapter);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(150L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.DEFAULT;
        defaultItemAnimator.setMoveInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setTranslationInterpolator(cubicBezierInterpolator);
        this.listView.lambda$onCellEnter$52(defaultItemAnimator);
        this.listView.setOnItemClickListener(new TopicsFragment$$ExternalSyntheticLambda11(this, 8));
        if (this.currentType == 0) {
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(context);
            this.undoView = anonymousClass4;
            frameLayout.addView(anonymousClass4, LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        updateRows();
        return this.fragmentView;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.newSessionReceived) {
            lambda$loadSessions$24(true);
        }
    }

    public int getSessionsCount() {
        if (this.sessions.size() == 0 && this.loading) {
            return 0;
        }
        return this.sessions.size() + (this.currentType == 0 ? 1 : 0);
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, 16, new Class[]{TextSettingsCell.class, HeaderCell.class, SessionCell.class}, null, null, null, Theme.key_windowBackgroundWhite));
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_actionBarDefault));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.emptyView, 2048, null, null, null, null, Theme.key_progressCircle));
        int i = Theme.key_text_RedRegular;
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 262148, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueText4));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{TextInfoPrivacyCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextInfoPrivacyCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlueHeader));
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{SessionCell.class}, new String[]{"onlineTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        int i3 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{SessionCell.class}, new String[]{"onlineTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"detailTextView"}, null, null, -1, null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SessionCell.class}, new String[]{"detailExTextView"}, null, null, -1, null, i3));
        arrayList.add(new ThemeDescription(this.undoView, 32, null, null, null, null, Theme.key_undo_background));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i));
        int i4 = Theme.key_undo_infoColor;
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i4));
        arrayList.add(new ThemeDescription(this.undoView, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, -1, null, i4));
        return arrayList;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    public void lambda$loadSessions$24(final boolean z) {
        if (this.loading) {
            return;
        }
        if (!z) {
            this.loading = true;
        }
        if (this.currentType == 0) {
            final int i = 0;
            ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getAuthorizations(), new RequestDelegate(this) {
                public final SessionsActivity f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$loadSessions$23(z, tLObject, tL_error);
                            break;
                        default:
                            this.f$0.lambda$loadSessions$26(z, tLObject, tL_error);
                            break;
                    }
                }
            }), this.classGuid);
            return;
        }
        final int i2 = 1;
        ConnectionsManager.getInstance(this.currentAccount).bindRequestToGuid(ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getWebAuthorizations(), new RequestDelegate(this) {
            public final SessionsActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                switch (i2) {
                    case 0:
                        this.f$0.lambda$loadSessions$23(z, tLObject, tL_error);
                        break;
                    default:
                        this.f$0.lambda$loadSessions$26(z, tLObject, tL_error);
                        break;
                }
            }
        }), this.classGuid);
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.hide(true, 0);
        }
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        updateRows();
        lambda$loadSessions$24(false);
        if (this.currentType == 0) {
            BusinessChatbotController.getInstance(this.currentAccount).load(new SessionsActivity$$ExternalSyntheticLambda3(this, 1));
        }
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.newSessionReceived);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.newSessionReceived);
    }

    @Override
    public void onInsets(int i, int i2, int i3, int i4) {
        this.listView.setPadding(0, 0, 0, i4);
        this.listView.setClipToPadding(false);
        UndoView undoView = this.undoView;
        if (undoView != null) {
            undoView.setTranslationY(-i4);
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
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (getParentActivity() != null && i == 34) {
            if (iArr.length <= 0 || iArr[0] != 0) {
                new AlertDialog.Builder(getParentActivity(), 0, null).setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.QRCodePermissionNoCameraWithHint))).setPositiveButton(LocaleController.getString(R.string.PermissionOpenSettings), new SessionsActivity$$ExternalSyntheticLambda4(this, 1)).setNegativeButton(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null).setTopAnimation(R.raw.permission_request_camera, 72, false, Theme.getColor(null, Theme.key_dialogTopBackground, false)).show();
            } else {
                openCameraScanActivity();
            }
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
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        super.onTransitionAnimationEnd(z, z2);
        if (!z || z2) {
            return;
        }
        this.fragmentOpened = true;
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof ScanQRCodeView) {
                ((ScanQRCodeView) childAt).buttonTextView.invalidate();
            }
        }
    }

    public void setDelegate(Delegate delegate) {
        this.delegate = delegate;
    }

    public SessionsActivity setHighlightLinkDesktopDevice() {
        this.highlightLinkDesktopDevice = true;
        return this;
    }
}
