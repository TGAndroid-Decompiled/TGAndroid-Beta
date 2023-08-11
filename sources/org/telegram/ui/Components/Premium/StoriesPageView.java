package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.FixedHeightEmptyCell;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.GradientTools;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.StoriesPageView;
import org.telegram.ui.Components.RecyclerListView;
public class StoriesPageView extends BaseListPageView {
    RecyclerListView.SelectionAdapter adapter;
    Bitmap bitmap;
    ArrayList<Item> items;

    public StoriesPageView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, resourcesProvider);
        this.items = new ArrayList<>();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Item(this, 1, R.drawable.msg_stories_order, LocaleController.getString("PremiumStoriesPriority", R.string.PremiumStoriesPriority), LocaleController.getString("PremiumStoriesPriorityDescription", R.string.PremiumStoriesPriorityDescription), 20));
        arrayList.add(new Item(this, 1, R.drawable.msg_stories_stealth, LocaleController.getString("PremiumStoriesStealth", R.string.PremiumStoriesStealth), LocaleController.getString("PremiumStoriesStealthDescription", R.string.PremiumStoriesStealthDescription), 15));
        arrayList.add(new Item(this, 1, R.drawable.msg_stories_views, LocaleController.getString("PremiumStoriesViews", R.string.PremiumStoriesViews), LocaleController.getString("PremiumStoriesViewsDescription", R.string.PremiumStoriesViewsDescription), 16));
        arrayList.add(new Item(this, 1, R.drawable.msg_stories_timer, LocaleController.getString("PremiumStoriesExpiration", R.string.PremiumStoriesExpiration), LocaleController.getString("PremiumStoriesExpirationDescription", R.string.PremiumStoriesExpirationDescription), 17));
        arrayList.add(new Item(this, 1, R.drawable.msg_stories_save, LocaleController.getString("PremiumStoriesSaveToGallery", R.string.PremiumStoriesSaveToGallery), LocaleController.getString("PremiumStoriesSaveToGalleryDescription", R.string.PremiumStoriesSaveToGalleryDescription), 18));
        arrayList.add(new Item(this, 1, R.drawable.msg_stories_caption, LocaleController.getString("PremiumStoriesCaption", R.string.PremiumStoriesCaption), LocaleController.getString("PremiumStoriesCaptionDescription", R.string.PremiumStoriesCaptionDescription), 21));
        arrayList.add(new Item(this, 1, R.drawable.msg_stories_link, LocaleController.getString("PremiumStoriesFormatting", R.string.PremiumStoriesFormatting), LocaleController.getString("PremiumStoriesFormattingDescription", R.string.PremiumStoriesFormattingDescription), 19));
        final MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        Collections.sort(arrayList, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$new$0;
                lambda$new$0 = StoriesPageView.lambda$new$0(MessagesController.this, (StoriesPageView.Item) obj, (StoriesPageView.Item) obj2);
                return lambda$new$0;
            }
        });
        this.items.add(new Item(0));
        this.items.addAll(arrayList);
        this.items.add(new Item(2));
        this.bitmap = Bitmap.createBitmap(this.items.size(), 1, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(this.bitmap);
        Paint paint = new Paint();
        paint.setShader(new LinearGradient(0.0f, 0.0f, this.bitmap.getWidth(), 0.0f, new int[]{Theme.getColor(Theme.key_premiumGradient1), Theme.getColor(Theme.key_premiumGradient2), Theme.getColor(Theme.key_premiumGradient3), Theme.getColor(Theme.key_premiumGradient4)}, (float[]) null, Shader.TileMode.CLAMP));
        canvas.drawRect(0.0f, 0.0f, this.bitmap.getWidth(), this.bitmap.getHeight(), paint);
    }

    public static int lambda$new$0(MessagesController messagesController, Item item, Item item2) {
        return messagesController.premiumFeaturesTypesToPosition.get(item.order, ConnectionsManager.DEFAULT_DATACENTER_ID) - messagesController.premiumFeaturesTypesToPosition.get(item2.order, ConnectionsManager.DEFAULT_DATACENTER_ID);
    }

    @Override
    public RecyclerView.Adapter createAdapter() {
        RecyclerListView.SelectionAdapter selectionAdapter = new RecyclerListView.SelectionAdapter() {
            @Override
            public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
                return false;
            }

            @Override
            public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                View itemCell;
                if (i == 0) {
                    StoriesPageView storiesPageView = StoriesPageView.this;
                    itemCell = new HeaderView(storiesPageView, storiesPageView.getContext());
                } else if (i == 2) {
                    itemCell = new FixedHeightEmptyCell(StoriesPageView.this.getContext(), 16);
                } else {
                    StoriesPageView storiesPageView2 = StoriesPageView.this;
                    itemCell = new ItemCell(storiesPageView2, storiesPageView2.getContext());
                }
                itemCell.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                return new RecyclerListView.Holder(itemCell);
            }

            @Override
            public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                if (StoriesPageView.this.items.get(i).viewType == 1) {
                    ItemCell itemCell = (ItemCell) viewHolder.itemView;
                    itemCell.imageView.setColorFilter(new PorterDuffColorFilter(StoriesPageView.this.bitmap.getPixel(i, 0), PorterDuff.Mode.MULTIPLY));
                    itemCell.imageView.setImageDrawable(ContextCompat.getDrawable(StoriesPageView.this.getContext(), StoriesPageView.this.items.get(i).iconRes));
                    itemCell.textView.setText(StoriesPageView.this.items.get(i).text);
                    itemCell.description.setText(StoriesPageView.this.items.get(i).description);
                }
            }

            @Override
            public int getItemViewType(int i) {
                return StoriesPageView.this.items.get(i).viewType;
            }

            @Override
            public int getItemCount() {
                return StoriesPageView.this.items.size();
            }
        };
        this.adapter = selectionAdapter;
        return selectionAdapter;
    }

    public class Item {
        String description;
        int iconRes;
        int order;
        String text;
        final int viewType;

        private Item(StoriesPageView storiesPageView, int i) {
            this.viewType = i;
        }

        public Item(StoriesPageView storiesPageView, int i, int i2, String str, String str2, int i3) {
            this.viewType = i;
            this.iconRes = i2;
            this.text = str;
            this.description = str2;
            this.order = i3;
        }
    }

    private class HeaderView extends FrameLayout {
        GradientTools gradientTools;
        BackupImageView imageView;

        public HeaderView(StoriesPageView storiesPageView, Context context) {
            super(context);
            this.gradientTools = new GradientTools();
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setRoundRadius((int) (AndroidUtilities.dp(65.0f) / 2.0f));
            addView(this.imageView, LayoutHelper.createFrame(65, 65.0f, 1, 0.0f, 32.0f, 0.0f, 0.0f));
            TLRPC$User currentUser = UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser();
            AvatarDrawable avatarDrawable = new AvatarDrawable();
            avatarDrawable.setInfo(currentUser);
            this.imageView.getImageReceiver().setForUserOrChat(currentUser, avatarDrawable);
            TextView textView = new TextView(context);
            textView.setTextSize(1, 20.0f);
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, storiesPageView.resourcesProvider));
            textView.setText(LocaleController.getString("UpgradedStories", R.string.UpgradedStories));
            addView(textView, LayoutHelper.createFrame(-2, -2.0f, 1, 0.0f, 111.0f, 0.0f, 0.0f));
            GradientTools gradientTools = this.gradientTools;
            gradientTools.isLinear = true;
            gradientTools.isDiagonal = true;
            gradientTools.setColors(Theme.getColor(Theme.key_premiumGradient2), Theme.getColor(Theme.key_premiumGradient1));
            this.gradientTools.paint.setStyle(Paint.Style.STROKE);
            this.gradientTools.paint.setStrokeCap(Paint.Cap.ROUND);
            this.gradientTools.paint.setStrokeWidth(AndroidUtilities.dpf2(3.3f));
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            BackupImageView backupImageView = this.imageView;
            Rect rect = AndroidUtilities.rectTmp2;
            backupImageView.getHitRect(rect);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            rectF.inset(-AndroidUtilities.dp(5.0f), -AndroidUtilities.dp(5.0f));
            this.gradientTools.setBounds(rectF);
            float f = 360.0f / 7;
            for (int i = 0; i < 7; i++) {
                float f2 = (i * f) - 90.0f;
                float f3 = 5;
                float f4 = f2 + f3;
                canvas.drawArc(AndroidUtilities.rectTmp, f4, ((f2 + f) - f3) - f4, false, this.gradientTools.paint);
            }
            super.dispatchDraw(canvas);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(150.0f), 1073741824));
        }
    }

    private class ItemCell extends FrameLayout {
        TextView description;
        ImageView imageView;
        TextView textView;

        public ItemCell(StoriesPageView storiesPageView, Context context) {
            super(context);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            addView(this.imageView, LayoutHelper.createFrame(28, 28.0f, 0, 25.0f, 12.0f, 16.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, storiesPageView.resourcesProvider));
            this.textView.setTextSize(1, 14.0f);
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 8.0f, 16.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.description = textView2;
            textView2.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, storiesPageView.resourcesProvider));
            this.description.setTextSize(1, 14.0f);
            addView(this.description, LayoutHelper.createFrame(-1, -2.0f, 0, 68.0f, 28.0f, 16.0f, 8.0f));
        }
    }
}
