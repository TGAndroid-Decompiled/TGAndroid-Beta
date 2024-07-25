package org.telegram.ui.Components.Premium;
class DoubledLimitsBottomSheet$Limit {
    final int defaultLimit;
    final int premiumLimit;
    final String subtitle;
    final String title;
    public int yOffset;

    public DoubledLimitsBottomSheet$Limit(String str, String str2, int i, int i2, DoubledLimitsBottomSheet$1 doubledLimitsBottomSheet$1) {
        this(str, str2, i, i2);
    }

    private DoubledLimitsBottomSheet$Limit(String str, String str2, int i, int i2) {
        this.title = str;
        this.subtitle = str2;
        this.defaultLimit = i;
        this.premiumLimit = i2;
    }
}
