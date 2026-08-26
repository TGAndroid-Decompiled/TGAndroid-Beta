package org.telegram.ui;

import android.graphics.Paint;
import android.view.MotionEvent;
import android.view.View;
import java.util.HashSet;
import java.util.List;
import java.util.regex.Pattern;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.Cells.DialogsEmptyCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AudioPlayerAlert;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlertDocumentLayout;
import org.telegram.ui.Components.ChatAttachAlertLocationLayout;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.EmbedBottomSheet;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.PasscodeView;
import org.telegram.ui.Components.ProximitySheet;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.ShareAlert;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stories.bots.BotPreviewsEditContainer;

public final class ArticleViewer$$ExternalSyntheticLambda23 implements View.OnTouchListener {
    public final int $r8$classId;

    public ArticleViewer$$ExternalSyntheticLambda23(int i) {
        this.$r8$classId = i;
    }

    @Override
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$r8$classId) {
            case 0:
                HashSet hashSet = ArticleViewer.activeSheets;
                return true;
            case 1:
                return BottomSheet.lambda$onCreateInternal$3(view, motionEvent);
            case 3:
                int i = CallLogActivity.EmptyTextProgressView.$r8$clinit;
            case 2:
                return true;
            case 4:
                int i2 = DialogsEmptyCell.$r8$clinit;
                return true;
            case 5:
                Paint paint = ChangeUsernameActivity.linkBackgroundActive;
                return true;
            case 6:
                int i3 = ChannelAdminLogActivity.lastStableId;
                return true;
            case 7:
                int i4 = ChatActivity.SKELETON_LIGHT_OVERLAY_ALPHA;
                return true;
            case 9:
                Pattern pattern = AlertsCreator.URL_PATTERN;
            case 8:
                return true;
            case 10:
                AudioPlayerAlert audioPlayerAlert = AudioPlayerAlert.instance;
                return true;
            case 11:
                int i5 = ChatActivityEnterView.$r8$clinit;
                return true;
            case 12:
                int i6 = ChatAttachAlert.$r8$clinit;
                return true;
            case 13:
                int i7 = ChatAttachAlertDocumentLayout.$r8$clinit;
                return true;
            case 14:
                int i8 = ChatAttachAlertLocationLayout.$r8$clinit;
                return true;
            case 15:
                int i9 = ChatThemeBottomSheet.$r8$clinit;
                return true;
            case 16:
                EmbedBottomSheet embedBottomSheet = EmbedBottomSheet.instance;
                return true;
            case 17:
                int i10 = EmptyTextProgressView.$r8$clinit;
                return true;
            case 18:
                int[] iArr = PasscodeView.ids;
                return true;
            case 19:
                int i11 = ProximitySheet.$r8$clinit;
                return true;
            case 20:
                int i12 = SearchViewPager.$r8$clinit;
                return true;
            case 21:
                int i13 = ShareAlert.$r8$clinit;
                return true;
            case 22:
                int[] iArr2 = SharedMediaLayout.supportedFastScrollTypes;
                return true;
            case 23:
                int i14 = StickersAlert.$r8$clinit;
                return true;
            case 24:
                int i15 = UndoView.$r8$clinit;
                return true;
            case 25:
                int i16 = UndoView.$r8$clinit;
                return true;
            case 26:
                int i17 = NewContactBottomSheet.$r8$clinit;
                return true;
            case 27:
                List list = PaymentFormActivity.WEBVIEW_PROTOCOLS;
                return true;
            case 28:
                int i18 = PopupNotificationActivity.$r8$clinit;
                return true;
            default:
                int i19 = BotPreviewsEditContainer.BotPreviewsEditLangContainer.$r8$clinit;
                return true;
        }
    }
}
